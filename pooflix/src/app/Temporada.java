package app;

import java.util.ArrayList;
import java.util.List;

public class Temporada {

    public int numero;
    public List<Episodio> episodios = new ArrayList<>();

    public Episodio getEpisodio(int numeroEpisodio) {

        for (Episodio epi : this.episodios) {

            if (epi.numero == numeroEpisodio)
            return epi;
        }

        return null;
    }



    
}
