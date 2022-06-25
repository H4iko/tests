import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите радиус окружности: ");

        int r = scanner.nextInt();

        Double resultLength = Mathematic.circLength(r);
        Double resultSquare = Mathematic.circSquare(r);

        System.out.println("Длина окружности = " + resultLength + " ед");
        System.out.println("Площадь окружности = " + resultSquare + " кв.ед");

        Mathematic.file(r, resultSquare);

        System.out.println(Mathematic.pifagor( 5, 2));

    }
}
