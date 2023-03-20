public class cwh_33_varargs {
    static int add(int... arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(add());
        System.out.println(add(1));
        System.out.println(add(1, 3));
        System.out.println(add(1, 2, 5, 3, 6, 4));
    }
}
