public class Transporte {
    public double velocidade;
    public String cor;
    public String modelo;
    public int quant_rodas;

    // Construtor
    public Transporte(double velocidade, String cor, String modelo, int quant_rodas){
        this.velocidade = velocidade;
        this.cor = cor;
        this.modelo = modelo;
        this.quant_rodas = quant_rodas;
    }

    public void Info(){
        System.out.println("Velocidade: "+velocidade);
        System.out.println("Cor: "+cor);
        System.out.println("Modelo: "+modelo);
        System.out.println("Quantidade de rodas: "+quant_rodas);
    }
}
