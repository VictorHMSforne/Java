public class Moto extends Veiculo{
    private int cilindrada;

    public Moto(String marca, String modelo, int ano, double preco, int cilindrada) {
        super(marca, modelo, ano, preco);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    public void adicionaisMoto(){
        imprimirInformacoes();
        System.out.println("Cilindrada: "+getCilindrada());
    }
}
