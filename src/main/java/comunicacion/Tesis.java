package comunicacion;

public class Tesis extends Escrito{
    String idea;
    String [] argumentos;
    String conclusion;
    String referencias;
    String interpretacion;

    public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos,
                 String conclusion, String referencias, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }

    public String getIdea(){
        return idea;
    }
    public String[] getArgumentos(){
        return argumentos;
    }
    public String getConclusion(){
        return conclusion;
    }
    public String getReferencias(){
        return referencias;
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return (palabrasPagina * getPaginas()) * 5;
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
                + getIdea() + "\n"
                + getArgumentos().length + "\n"
                + getConclusion() + "\n"
                + getReferencias();
    }
}
