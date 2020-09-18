import java.util.Scanner;

public class AddItem {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("element " + (i + 1));
            arr[i] = sc.nextInt();
        }
        System.out.println("Nhập số cần chèn ");
        int x = sc.nextInt();
        System.out.println("Nhập vị trí cần chèn: ");
        int index = sc.nextInt();
        int[] newArr = new int[size + 1];
        for (int i = 0; i < index - 1; i++) {
            newArr[i] = arr[i];
        }
        newArr[index - 1] = x;
        for (int i = index; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
