package app;

public class App {
    public static void main(String[] args) throws Exception {
        
        Pooflix miPooflix = new Pooflix();

        System.out.println("Iniciando Catalogo");
        
        miPooflix.inicializarCatalogo();

        Serie bb = miPooflix.buscarSerie("The Walking Dead");
        
        Temporada laMejorTemporada = bb.getTemporada(1);
        
        Episodio websodio;

        websodio = laMejorTemporada.getEpisodio(1);
        
        websodio.reproducir();

        Temporada laOtraMejorTemporada = bb.getTemporada(1);
       
        Episodio elTop;

        elTop = laOtraMejorTemporada.getEpisodio(1);

        elTop.reproducir();


    }
}     