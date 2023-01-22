/*import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws IOException {

        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(data.format(f1));

        File f = new File("file.txt");
        boolean error = false;

        try{
            if(f.createNewFile()){
                System.out.println("Creazione file eseguita!");
            }else{
                System.out.println("Il file esiste già! Sarà Sovrascritto!");
            }
        }catch (IOException e){
            System.out.println("Creazione del file fallita");
            error = true;
        }

        if(!error){
            try {
                FileWriter fw = new FileWriter((data.format(f1));

            }catch (IOException e){
                throw new IOException(e);
            }

        }
    }
}

 */