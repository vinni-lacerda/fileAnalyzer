import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TxtAnalyzer {

    public static void analyzeFile() throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\Vinicius\\Desktop\\in.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while((line = bufferedReader.readLine()) != null){
           if(line.trim().isEmpty()){continue;}
           System.out.println(line.trim());
    }
    }
}
