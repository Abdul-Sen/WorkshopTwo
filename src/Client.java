import Shapes.*;
import java.io.*;


public class Client {

    public static void main(String [] args)
    {
        System.out.println(args[0]);
        String s;
        Shape[] shapeArray = new Shape[43]; //TODO: 42 Because thats the static number of lines in file. Change that to dynamic
        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            while ((s = br.readLine()) != null) {
               String[] tokens = s.split(",");
                //your code here
                shapeArray[0] = new Circle(Double.parseDouble(tokens[1]));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}