public class Aluguel extends MetodoPagamento{
    private int diasAluguel;

    public Aluguel(double valor, String formaPagamento, int diasAluguel){
        super(valor, formaPagamento);
        this.diasAluguel = diasAluguel;
    }

    //get
    public int getDiasAluguel(){return diasAluguel;}

    //metodos
    //GABIIIIIIIIIII USTED ACÁ CHICA HERMOSA
    //reescreveeeeeerrrrrrrrrrrrrrrr s2s2s2
    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento de aluguel para " + diasAluguel + " dias. Valor total: R$ " + getValor() + ". Pagamento em: " + getFormaPagamento());
    }
}
