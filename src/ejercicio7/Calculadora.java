package ejercicio7;

public class Calculadora {
	
	public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        }
        return a / b;
    }

    public double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }
    
    public double calcularVolumenCilindro(double radio, double altura) {
        return calcularAreaCirculo(radio) * altura;
    }

	
}
