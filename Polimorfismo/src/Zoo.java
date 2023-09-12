public class Zoo {
    public static void main(String[] args) {
        Vaca mimosa = new Vaca();
        Gato bichano = new Gato();
        Carneiro shau = new Carneiro();

        Animal bichos [] = {mimosa,bichano,shau};

        for(Animal animal : bichos){ //1 Classe  2 Var 3 Lista

            System.out.println("===================");
            System.out.println(animal.getClass());
            System.out.println("===================");
            System.out.println(animal.nome + " É da Classe "+ animal.getClass().getName()+ " Tem " + animal.numeroPatas + " patas e faz ");
            animal.som();



        }



    }
}
