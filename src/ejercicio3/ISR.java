package ejercicio3;

public class ISR extends Impuesto {

	@Override
	public double calcular(double ingresos) {
		double impuesto;
		if (ingresos < 50000) {
			impuesto = ingresos * 0.20;
		} else {
			impuesto = ingresos * 0.30;
		}
		return impuesto;
	}

}
