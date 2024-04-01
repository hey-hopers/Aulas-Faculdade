import java.util.*;

public class Carro {

    String marcaVeiculo;
    String modeloVeiculo;
    Date dataFabricacaoVeiculo;
    double pesoVeiculo;
    int quantidadeMarchaVeiculo;
    int quantidadePortaVeiculo;
    
    //Metodos

    public void ligar(){
        System.out.println("Liga o carro! ->>>>>    "+modeloVeiculo.toString());
    }
    public void desligar(){
        System.out.println("Desligar o carro! ->>>>>    "+modeloVeiculo.toString());
    }

    public void acelerar(){
        System.out.println("Acelerar o carro! ->>>>     "+modeloVeiculo.toString());
    }

}