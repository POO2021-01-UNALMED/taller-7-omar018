package comunicacion;

public class Fabula extends Escrito{
    private String Ensenanza;
    String Interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion){
        super(origen,titulo, autor, paginas);
        this.Ensenanza = ensenanza;
        this.Interpretacion = interpretacion;

    }
    public void setEnsenanza(String ensenanza){
        this.Ensenanza = ensenanza;
    }

    public String getEnsenanza(){
        return Ensenanza;
    }

    @Override
    public String interpretacion() {
        return Interpretacion;
    }

    @Override
    public String toString() {
        return getOrigen() + "\n"
            + getTitulo() + "\n"
            + getAutor() + "\n"
            + getPaginas() + "\n"
            + getEnsenanza();
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return palabrasPagina * getPaginas();
    }
}
