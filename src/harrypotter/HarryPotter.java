package harrypotter;

import java.io.*;

    class HarryPotter {


         private static String nombreMAil = "mail.txt";
         private static String houler_name = "howler.txt";


         private String howlerize(String text) {
             return text.toUpperCase();
         }

         public void run() {
             try {
                 BufferedReader input = new BufferedReader(new FileReader(nombreMAil));

                 BufferedWriter output = new BufferedWriter(new FileWriter(houler_name));

                 String line = input.readLine();

                 while (line != null) {
                     String howledLine = this.howlerize(line);
                     output.write(howledLine, 0, howledLine.length());
                     output.newLine();
                     line = input.readLine();

                 }

                 input.close();
                 output.close();

             } catch (IOException ex) {
                 System.out.println("A lo mejor sabes como continua");
             }
         }

}
