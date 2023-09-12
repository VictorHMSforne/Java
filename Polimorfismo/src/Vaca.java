public class Vaca extends Animal{

    public  Vaca(){
        this.nome = "Mimosa";
        this.numeroPatas = 4;
    }
    //alt+insert+override
    @Override
    public void som() {
        System.out.println("MUUUUUUU");
    }
}
