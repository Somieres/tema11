package ejercicio_clase_28_04_2020;

import java.util.ArrayList;
import java.util.Collections;

public class ContarCaracteres {

    private String vocals;
    private boolean caseSensitive;

    static ArrayList<Registro> tablaCaracteres= new ArrayList<>();


    //en el constructor llenamos el arrayList con los caracteres que vamos a ir comparando lo que
//leamos desde el fichero
    public ContarCaracteres(String vocals, boolean caseSensitive) {
        this.vocals=vocals;
        this.caseSensitive=caseSensitive;
        for (int i = 0; i < this.vocals.length(); i++) {
            tablaCaracteres.add(new Registro(vocals.toUpperCase().charAt(i),0));
        }

    }

    public void countIfTargeted(char c) {
        int indice= Collections.binarySearch(tablaCaracteres,new Registro(c,0));
        if (indice>=0) {
            Registro registro = tablaCaracteres.get(indice);
            registro.incrementa(c);
        }
    }
    public String toString(){
        String cadena="";
        for (Registro registro: tablaCaracteres ) {
            cadena += registro.toString();
        }
        return cadena;
    }

}

