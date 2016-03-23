import java.io.BufferedReader;
import java.io.FileReader;

public class make 
{
	FileReader in = new FileReader("C:/Users/Kulkarni/Desktop/dp/CreateMaze.txt");
    BufferedReader br = new BufferedReader(in);
    String line = null;
    while (line = br.readLine() != null) 
    {
        System.out.println(line);
    }
    in.close();
    
}
