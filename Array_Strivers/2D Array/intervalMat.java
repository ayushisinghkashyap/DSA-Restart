public class intervalMat {
    public static void merge(int[][] intervals) {
        int temp[][] = new int[intervals.length][intervals[0].length];
        int m = intervals.length;

        if(m == 1){
            System.out.print(intervals[0][0]+" "+intervals[0][1]);
        }
        else{
            for(int i=0;i<intervals.length-1;i++){

                if(intervals[i][1] >= intervals[i+1][0] || intervals[i][0] >= intervals[i+1][0]){
                    temp[i][0] = Math.min(intervals[i][0],intervals[i+1][0]);
                    temp[i][1] = Math.max(intervals[i+1][1],intervals[i][1]);
                    i++;
                }
                else{
                    temp[i][0] = intervals[i][0];
                    temp[i][1] = intervals[i][1];
                    if(i == m-2){
                        temp[i+1][0] = intervals[i+1][0];
                        temp[i+1][1] = intervals[i+1][1];
                    }
                }
            }
            int count = 0;
            for (int i = 0; i < temp.length; i++) {
                if(temp[i][0] == 0 && temp[i][1] == 0){
                    count++;
                    for (int j = i; j < temp.length-1; j++) {
                        temp[j][0] = temp[j+1][0];
                        temp[j][1] = temp[j+1][1];
                    }
                }
            }

            int newmat[][] = new int[m-count][2];
            for (int i = 0; i < newmat.length; i++) {
                newmat[i][0] = temp[i][0];
                newmat[i][1] = temp[i][1];
            }
            for (int i = 0; i < newmat.length; i++) {
                for (int j = 0; j < 2; j++) {
                        System.out.print(newmat[i][j]+" ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,4},{0,4}};
        // int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        // int[][] intervals = {{1,4},{4,5}};
        
        merge(intervals);
    }
}
