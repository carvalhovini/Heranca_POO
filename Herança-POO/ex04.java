abstract class Veiculo {
    protected String marca;
    protected int ano;

    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public abstract void imprimirInformacoes();
}

class Carro extends Veiculo {
    private String cor;

    public Carro(String marca, int ano, String cor) {
        super(marca, ano);
        this.cor = cor;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }
}

class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, int ano, int cilindradas) {
        super(marca, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Cilindradas: " + cilindradas);
    }
}

class Caminhao extends Veiculo {
    private String cargaMaxima;

    public Caminhao(String marca, int ano, String cargaMaxima) {
        super(marca, ano);
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Carga Máxima: " + cargaMaxima);
    }
}

class TesteVeiculos {
    public static void main(String[] args) {
        Carro carro = new Carro("Ford", 2019, "Azul");
        Moto moto = new Moto("Honda", 2020, 250);
        Caminhao caminhao = new Caminhao("Volvo", 2018, "10 toneladas");

        carro.imprimirInformacoes();
        System.out.println();
        moto.imprimirInformacoes();
        System.out.println();
        caminhao.imprimirInformacoes();
    }
}
