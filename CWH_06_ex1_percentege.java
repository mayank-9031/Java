import java.util.Scanner;

public class CWH_06_ex1_percentege {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Total Marks are: ");
        int total = sc.nextInt();

        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();
        float d = sc.nextInt();
        float e = sc.nextInt();

        float sum = a + b + c + d + e;
        float per = (sum) / (total * 5);

        System.out.println(per * 100);
    }
}
