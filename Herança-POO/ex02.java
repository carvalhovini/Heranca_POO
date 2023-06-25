abstract class Shape {
    public abstract double calcularArea();
}

class Retangulo extends Shape {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }
}

class Circulo extends Shape {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

class TesteShapes {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5, 3);
        Circulo circulo = new Circulo(2);

        double areaRetangulo = retangulo.calcularArea();
        double areaCirculo = circulo.calcularArea();

        System.out.println("Área do retângulo: " + areaRetangulo);
        System.out.println("Área do círculo: " + areaCirculo);
    }
}
