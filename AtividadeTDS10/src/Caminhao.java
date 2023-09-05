public class Caminhao extends Veiculo {
    private double cargaMaxima;

    public Caminhao(String marca, String modelo, int ano, double preco, double cargaMaxima) {
        super(marca, modelo, ano, preco);
        this.cargaMaxima = cargaMaxima;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }
    public void adicionaisCaminhao(){
        imprimirInformacoes();
        System.out.println("Capacidade de Carga Maxima "+getCargaMaxima());
    }
}
