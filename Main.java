import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        searchElement se = new searchElement();
        int[] arr = {10, 20, 30, 40, 50, 60};
        int target = sc.nextInt();
        System.out.println(se.findIndex(arr, target));
    }
}
