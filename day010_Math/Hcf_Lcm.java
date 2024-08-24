public class Hcf_Lcm {
    public static void main(String[] args) {
        System.out.println(hcf(4, 9));
        System.out.println(lcm(2, 7));
    }

    static int hcf(int num1, int num2) {
        if (num1 == 0) {
            return num2;
        }
        return hcf(num2%num1, num1);
    }

    static int lcm(int num1, int num2) {
        return num1 * num2 / hcf(num1, num2);
    }
}
