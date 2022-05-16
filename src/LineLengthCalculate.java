public class LineLengthCalculate {
    static double length(int x1, int x2, int y1, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)*1.0);
    }
    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Computation Program");
        System.out.println("Length of the line is = "+Math.round(length(5,7,5,9))*100000.0/100000.0);

    }
}
