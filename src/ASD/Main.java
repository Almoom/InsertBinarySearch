package ASD;

import java.util.Scanner;

public class Main {
    /*Урок 3. Поиск в массиве. Простые сортировки
    5. **Реализовать сортировку вставками используя бинарный поиск.*/

    public static Scanner scanner = new Scanner(System.in);
    public static int [] arr = {10,25,32,40,45,48,49,55,68,72,100};
    public static int L = 0;
    public static int R = arr.length-1;
    public static void main(String[] args) {


        System.out.println("Введите число, которое необходимо найти в массиве:");
        int n = scanner.nextInt();
        Binary(arr,n);
    }

    public static void Binary (int[] a,int n){
        for (int i = 0; i < Math.log(a.length)+1; i++) {
            if (n == a[L]){
                System.out.println(L);
                break;
            }
            if (n == a[R]){
                System.out.println(R);
                break;
            }
            if (n == a[(int)(L + R)/2]){
                System.out.println((int)(L + R)/2);
                break;
            }
            if (n > a[(int)(L + R)/2]){
                L = (int)(L + R)/2;
            }
            if (n < a[(int)(L + R)/2]){
                R = (int)(L + R)/2;
            }
            if (i == (int)Math.log(a.length)+1){
                System.out.println("-1");
                break;
            }
        }
    }
}