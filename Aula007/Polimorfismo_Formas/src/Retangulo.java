class Retangulo extends Forma {
    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    @Override
    public void calcularArea() {
        double area = comprimento * largura;
        System.out.println("Área do retângulo: " + area);
    }

    public void desenhar() {
        System.out.println("Desenhando um retângulo...");
    }
}