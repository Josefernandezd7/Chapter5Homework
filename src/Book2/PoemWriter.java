package Book2;

import java.io.FileWriter;
import java.io.IOException;

public class PoemWriter {
    public static void main(String[] args) {
        // Create three Poem objects
        Poem poem1 = new Poem();
        poem1.setName("The Road Not Taken");
        poem1.setPoet("Robert Frost");

        Poem poem2 = new Poem();
        poem2.setName("If You Forget Me");
        poem2.setPoet("Pablo Neruda");

        Poem poem3 = new Poem();
        poem3.setName("The Raven");
        poem3.setPoet("Edgar Allan Poe");

        // Create an array of Poem objects
        Poem[] poems = { poem1, poem2, poem3 };

        // Write the poem information to "poems.txt"
        try (FileWriter writer = new FileWriter("poems.txt")) {
            for (Poem poem : poems) {
                // Write the poem name and poet name to the file
                writer.write(poem.getName() + "\n");
                writer.write(poem.getPoet() + "\n");
                writer.write("\n"); // Add a blank line between poems
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Poem information has been written to poems.txt.");
    }
}
