import java.util.Arrays;
import java.util.Random;

public class Task2{
    int a[];
    public Task2(int n){
        a = new int [n];
    }

    //заполнение n элементов массива случайными числами в диапазоне rand
    public void fillArray(int rand, int n){
        Random random = new Random();
        if (n<a.length)
            for (int i = 0; i < n; i++) {
                a[i] = random.nextInt(rand);
            }
    }

    //TODO напишите метод бинарного поиска элемента num в массиве
    public int binarySearch(int num){
        return Arrays.binarySearch(a, num);

    }

            //TODO напишите метод сортировки массива (можно использовать метод класса Arrays)
     public void sort(int from, int to){
        Arrays.sort(a,from,to);
    }
}