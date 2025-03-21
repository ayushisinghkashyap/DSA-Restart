public class binary_search {
    public static int binarysearch(int arr[], int key){
        int n =arr.length;
        int start = 0;
        int end = n-1;

        while (start<=end){
            int mid = (start+end)/2;
            if(key == arr[mid]){
                return mid+1;
            }
            if(key>arr[mid]){
                start=mid+1;
            }
            if(key<arr[mid]){
                end=mid-1;
            }
        }
        return -1;

    }

    public static void resultofSearch(int arr[], int key){
        int value = binarysearch(arr,key);

        if(binarysearch(arr, key)==-1){
            System.out.println(key+" Not Found!!!");
        }
        else{
            System.out.println(key+" is at : "+value);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,4,6,7,8,9};
        int key = 7;
        int key2 = 10;
        resultofSearch(arr, key);
        resultofSearch(arr, key2);
    }
}
