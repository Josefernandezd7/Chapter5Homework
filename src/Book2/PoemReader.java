package Book2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PoemReader {
    public static void main(String[] args)  {
        String inputFile = "poem2.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            String line;

            while ((line = br.readLine()) != null) {

                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    String poet = parts[1].trim();

                    Poem poem = new Poem();
                    poem.setName(name);
                    poem.setPoet(poet);

                    System.out.println(poem);
                 }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
  }

