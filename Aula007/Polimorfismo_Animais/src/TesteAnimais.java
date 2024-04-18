public class TesteAnimais extends Animal{
    public static void main(String[] args) {

        Animal[] animals = new Animal[2];
        animals[0] = new Gato(); 
        animals[1] = new Cachorro();

        for(int i = 0; i < animals.length; i++){
            animals[i].fazerBarulho();
            animals[i].movimentar();
            System.out.println();
        }
    }
}
