public class math_class {
    public static void main(String[] args) {
         
        int a = 10;
        int b = 2;
        int c = -8;

        int min = Math.min(a, b);
        System.out.println("Minimum between 10 and 2 : "+min);
        int max = Math.max(a, b);
        System.out.println("Maximum between 10 and 2 : "+max);
        int a_sqrt = (int) Math.sqrt(a); // Math.sqrt(double a) -> used type casting 
        System.out.println("Square root of 10 : "+a_sqrt);
        int b_sqrt = (int) Math.sqrt(b);
        System.out.println("Square root of 2 : "+b_sqrt);
        int pow = (int) Math.pow(a, b);
        System.out.println("10 to the 2 : "+pow);
        //int avga = Math.avg(a,b);
        int abs_c = (int) Math.abs(c);
        System.out.println("Absolute value of -8: "+abs_c);
    }
}
