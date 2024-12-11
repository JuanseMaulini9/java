public class OperadorOr {
    public static void main(String[] args) {
        boolean a = true, b = false, result;

        result = a || b;
        System.out.println("result (a = true, b = false) = " + result);
        a = false;
        result = a || b;
        System.out.println("result (a = false, b = false) = " + result);
    }
}
