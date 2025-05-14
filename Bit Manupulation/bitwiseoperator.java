public class bitwiseoperator {

    public static void main(String[] args) {
        
        // Binary AND (&)
        int a = 20 , b = 4;
        int c = a & b;
        System.out.println("AND of two numbers : "+c);

        // Binary OR (|)
        int cOR = a | b; 
        System.out.println("OR of two numbers : "+cOR);

        // Binary XOR (^)
        int cxor = a ^ b;
        System.out.println("XOR of two numbers : "+cxor);

        //Binary left shift(<<)
        int i = 2;
        int cleft = a << i;
        System.out.println("i times left shit of a number : "+cleft);

        //Binary right shift (>>)
        int cright = a >> i;
        System.out.println("i times right shit of a number : "+cright);

        // Binary 1's compliment (~)
        int cOnes = ~a;
        System.out.println("1's compliment of a number : "+cOnes); 
        // it will give negative number because it find 2's compliment(1's compliment + 1)
        // checks the MSB of binary form of num after 1's compliment 
        // which is 1 means output num will be negative
    }
}