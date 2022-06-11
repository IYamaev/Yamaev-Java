import java.util.Scanner;

/*
Составить алгоритм: если введенное число больше 7, то вывести “Привет”
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        if (inputNumber > 7){
            System.out.println("Привет");
        }
    }
}
