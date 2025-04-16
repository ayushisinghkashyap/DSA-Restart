public class search {
    public static String SearchinMatrix(int arr[][] , int key){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == key){
                    count++;
                }
            }
        }

        if(count == 0){
            return "Not Found";
        }
        return "Found";
    }

    public static void main(String[] args) {
        int arr[][] = {{11,23,87},{45,56,67},{73,18,24}};
        int key = 56;
        System.out.println(SearchinMatrix(arr, key));
    }
}
