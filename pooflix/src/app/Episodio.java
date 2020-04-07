package app;

public class Episodio {

    public Double duracion;
    public String nombre;
    public int numero;

    public Episodio() {
        this.duracion = 40d;
    }

    public Episodio(int numero, String nombre, double duracion) {
        this.numero = numero;
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public Episodio(int numero, String nombre) {
        this();
        this.numero = numero;
        this.nombre = nombre;
    }

    public void reproducir() {
        System.out.println("Reproduciendo episodio " + this.numero + " " + this.nombre);
    
    }

}
