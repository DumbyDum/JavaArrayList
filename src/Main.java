import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    Random random = new Random();
    static PrintStream out = System.out;
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Task1 array1 = new Task1(20);
        array1.fillArray(100, 20);
        //TODO создайте второй массив из 20 элементов, заполните его одинаковыми значениями, используя метод fill класса Arrays
        int []array2 = new int[20];
        Arrays.fill(array2, 10);

        //TODO создайте массив из 20 элементов класса Task2, заполните его случайными значениями,
        Task2 array3 = new Task2(20);
        array3.fillArray(20, 20);
        //TODO найдите в этом массиве введенное пользователем число бинарным поиском
        int q;
        out.println("Write num: ");
        q = in.nextInt();

        out.print("The index of your num: ");
        out.println(array3.binarySearch(q));
    }
}
