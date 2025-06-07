public class Compra extends MetodoPagamento{
    private String tipo; // tipo = a vista ou parcelado
    private boolean isAVista;
    private double desconto;
    private boolean isParcelado;
    private int numeroParcelas;
    //miga, esses ultimos 4 atributos eu coloquei pq pensei em uma logica pra metodos tipo assim
    //se a pessoa pagar a vista (True) ela recebe um desconto (double)
    //se a pessoa pagar parcelado (True) ela escolhe o numero de parcelas (int)
    //se vc ver que nos metodos n vai precisar de algum desses atributos pode apagar ok

    //construtor
    public Compra(double valor, String formaPagamento, String tipo, boolean isAVista, double desconto, boolean isParcelado, int numeroParcelas){
        super(valor, formaPagamento);
        this.tipo = tipo;
        this.isAVista = isAVista;
        this.desconto = desconto;
        this.isParcelado = isParcelado;
        this.numeroParcelas = numeroParcelas;
    }

    //gets
    public String getTipo(){return tipo;}
    public boolean getIsAVista(){return isAVista;}
    public double getDesconto(){return desconto;}
    public boolean getIsParcelado(){return isParcelado;}
    public int getNumeroParcelas(){return numeroParcelas;}


    //GABIIII OMG VOCE AQUI DE NOVO! :O
    //reescrever esse cocozildo
    @Override
    public void processarPagamento() {
        System.out.print("Processando pagamento de compra ");
        if (isParcelado) {
            // aqui seria a msm coisa q if(isParcelado)==true
            // lembra que quando algo é true nao precisa colocar "==true"
            System.out.println("parcelada.");
        } else {
            System.out.println("à vista.");
        }
        System.out.println("Valor total: R$ " + getValor());

    }
}
