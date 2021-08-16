import java.util.Random;

public class Task1{
    int a[];
    public Task1(int n){
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
    //TODO напишите метод линейного поиска элемента num в массиве
    public int linearSearch(int num){
        for(int ind = 0; ind < a.length; ind++){
            if(a[ind] == num){
                return ind;
            }
        }
        return -1;
    }
}
