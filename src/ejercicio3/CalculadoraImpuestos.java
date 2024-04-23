package ejercicio3;

public class CalculadoraImpuestos {
	private static final int TIPO_IVA = 1000;
	private static final int TIPO_ISR = 1001;
	private static final int TIPO_IEPS = 1002;

	public double calcularImpuestoTotal(double ingresos, int tipoImpuesto) throws ImpuestoNoValidoException {
		double impuesto = 0;
		if (tipoImpuesto == TIPO_IVA) {
			impuesto = calcularIVA(ingresos);
		} else if (tipoImpuesto == TIPO_ISR) {
			impuesto = calcularISR(ingresos);
		} else if (tipoImpuesto == TIPO_IEPS) {
			impuesto = ingresos * 0.05;
		} else {
			throw new ImpuestoNoValidoException("Tipo de impuesto no válido");
		}
		return impuesto;
	}

	private double calcularISR(double ingresos) {
		double impuesto;
		if (ingresos < 50000) {
			impuesto = ingresos * 0.20;
		} else {
			impuesto = ingresos * 0.30;
		}
		return impuesto;
	}

	private double calcularIVA(double ingresos) {
		double impuesto;
		if (ingresos < 10000) {
			impuesto = ingresos * 0.10;
		} else if (ingresos >= 10000 && ingresos < 50000) {
			impuesto = ingresos * 0.15;
		} else {
			impuesto = ingresos * 0.20;
		}
		return impuesto;
	}
}
