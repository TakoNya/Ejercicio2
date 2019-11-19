package archivosejercicio2;
import java.io.*;

public class ArchivosEjercicio2 {

        public static void main(String[] args) {
            if (! (new File("archivo2.txt")).exists()) {
                System.out.println("No he encontrado archivo2.txt");
                return;
            }
        System.out.println("Leyendo archivo de texto...");
        try{
            BufferedReader archivoEntrada = new BufferedReader ( new FileReader(new File("archivo2.txt")));
            String linea = null;
            while (( linea = archivoEntrada.readLine())!=null){
                System.out.println(linea);
            }
            archivoEntrada.close();
        } catch (IOException errorDeArchivo){
            System.out.println("Ha habido problemas: " + errorDeArchivo.getMessage());
        }
    }
    
}
