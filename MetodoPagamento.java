public abstract class MetodoPagamento {
    private double valor;
    public String formaPagamento; //formaPagamento = cartao de credito, debito, pix....

    //construtor
    public MetodoPagamento(double valor, String formaPagamento) {
        this.valor = valor;
        this.formaPagamento = formaPagamento;
    }

    //get
    public double getValor(){
        return valor;}

    public String getFormaPagamento(){
        return formaPagamento;}

    //metodos
    public void exibirResumoPagamento() {
        System.out.println("Forma de Pagamento: " + formaPagamento);
        System.out.println("Valor: R$" + valor);
    }

    public abstract void processarPagamento();
}
