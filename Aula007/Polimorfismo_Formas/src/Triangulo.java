class Triangulo extends Forma {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double area = (base * altura) / 2;
        System.out.println("Área do triângulo: " + area);
    }

    public void desenhar() {
        System.out.println("Desenhando um triângulo...");
    }
}