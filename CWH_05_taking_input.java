import java.util.Scanner;

public class CWH_05_taking_input {
    public static void main(String[] args) {
        System.out.println("Taking input from the User");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n1");
        int a = sc.nextInt();
        System.out.println("enter n2");
        float b = sc.nextFloat();

        float sum = a + b;
        System.out.println("the sum of these numbers is");
        System.out.println(sum);

        System.out.println("enter num to check is it integor");
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);

        // String strkkk = sc.nextLine();
        // System.out.println(strkkk);
    }
}
