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

    

   

		Serie theWD = new Serie();
		theWD.titulo = "The Walking Dead";

		Genero generoTWD = new Genero();
		generoTWD.nombre = "horror";
		theWD.generos.add(generoTWD);

        theWD.temporadas.add(t1);

        
        Websodio web1 = new Websodio();
        web1.numero = 1;
        web1.nombre = "A New Day";
        web1.duracion = 120d;
        web1.url = "https//: asd.com";
        t1.episodios.add(web1);

		Episodio ep1 = new Episodio();
		ep1.numero = 1;
		ep1.nombre = "Days Gone Bye";
		ep1.duracion = 41d;
		t1.episodios.add(ep1);

		Episodio ep3 = new Episodio();
		ep3.numero = 3;
		ep3.nombre = "Tell It To The Frogs";
		ep3.duracion = 40d;
		t1.episodios.add(ep3);

		theWD.temporadas.add(t1);

		Episodio ep4 = new Episodio();
		ep4.numero = 3;
		ep4.nombre = "Walk With Me";
		ep4.duracion = 47d;
		t3.episodios.add(ep4);

		Episodio ep5 = new Episodio();
		ep5.numero = 5;
		ep5.nombre = "Say the Word";
		ep5.duracion = 50d;
		t3.episodios.add(ep5);

		theWD.temporadas.add(t3);

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