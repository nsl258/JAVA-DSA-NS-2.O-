import java.util.Scanner;

public class Ip_Take_Print_Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the" + size + " Elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array Elements are as: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}