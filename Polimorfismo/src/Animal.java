
//Metodo Abstrato = É um molde para outras classes, nao se pode instanciar
public abstract class Animal {
    protected String nome; //quando usa protected, as classes filhas podem ter acessos
    protected int numeroPatas;

    public abstract void som();

}
