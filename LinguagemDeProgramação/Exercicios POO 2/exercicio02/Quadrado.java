package exercicio02;

public class Quadrado extends FiguraGeometrica {
    public double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * this.lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
