package app;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido {

    public List<Temporada> temporadas = new ArrayList<>();

    public Temporada getTemporada(int numeroTemporada) {

        for (Temporada tempo : this.temporadas) {
            if(tempo.numero == numeroTemporada)
            return tempo;
        }
        
        return null;
 
     }
}