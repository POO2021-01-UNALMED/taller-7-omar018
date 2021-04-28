package comunicacion;

public class Libro extends Escrito{
    String co_autor;
    String editorial;
    String edicion;
    String interpretacion;

    public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial,
                 String edicion, String interpretacion){
        super(origen,titulo, autor, paginas);
        this.co_autor = co_autor;
        this.editorial = editorial;
        this.edicion = edicion;
        this.interpretacion = interpretacion;
    }

    public String getCo_autor(){
        return co_autor;
    }
    public String getEditorial(){
        return editorial;
    }
    public String getEdicion(){
        return edicion;
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return (palabrasPagina * getPaginas()) * 2;
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
                + getCo_autor() + "\n"
                + getEditorial() + "\n"
                + getEdicion();
    }
}
