public class leftRotate_Dplace {
    public static void LeftRotateArrayD_place(int arr[], int d){
        int n=arr.length;
        int tarr[] = new int[n];

        for(int i = 0;i<n-d;i++){
            tarr[i]=arr[i+d];
            
        }
        int j=0;
        for(int i = n-d;i<n;i++){
            tarr[i] = arr[j];
            j++;
        }

        for(int i = 0;i<n;i++){
            System.out.print(tarr[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int d = 3 ;
        LeftRotateArrayD_place(arr, d);

    }
}
