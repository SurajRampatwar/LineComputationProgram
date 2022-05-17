import java.util.Objects;
import java.lang.*;

public class UC3_EqualGreaterLess {
    static double length(int x1, int x2, int y1, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);
    }

    static double length2(int p1, int p2, int q1, int q2) {
        return Math.sqrt(Math.pow(p1 - p2, 2) + Math.pow(q1 - q2, 2) * 1.0);
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Computation Program");
        Double line1 = Math.round(length(5, 7, 8, 9)) * 100000.0 / 100000.0;
        Double line2 = Math.round(length2(5, 7, 8, 9)) * 100000.0 / 100000.0;
        System.out.println("The Equality of two Lines is Equal = " + (Objects.equals(line2, line1)));
        int result = line1.compareTo(line2);
        if (result == 0) {
            System.out.println("line1 and line to are equal = " + result);
        } else if (result > 0) {
            System.out.println("line1 is greater than line2 = " + result);
        } else
            System.out.println("Line1 is less than line2 = " + result);

    }
}

