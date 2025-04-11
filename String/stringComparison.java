public class stringComparison {
    public static void main(String[] args) {
        String s1 = "Arya";     
        String s2 = "Arya";    // this s2 represents s1 and both are same at object level 
        String s3 = new String("Arya");

        if(s1 == s2){                                      // this will true 
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        if(s1 == s3){                                     // this will return flase cause == checks at onject level not value 
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }


        // .equals()   ,  this will compare the values 

        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}
