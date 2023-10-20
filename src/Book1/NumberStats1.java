package Book1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class NumberStats1 {
    public static void main (String[] args) {
        List<Double> data = readFile("src/Book1/Book1.csv");
        double sum = sum(data);
        double lowest = lowestNumber(data);
        double highest = highestNumber(data);
        double average = sum / data.size();

        String content = "The sum: " + sum + "\n" + "The lowest number is: " + lowest + "\n" + "The highest number is: " + highest + "\n" + "The average of the number is " + average;

        writeFile("src/Book1/output.txt", content );
        display(content);
    }

    public static double sum(List<Double> data){
        double sum = 0;
        for(double x: data ){
        }
        return sum;
    }

    public static double lowestNumber(List<Double> data){
        double lowest = Double.MAX_VALUE;
        for (double x: data) {
            if(x < lowest) {
               lowest = x;
            }
        }
        return lowest;
    }

    public static double highestNumber(List<Double> data){
        double highest = Double.MAX_VALUE;
        for(double x: data) {
            if( x > highest){
                highest = x;
            }
        }
        return highest;
    }

    public static void display(String content){
            System.out.println(content);
    }

    public static List<Double> readFile(String inputFile) {
        List<Double> data = new ArrayList<Double>();
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));)
        {
            String line;
            if( (line = br.readLine()) != null) {
                String[] elements = line.split(",");
                for(String nStr: elements) {
                    data.add(Double.parseDouble(nStr));
                }
            }
        }catch(IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public static void writeFile(String output, String content) {
        try (
            FileWriter fw = new FileWriter(output);
            BufferedWriter bw = new BufferedWriter(fw);
            )
            {
                bw.write(content);
            }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
