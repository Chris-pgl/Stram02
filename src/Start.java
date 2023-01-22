import javax.xml.crypto.Data;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class Start {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        File file = new File("file.txt");
        try{
            if(file.exists()){
                System.out.println("Il file esiste già, bisogna sovrascriverlo? (s/n)");
                s.nextLine();
            }else{
                System.out.println("Creazione di un nuovo file..");
                file.createNewFile();
            }

            LocalDateTime data = LocalDateTime.now();
            String date = data.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(date);
            fileWriter.close();
            System.out.println("Scrittura completata!");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
