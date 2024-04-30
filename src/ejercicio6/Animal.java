package ejercicio6;

public class Animal {
	
	private String tipo;

    public Animal(String tipo) {
        this.tipo = tipo;
    }

    public void hacerSonido() {
        if (tipo.equals("Perro")) {
            System.out.println("Guau!");
        } else if (tipo.equals("Gato")) {
            System.out.println("Miau!");
        } else if (tipo.equals("Pajaro")) {
            System.out.println("Pío!");
        } else {
            System.out.println("Sonido desconocido");
        }
    }

}
