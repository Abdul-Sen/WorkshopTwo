import Shapes.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Client {
    public static void main(String [] args)
    {
        Square sq = new Square(3);
        sq.perimeter();
        String fileName = args[0];
        String s;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while ((s = br.readLine()) != null) {
                String[] tokens = s.split(",");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

