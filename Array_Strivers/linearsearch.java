public class linearsearch {
    public static int LinearSearch(int arr[], int key){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==key){
                return i+1;
            }
        }
        return -1;
    }

    public static void resultofSearch(int arr[], int key){
        int value = LinearSearch(arr,key);

        if(LinearSearch(arr, key)==-1){
            System.out.println(key+" Not Found!!!");
        }
        else{
            System.out.println(key+" is at : "+value);
        }
    }


    public static void main(String[] args) {
        int[] arr = {6,9,45,10,78,37};
        int key1 = 78;
        int key2 = 2;

        resultofSearch(arr, key1);
        resultofSearch(arr, key2);
    }
}
