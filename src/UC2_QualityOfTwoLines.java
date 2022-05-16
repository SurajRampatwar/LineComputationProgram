import java.lang.*;
import java.util.Objects;

public class UC2_QualityOfTwoLines {
    static double length(int x1, int x2, int y1, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);
    }

    static double length2(int p1, int p2, int q1, int q2) {
        return Math.sqrt(Math.pow(p1 - p2, 2) + Math.pow(q1 - q2, 2) * 1.0);
    }

    public static void main(String[] args) {
            System.out.println("Welcome To Line Comparison Computation Program");
        double line1 = Math.round(length(5, 7, 8, 9)) * 100000.0 / 100000.0;
        double line2 = Math.round(length2(5, 7, 8, 9)) * 100000.0 / 100000.0;
            //if (Objects.equals(line2,line1))
           // {
                System.out.println( "The Equality of two Lines is Equal " +(Objects.equals(line2,line1)));
            //}
            //else {
                //System.out.println(line1+ " line1 Are Not Equal to line2 " + line2 );
            //}
            }
}
