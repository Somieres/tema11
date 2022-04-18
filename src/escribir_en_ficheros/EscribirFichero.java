package escribir_en_ficheros;

import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichero {
    public static void main(String[] args) {

        try {
            String texto = "Introduzca un texto";
            FileWriter fw = new FileWriter("EscribirAlReves.txt");
            for (int i=texto.length()-1;i>=0;i--){
                fw.write(texto.charAt(i));
            }
            fw.close();
        }catch (IOException ex){
            System.out.printf("error FATAL");
        }

    }
}
