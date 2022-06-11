import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
 */

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int[] generatedArray = new int[arrayLength];
        Random ran = new Random();
        for (int i = 0; i < generatedArray.length; i++) {
            generatedArray[i] = ran.nextInt();
        }
        System.out.println("Сгенерированный массив");
        System.out.println(Arrays.toString(generatedArray));

        System.out.println("Элементы массива кратные 3");
        for (int i = 0; i < generatedArray.length; i++) {
            if (generatedArray[i] % 3 == 0) {
                System.out.print(generatedArray[i] + " ");
            }
        }
    }
}
