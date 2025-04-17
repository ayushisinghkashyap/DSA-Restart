public class stringGreat {
    public static void makeStringGreat(String str){ // str = leEeetcode
        String tempstr = "";
        int k = 0;
        int count = 0;
        while(k < str.length()){ // k= 0 , 1
            int asciiCurr = str.charAt(k);  // l = 108 , e = 101
            int Capdiff = asciiCurr - 32;   // 108-32 = 76 = L ,  101 - 32 = 69 = E
            for (int j = k+1; j < str.length(); j++) {  // 1 round->e to last  , 2 round->E j = 2
                int next = str.charAt(j);  //  1 round-> e = 101 to last complete , 2 round-> E = 69
                if(next == Capdiff){       //2 round-> T
                    count =0;
                    k = j+1;  // k = 2+1 = 3 , this step ensures that the loop will check towards
                    break;
                }
                else{    // T  
                    count = 1; //  1 to last , no L or no char has ascii value 76
                }
            }
            
            if(count == 1 && k<str.length()){ // 1
                tempstr += str.charAt(k);    // tempstr = l
                k++;                         // k = 1
            }
            
        }
        System.out.println(tempstr);
    }

    public static void main(String[] args) {
        String str = "abBAcC"; // str = "leEeetcode";
        makeStringGreat(str);
    }
}
