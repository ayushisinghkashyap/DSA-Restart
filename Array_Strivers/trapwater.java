public class trapwater {
    public static int trappingWater(int height[],int n){

        
        int totaltrapwater = 0;
        for (int i = 0; i < n; i++) {
            int maxR = 0;
            int maxL = 0;
            for (int j = 0; j < i; j++) {
                maxL = Math.max(maxL, height[j]);
            }
            for (int j = i+1; j < n; j++) {
                maxR = Math.max(maxR, height[j]);
            }
            
            int minh = Math.min(maxR, maxL);
            int trapwater = minh - height[i];
            if(trapwater > 0){
                totaltrapwater += trapwater;
            }
        }
        return totaltrapwater;
    }

    public static void main(String[] args) {
        int n = 7;
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappingWater(height, n));
    }
}
