import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlAnalyzer {
    public static void urlAnalyzer(){
        try{
            URL url = new URL("http://hiring.axreng.com/internship/example1.html");
            URLConnection connection = url.openConnection();
            InputStream inputStream = connection.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

//            FileReader fr = new FileReader(connection.getDoInput());
            BufferedReader br = new BufferedReader(inputStreamReader);

            String line = "";
            while((line = br.readLine()) != null){
                if(line.trim().isEmpty()){}
                System.out.println(line);
            }
            br.close();
        }
        catch(MalformedURLException e){
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
