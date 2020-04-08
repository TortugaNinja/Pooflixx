package app;

import java.util.ArrayList;
import java.util.List;

public class Pooflix {

    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();

    public void inicializarCatalogo() {

        this.agregarBreakingBad();
        this.agregarPennyDreadful();
        this.agregarWalkingDead(); 

    }

    public void agregarBreakingBad() {

        Serie breakingB = new Serie();
        breakingB.titulo = "Breaking Bad";

        Genero drama = new Genero();
        drama.nombre = "Drama";
        breakingB.generos.add(drama);

        Temporada t5 = new Temporada();
        t5.numero = 5;

        Episodio ep = new Episodio(7, "Say my name", 43d);

        t5.episodios.add(ep);

        Episodio epOtro = new Episodio(5, "Ozymandias", 41d);

        t5.episodios.add(epOtro);

        breakingB.temporadas.add(t5);

        this.series.add(breakingB);

    }

    public void agregarPennyDreadful() {

        Serie pennyDreadful = new Serie();
        pennyDreadful.titulo = "Penny Dreadful";

        Genero fantasia = new Genero();
        fantasia.nombre = "Fantasía";
        Genero horror = new Genero();
        horror.nombre = "Horror";
        pennyDreadful.generos.add(fantasia);
        pennyDreadful.generos.add(horror);

        Temporada t1 = new Temporada();
        t1.numero = 1;
        pennyDreadful.temporadas.add(t1);

        Episodio ep6 = new Episodio(6, "What Death Can Join Together", 2166000d);

        t1.episodios.add(ep6);

        Temporada t3 = new Temporada();
        t3.numero = 3;
        pennyDreadful.temporadas.add(t3);

        Episodio ep8 = new Episodio(8, "Perpetual Night", 158400d );
        
        t3.episodios.add(ep8);

        this.series.add(pennyDreadful);
    }

    public void agregarWalkingDead() {

        Serie theWalkingDead = new Serie();

        theWalkingDead.titulo = "The Walking Dead";

        Genero genero = new Genero();

        genero.nombre = "post-apocaliptica";

        theWalkingDead.generos.add(genero);

        Temporada t4 = new Temporada();
        t4.numero = 4;

        // AGrego un websodio
        Websodio websodio = new Websodio(1, "A New Day");

       
        websodio.setDuracion(20d);

        t4.episodios.add(websodio);

        websodio = new Websodio(2, "Alone");

        
        websodio.setDuracion(20d);
        
        t4.episodios.add(websodio);

        Episodio epii = new Episodio(8, "Too Far Gone", 43d);

        t4.episodios.add(epii);

        Episodio epiii = new Episodio(9, "After", 43d);

        t4.episodios.add(epiii);

        theWalkingDead.temporadas.add(t4);

        Temporada t7 = new Temporada();

        t7.numero = 7;

        Episodio epp = new Episodio(1, "The Day Will Come When You Won't Be" );

        t7.episodios.add(epp);

        Episodio eppp = new Episodio(3, "The Cell", 43d);

        t7.episodios.add(eppp);
        theWalkingDead.temporadas.add(t7);

        this.series.add(theWalkingDead);
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
