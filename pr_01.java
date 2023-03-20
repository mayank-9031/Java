import java.util.Scanner;

public class pr_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int t = 10;
        while (t > 0) {
            int a = sc.nextInt();
            t--;
            sum += a;
        }
        int avg = sum / 10;
        System.out.println(avg);
    }
}
