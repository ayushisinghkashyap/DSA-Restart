public class func_overloading {
    
    public static int func(int a , int b){
        return a+b;
    }

    public static float func(float a , int b){  // overloading using datatype
        return a+b;
    }

    /* changing parameters name and datatype , return datatype , 
    func name is same then still show error */

    // number of parameters or data type of parameters should be different for overloading
    
    public static float func(int a ){  // overloading using parameters
        return a+10;
    }

    public static double func(int a , int b , float c ){ // overloading using parameters
        return a+b+c;
    }

    public static void main(String[] args) {
        int n1 = 6;
        int n2 = 7;
        float n3 = 10;

        System.out.println(func(n1, n2));
        System.out.println(func(n3, n2));
        System.out.println(func(n2));
        System.out.println(func(n1, n2, n3));
    }
}
