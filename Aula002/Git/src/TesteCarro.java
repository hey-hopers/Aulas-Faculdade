public class TesteCarro {
    
    public static void main(String[] args) {
        
        Carro carro1 = new Carro();

        carro1.cor = "Amarelo";
        carro1.modelo = "Kia";

        System.out.println("Modelo do carro: "+ carro1.modelo);
        System.out.println("Cor do carro: "+ carro1.cor);

        carro1.acelerar();
        carro1.freando();
        
    }
}
