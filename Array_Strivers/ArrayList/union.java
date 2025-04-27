import java.util.ArrayList;

public class union {
    public static ArrayList<Integer> unionArrays(int arr1[] , int arr2[]){
        ArrayList<Integer> union = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            if(union.contains(arr1[i]) == false){
                union.add(arr1[i]);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if(union.contains(arr2[i]) == false){
                union.add(arr2[i]);
            }
        }
        return union;
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,7,8,9,10}; 
        int arr2[] = {2,3,4,4,5,11,12};
        System.out.println(unionArrays(arr1, arr2));
    }
}
