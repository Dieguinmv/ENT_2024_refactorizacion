package ejercicio1;

public class Calculadora {
	
	public int sumar(int sumando1, int sumando2) {
        return sumando1+sumando2;
    }

    public int restar(int minuendo, int sustraendo) {
        return minuendo-sustraendo;
    }

    public int multiplicar(int factor1, int factor2) {
        return factor1*factor2;
    }

    public float dividir(float dividendo, float divisor) {
        if (divisor == 0) {
            //TODO DIVISION POR CERO. ¿LANZAR EXCEPCION ?
        	return 0;
        } else {
            return dividendo/divisor;
        }
    }

    

	
	
}
