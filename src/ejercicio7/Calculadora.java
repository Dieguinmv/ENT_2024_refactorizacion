package ejercicio7;

public class Calculadora {
	
	public int sumar(int sumando1, int sumando2) {
        return sumando1 + sumando2;
    }

    public int restar(int minuendo, int sustraendo) {
        return minuendo - sustraendo;
    }

    public int multiplicar(int factor1, int factor2) {
        return factor1 * factor2;
    }

    public float dividir(float dividendo, int divisor) throws Exception {
        if (divisor == 0) {
            throw new Exception("Valor incorrecto");
        }
        return dividendo / divisor;
    }

    public double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }
    
    public double calcularVolumenCilindro(double radio, double altura) {
        return calcularAreaCirculo(radio) * altura;
    }

	
}
