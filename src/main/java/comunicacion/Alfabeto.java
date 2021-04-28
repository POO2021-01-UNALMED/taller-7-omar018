package comunicacion;

import java.util.Arrays;

public class Alfabeto extends Pictograma{
    String [] letras;
    String interpretacion;

    public Alfabeto(String origen, String [] letras, String interpretacion){
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;

    }

    public String interpretacion(){
        return interpretacion;
    }

    public int cantidadLetras(){
        return letras.length;
    }

    public String toString(){
        String letra = "";
        for(int i = 0; i < letras.length; i++){
            if(i == letras.length - 1){
                letra += letras[i];
                break;
            }
            letra += letras[i] + ", ";
        }
        return letra;
    }
}
