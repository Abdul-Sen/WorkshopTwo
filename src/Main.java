import Shapes.*;
import java.io.*;


public class Main {

private static Shape[] readShapes(String fileName) {
    String s;
    int i = 0;

    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
        while ((s = br.readLine()) != null) {
            i++;
        }
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }

    Shape[] shapeArray = new Shape[i];
    i = 0;

    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
    while ((s = br.readLine()) != null) {
        try {
            String[] tokens = s.split(",");
            //your code here
            switch (tokens[0])
            {
                case "Circle":
                    if(tokens.length > 2)
                        throw new TooManyParameters("Invalid side(s)!");
                    shapeArray[i] = new Circle(Double.parseDouble(tokens[1]));
                    break;
                case "Parallelogram":
                    if(tokens.length > 3)
                        throw new TooManyParameters("Invalid");
                    shapeArray[i] = new Parallelogram(Double.parseDouble(tokens[1]),Double.parseDouble(tokens[2]));
                    break;
                case "Rectangle":
                    if(tokens.length > 3)
                        throw new TooManyParameters("Invalid!!!");
                    shapeArray[i] = new Rectangle(Double.parseDouble(tokens[1]),Double.parseDouble(tokens[2]));
                    break;
                case "Square":
                    if(tokens.length > 3)
                        throw new TooManyParameters("Invalid!!!");
                    shapeArray[i] = new Square(Double.parseDouble(tokens[1]));
                    break;
                case "Triangle":
                    if(tokens.length > 4)
                        throw new TooManyParameters("Invalid!!!");

                    shapeArray[i] = new Triangle(Double.parseDouble(tokens[1]),Double.parseDouble(tokens[2]),Double.parseDouble(tokens[3]));
                    break;
                default:
                    i--;
                    break;
            }
            i++;
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
        catch (TooManyParameters ex)
        {
            System.out.println(ex.getMessage());
        }

    }
    } catch (IOException e) {
    System.out.println(e.getMessage());
    }

        return shapeArray;
    }

    public static void main(String [] args)
    {
        System.out.println(args[0]);
        System.out.println("------->JAC 444 Assignment 1<-------\n" + "------->Task 1 ... <-------");
        Shape [] shapeArray;

        shapeArray = readShapes(args[0]);
        int counter = 0;

        for (Shape currentShape : shapeArray) {
            if(currentShape != null)
                counter++;
        }

        System.out.println(counter + " shapes were created");
        for (Shape currentShape : shapeArray) {
            if(currentShape != null)
                System.out.println(currentShape);
        }
    }
}