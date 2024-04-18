class Quadrado extends Forma {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        double area = lado * lado;
        System.out.println("Área do quadrado: " + area);
    }

    public void desenhar() {
        System.out.println("Desenhando um quadrado...");
    }
}