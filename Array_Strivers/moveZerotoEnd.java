public class moveZerotoEnd {
    public static void ZeroToEndArray(int arr[]){
        int temparr[] = new int[arr.length];
        int n =arr.length;
        int j=0;
        for (int i = 0; i < temparr.length; i++) {
            if(arr[i]!=0){
                temparr[j] = arr[i];
            }
            else{
                temparr[n-j-1] = arr[i];
            }
            j++;
            
        }
//not done
        for (int i = 0; i < temparr.length; i++) {
            System.out.print(temparr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,0,2,3,0,4,0,1};
        ZeroToEndArray(arr);
    }
}
