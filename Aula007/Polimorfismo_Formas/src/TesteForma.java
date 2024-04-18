public class TesteForma {
    public static void main(String[] args) {
        Forma[] formas = new Forma[3];

        formas[0] = new Triangulo(10, 2);
        formas[1] = new Quadrado(5);
        formas[2] = new Retangulo(8, 4);

        for (int i = 0; i < formas.length; i++) {
            formas[i].calcularArea();
            formas[i].desenhar();
            System.out.println();
        }
    }
}