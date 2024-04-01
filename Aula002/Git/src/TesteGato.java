public class TesteGato {
    
    public static void main(String[] args) {
        
        Gatos gato1 = new Gatos();

        gato1.nome = "Roberto";
        gato1.raca = "peladu";
        gato1.idade = 2;

        System.out.println("Nome do gato: "+ gato1.nome);
        System.out.println("Raça do gato: "+ gato1.raca);

        gato1.andar();

    }
}
