public class argument_parameters {
    public static int argument_parameters_func(int a, int b){ 
        // Here a and b are parameters or formal parameters

        int sum = a+b;
        return sum;

    }
    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        System.out.println(argument_parameters_func(a, b));
        // Here a and b are arguments or actual parameters

    }
}
