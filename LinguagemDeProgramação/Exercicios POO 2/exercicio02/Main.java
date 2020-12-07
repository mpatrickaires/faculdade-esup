package exercicio02;

public class Main {

    public static void main(String[] args) {
        Circulo circulo = new Circulo(3);
        System.out.println("===== CÍRCULO =====");
        System.out.println("Raio: " + circulo.getRaio());
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());


        Retangulo retangulo = new Retangulo(3, 5);
        System.out.println("\n===== RETÂNGULO =====");
        System.out.println("Base: " + retangulo.getBase());
        System.out.println("Altura: " + retangulo.getAltura());
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());


        Quadrado quadrado = new Quadrado(8);
        System.out.println("\n===== QUADRADO =====");
        System.out.println("Lado: " + quadrado.getLado());
        System.out.println("Área: " + quadrado.calcularArea());
        System.out.println("Perímetro: " + quadrado.calcularPerimetro());
    }
}
