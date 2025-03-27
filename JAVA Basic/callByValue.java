public class callByValue {
    public static int swap_func(int a , int b){

        int temp = a;
        a = b;
        b = temp;
        System.out.println("a func: "+a);
        return b;
    }

    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        // the a and b are different from the parameters given to above function

        System.out.println("b func:"+ swap_func(a, b)); //only the value passes to the function
        // even after swapping this will not change the arguments value 
        // concept of call stack used here 
        // remember that java follows call by value 
        // and C follows call by reference  

        System.out.println("a main:"+a); // will print the value defined in main function 
        System.out.println("b main:"+b); 
    }
}
