public class CarrosInc {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("chevrolet","corsa",2009,5000);
        Carro carro = new Carro("Volksvagen","Kombi",1998,3000,3);
        Moto moto = new Moto("Harley Davidson","Softail",1984,61900,1000);
        Caminhao caminhao = new Caminhao("Scania","112",1981,75000,50000);
        System.out.println("============VEÍCULO============");
        veiculo.imprimirInformacoes();
        System.out.println("===============================");
        System.out.printf("\r");
        System.out.println("===========  CARRO ============");
        carro.adicionaisCarro();
        System.out.println("================================");
        System.out.printf("\r");
        System.out.println("============ MOTO ============");
        moto.adicionaisMoto();
        System.out.println("================================");
        System.out.printf("\r");
        System.out.println("============CAMINHÃO============");
        caminhao.adicionaisCaminhao();



    }
}
