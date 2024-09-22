import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        int[] arr = new int[5];
        int even = 0, odd = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            }
            else if (arr[i] % 2 != 0) {
                odd++;
            }
        }
        System.out.println("There are " + even + " even numbers, and " + odd + " odd numbers");
    }
}