package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class GestorAlmacen {

	private List<String> productos = new ArrayList<>();
	public static final int AGREGAR = 1000;
	public static final int ELIMINAR = 2000;

	public void manejarProducto(String producto, int operacion) throws Exception {

		if(productos.contains(producto) && operacion == AGREGAR) {
			productos.remove(producto);
		}
		else if(!productos.contains(producto)&& operacion == ELIMINAR) {
			productos.add(producto);
		}
		/*
		 *BLOQUE DE POSIBLES ERRORES
		 */
		else if(operacion == AGREGAR) {
			throw new AddProductoException("Imposible añadir, el producto ya estaba");
		}
		else if(operacion == ELIMINAR) {
			throw new AddProductoException("Imposible añadir, el producto ya estaba");
		}
	
		else throw new Exception("Operacion no soportada");
	}



}
