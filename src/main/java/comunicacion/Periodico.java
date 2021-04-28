package comunicacion;

public class Periodico extends Escrito{
    String fecha;
    String primicia;
    String interpretacion;

    public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia,
                     String interpretacion){
        super(origen, titulo, autor, paginas);
        this.fecha = fecha;
        this.primicia = primicia;
        this.interpretacion = interpretacion;
    }

    public String getFecha(){
        return fecha;
    }
    public String getPrimicia(){
        return primicia;
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return (palabrasPagina * getPaginas()) * 10;
    }

    @Override
    public String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        return getOrigen() + "\n"
                + getTitulo() + "\n"
                + getAutor() + "\n"
                + getPaginas() + "\n"
                + getFecha() + "\n"
                + getPrimicia();
    }
}
