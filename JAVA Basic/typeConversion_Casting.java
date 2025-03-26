public class typeConversion_Casting {
    public static void main(String[] args) {
        int myint = 6;
        float myfloat = 4.5f;
        long mylong = 67893L;
        double mydouble = 89.677; 
        
        System.out.println("Int: "+myint);
        System.out.println("Float: "+myfloat);
        System.out.println("Long: "+mylong);
        System.out.println("Double: "+mydouble);
    
        //type conversion
        //smaller data type converted to larger data type 
        float intToFloat = myint;
        System.out.println("Int to Float: "+intToFloat);

        double intToDouble = myint;
        System.out.println("Int to Double : "+ intToDouble);

        float floatToDouble = myfloat;
        System.out.println("Float to Double: "+floatToDouble);

        double longToDouble = mylong;
        System.out.println("Long to Double: "+longToDouble);


        //type casting
        //larger data type converted to smaller data type
        int floatToInt = (int) myfloat;
        System.out.println("Float to Integer: "+floatToInt);

        float doubleToFloat = (float) mydouble;
        System.out.println("Double to Float: "+doubleToFloat);

        int longToInt = (int) mylong;
        System.out.println("Long to Int: "+longToInt);

        long doubleToLong = (long) mydouble;
        System.out.println("Double to Long: "+doubleToLong);

    }
}
