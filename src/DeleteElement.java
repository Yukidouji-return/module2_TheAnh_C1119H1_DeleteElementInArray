import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter the size:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 1; i < size + 1; i++) {
            System.out.print("element " + i + " :");
            arr[i - 1] = scanner.nextInt();
        }
        System.out.print("your arr:");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i] + " ");
        }
        int index;
        do {
            System.out.print("please enter the position you want to delete:");
            index = scanner.nextInt();
        } while (index < 0 || index > size);
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.print("your new arr:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

}