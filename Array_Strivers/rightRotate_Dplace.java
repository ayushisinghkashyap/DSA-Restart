public class rightRotate_Dplace {
    public static void RightRotateArrayD_place(int arr[], int d){
        int n=arr.length;
        int tarr[] = new int[n];
        int j=0;
        for(int i = d-1;i<n;i++){
            tarr[i]=arr[j];
            j++;
        }
        int k = n-d;
        for(int i = 0;i<d;i++){
            tarr[i] = arr[k];
            k++;
        }

        for(int i = 0;i<n;i++){
            System.out.print(tarr[i]+ " ");
        }
    }
// Still Working on it ....
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int d = 2 ;
        RightRotateArrayD_place(arr, d);

    }
}