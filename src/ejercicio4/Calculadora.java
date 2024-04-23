package ejercicio4;

public class Calculadora {

	public static final int SUMA = 1000;
	public static final int RESTA = 2000;
	
	/**
	 * Operacion combinada que solicita un nuevo parametro para saebr si quiere realizar una suma o una resta
	 * @param operador1 uno de los numeros para restar o sumar
	 * @param operador2 uno de los numeros para sumar o restar
	 * @param operacion numero para saber si quiere restar o sumar
	 * @return el resultado de la suma o la resta
	 * @throws Exception por si se equivoca ya que solo puede restar o sumar
	 */
	
	public int operacion(int operador1, int operador2, int operacion) throws Exception {

		switch (operacion) {

			case SUMA: return operador1 + operador2;
			case RESTA: return operador1 - operador2;
			default:throw new Exception("Operacion incorrecta");
		}
	}

	

}
