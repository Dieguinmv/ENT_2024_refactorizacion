package ejercicio7;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Calculadora calc = new Calculadora();

        System.out.println("Suma: " + calc.sumar(10, 5));
        System.out.println("Resta: " + calc.restar(10, 5));
        System.out.println("Multiplicación: " + calc.multiplicar(10, 5));
        System.out.println("División: " + calc.dividir(10, 5));

        double area = Math.PI * 5.0 * 5.0;
        double volumen = area * 10.0;
        System.out.println("Área del círculo: " + area);
        System.out.println("Volumen del cilindro: " + volumen);
    }

}
