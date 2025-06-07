public abstract class MetodoPagamento {
    private double valor;
    public String formaPagamento; //formaPagamento = cartao de credito, debito, pix....

    //construtor
    public MetodoPagamento(double valor, String formaPagamento) {
        this.valor = valor;
        this.formaPagamento = formaPagamento;
    }

    //get
    public double getValor(){return valor;}
    public String getFormaPagamento(){return formaPagamento;}

    //metodos
    //GABIII VOCE AQUI OMGGG AGAIN
    //reescreve o metodo aqui blz diva
    public abstract void processarPagamento();
}
