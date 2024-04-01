public class Fabricante {

    public static void main (String[]args){

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();
        Carro carro4 = new Carro();

        carro1.marcaVeiculo ="Kia";
        carro1.modeloVeiculo ="Cerato";

        carro2.marcaVeiculo = "bmw";
        carro2.modeloVeiculo = "320";

        carro3.marcaVeiculo ="fiat";
        carro3.modeloVeiculo = "toro";

        carro4.marcaVeiculo = "porsche";
        carro4.modeloVeiculo = "GT3 RS";

        carro1.ligar();
        carro2.ligar();
        carro3.ligar();
        carro4.ligar();

        carro1.desligar();
        carro4.acelerar();

        System.out.println("Marca -> "+carro1.marcaVeiculo);
        System.out.println("Marca -> "+carro2.marcaVeiculo);
        System.out.println("Marca -> "+carro3.marcaVeiculo);
        System.out.println("Marca -> "+carro4.marcaVeiculo);
    }
}
