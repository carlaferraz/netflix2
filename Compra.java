public class Compra extends MetodoPagamento {
    private String tipo; // tipo = a vista ou parcelado
    private boolean isAVista;
    private double desconto;
    private boolean isParcelado;
    private int numeroParcelas;

    public Compra(double valor, String formaPagamento, String tipo, boolean isAVista, double desconto, boolean isParcelado, int numeroParcelas) {
        super(valor, formaPagamento);
        this.tipo = tipo;
        this.isAVista = isAVista;
        this.desconto = desconto;
        this.isParcelado = isParcelado;
        this.numeroParcelas = numeroParcelas;
    }

    //gets
    public String getTipo() {
        return tipo;
    }

    public boolean getIsAVista() {
        return isAVista;
    }

    public double getDesconto() {
        return desconto;
    }

    public boolean getIsParcelado() {
        return isParcelado;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    //metodos
    @Override
    public void processarPagamento() {
        System.out.print("Processando pagamento de compra ");

        if (isAVista) {
            double valorComDesconto = getValor() - desconto;
            System.out.println("Pagamento à vista com desconto.");
            System.out.println("Desconto aplicado: R$ " + desconto);
            System.out.println("Valor final: R$ " + valorComDesconto);
        } else if (isParcelado && numeroParcelas > 0) {
            double valorParcela = getValor() / numeroParcelas;
            System.out.println("Pagamento parcelado em " + numeroParcelas + "x de R$ " + String.format("%.2f", valorParcela));
            System.out.println("Valor total: R$ " + getValor());
        } else {
            System.out.println("Forma de pagamento inválida.");
        }

        System.out.println("Forma de pagamento escolhida: " + getFormaPagamento());

    }
}