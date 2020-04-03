package app;

import java.util.ArrayList;
import java.util.List;

public class Pooflix {

    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();

    public void inicializarCatalogo() {



        Serie breakingB = new Serie();
        breakingB.titulo = "Breaking Bad";

        Genero drama = new Genero();
        drama.nombre = "Drama";
        breakingB.generos.add(drama);

        Temporada t5 = new Temporada();
        t5.numero = 5;

        Episodio ep = new Episodio();
  
        ep.numero = 7;
        ep.nombre = "Say my name";
        ep.duracion = 43d;

        t5.episodios.add(ep);

        Episodio epOtro = new Episodio();

        epOtro.numero = 5;
        epOtro.nombre = "Ozymandias";
        epOtro.duracion = 41d;

        t5.episodios.add(epOtro);

        breakingB.temporadas.add(t5);

        this.series.add(breakingB);

        Serie pennyDreadful = new Serie();
        pennyDreadful.titulo = "Penny Dreadful";

        Genero fantasia = new Genero();
        fantasia.nombre = "Fantasía";
        Genero horror = new Genero();
        horror.nombre = "Horror";
        pennyDreadful.generos.add(fantasia);
        pennyDreadful.generos.add(drama);
        pennyDreadful.generos.add(horror);

        Temporada t1 = new Temporada();
        t1.numero = 1;
        pennyDreadful.temporadas.add(t1);

        Episodio ep6 = new Episodio();

        ep6.numero = 6;
        ep6.nombre = "What Death Can Join Together";
        ep6.duracion = 216000d;

        t1.episodios.add(ep6);

        Temporada t3 = new Temporada();
        t3.numero = 3;
        pennyDreadful.temporadas.add(t3);

        Episodio ep8 = new Episodio();
        ep8.numero = 8;
        ep8.nombre = "Perpetual Night";
        ep8.duracion = 158400d;

        t3.episodios.add(ep8);

        this.series.add(pennyDreadful);

    }

    public void agregarTheWalkingDead() {

		Serie theWD = new Serie();
		theWD.titulo = "The Walking Dead";

		Genero generoTWD = new Genero();
		generoTWD.nombre = "horror";
		theWD.generos.add(generoTWD);

		Temporada temp1 = new Temporada();
		temp1.numero = 1;
		
		Episodio cap1 = new Episodio();
		cap1.numero = 1;
		cap1.nombre = "Days Gone Bye";
		cap1.duracion = 41d;
		temp1.episodios.add(cap1);

		Episodio cap3 = new Episodio();
		cap3.numero = 3;
		cap3.nombre = "Tell It To The Frogs";
		cap3.duracion = 40d;
		temp1.episodios.add(cap3);

		theWD.temporadas.add(temp1);

		Temporada temp3 = new Temporada();
		temp3.numero = 3;

		Episodio cap4 = new Episodio();
		cap4.numero = 3;
		cap4.nombre = "Walk With Me";
		cap4.duracion = 47d;
		temp3.episodios.add(cap4);

		Episodio cap5 = new Episodio();
		cap5.numero = 5;
		cap5.nombre = "Say the Word";
		cap5.duracion = 50d;
		temp3.episodios.add(cap5);

		theWD.temporadas.add(temp3);

		this.series.add(theWD);

	}


    public Contenido buscarPorTitulo(String titulo) {
        return null;
    }

    public Serie buscarSerie(String titulo) {
        
        for (Serie s : this.series) {
            if (s.titulo.equals(titulo)) 
                return s;
            
            
        }
        return null;
    }

    public Pelicula buscarPelicula(String titulo) {
        return null;
    }

    public Serie buscarSerie(Actor actor) {
        return null;
    }
}