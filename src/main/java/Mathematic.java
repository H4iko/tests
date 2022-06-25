import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Mathematic {
    public static final double PI = 3.14;

    public static double circLength (double radius) {
        double length = Math.round(2*PI*radius);
        return length;
    }

    public static double circSquare (int radius) {
        //double pi = 3.14;
        double square = PI*radius*radius;
        return square;
    }

    public static boolean diff (int radius) {
        double length = 2*PI*radius;
        double square = PI*radius*radius;
        return length > square;
    }

    public static double pifagor (int a, int b) {
        return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    }

    public static void file (int radius, double square) throws IOException {
//        File temp = new File("C://temp.txt");
//        try {
//            temp.createNewFile();
//        } catch (IOException e) {
//            System.out.println("Файл не создан");
//        }

        File temp = new File("C://temp.txt");
        temp.createNewFile();


        try (FileWriter text = new FileWriter("temp.txt")) {
            text.write("Радиус: " + radius + " Площадь: " + square);
        } catch (IOException e) {
            System.out.println("Файл не создан");;
        }
    }
}
