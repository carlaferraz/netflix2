public class Aluguel extends MetodoPagamento{
    private int diasAluguel;

    public Aluguel(double valor, String formaPagamento, int diasAluguel){
        super(valor, formaPagamento);
        this.diasAluguel = diasAluguel;
    }

    //get
    public int getDiasAluguel(){return diasAluguel;}

    //metodos
    public void exibirResumoAluguel() {
    }

    @Override
    public void processarPagamento() {
        System.out.println("Resumo do Aluguel:");
        System.out.println("Dias de Aluguel: " + diasAluguel);
        System.out.println("Forma de Pagamento: " + getFormaPagamento());
        System.out.println("Valor Total: R$ " + getValor());
    }

}
