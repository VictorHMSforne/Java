public class Carro extends Veiculo  {

    private int QtdPortas;

    public Carro(String marca, String modelo, int ano, double preco, int qtdPortas) {
        super(marca, modelo, ano, preco);
        QtdPortas = qtdPortas;
    }

    public int getQtdPortas() {
        return QtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        QtdPortas = qtdPortas;
    }
    public void adicionaisCarro(){
        imprimirInformacoes();
        System.out.println("Quantidade de Portas:"+getQtdPortas());
    }
}
