package app;

import java.util.ArrayList;
import java.util.List;

public class Contenido {

    public String titulo;
    public double tiempoVisto;
    public Director director;
    public List<Genero> generos = new ArrayList<>();
    public List<Actor> actores = new ArrayList<>();
    public List<String> premios;

    public boolean visto() {
        return true;
    }
    public void reproducir() {

    }
    public void pausar() {
        
    }

}