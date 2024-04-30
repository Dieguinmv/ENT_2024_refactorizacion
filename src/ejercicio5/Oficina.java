package ejercicio5;

public class Oficina {
	
    public void setDireccion(Cliente cliente, String nuevaDireccion) {
        cliente.setDireccion(nuevaDireccion);
        // Otro código aquí
    }

    public void enviarCorreo(Cliente cliente) {
        String direccion = cliente.getDireccion();
        // Lógica para enviar correo a la dirección
    }
}
