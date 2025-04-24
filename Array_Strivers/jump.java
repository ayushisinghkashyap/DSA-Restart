public class jump {
    public static int minJumps(int[] arr) {
        int count = 0;
        int i =0;
        while(i<arr.length){
            if(arr[i] == 0){
                count = -1;
                break;
            }
            else{
                i += arr[i];
                if(i<=arr.length){
                    count++;
                }
                if(i>=arr.length){
                    int diff = arr[i] - arr.length;
                    i = i - diff -1 ;
                    count++;
                    break;

                }
                // if(i == arr.length-1){
                //     count++;
                // }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] ={1,4,3,2,6,7};
        System.out.println(minJumps(arr));
    }
}
