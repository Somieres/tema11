package ejercicio_clase_28_04_2020;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ContarVocales {
    private static String FILE_NAME = "input.txt";
    private static String VOCALS = "aeiou";


    public static void run() {
        try {
            ContarCaracteres counters = new ContarCaracteres(VOCALS, false);
            FileReader input = new FileReader(FILE_NAME);
            int c = input.read();
            while (c != -1) {
                counters.countIfTargeted((char) c);
                c = input.read();
            }
            input.close();
            System.out.println(counters.toString());
//añadimos esta sentencia para que no se duplique la tabla cuando ejecutemos CountingVocals2
            ContarCaracteres.tablaCaracteres.clear();
        } catch (IOException ex) {
            System.out.println("Something bad has happended :--‐(");
        }
    }
}
