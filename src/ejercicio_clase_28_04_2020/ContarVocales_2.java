package ejercicio_clase_28_04_2020;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ContarVocales_2 extends ContarCaracteres {

    private static String FILE_NAME = "input.txt";
    private static String VOCALS = "aefikopuwá";

    public ContarVocales_2(String vocals, boolean caseSensitive) {
        super(vocals, caseSensitive);
    }


    public static void run() {
        FileReader input = null;
        try {
            ContarCaracteres counters = new ContarCaracteres(VOCALS, false);
            input = new FileReader(FILE_NAME);
            int c;
            while (( c = input.read() ) != -1) {
                counters.countIfTargeted((char) c);
            }
            System.out.println(counters);
        } catch (FileNotFoundException ex) {
            System.out.println("Problems opening " + FILE_NAME);
        } catch (IOException ex) {
            System.out.println("Problems reading " + FILE_NAME);
        } finally {
            try {
                input.close();
            } catch (IOException ex) {
                System.out.println("Problems closing " + FILE_NAME);
            }
        }
    }
}
