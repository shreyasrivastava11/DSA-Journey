//Brute Force
class Solution {
    public int maxDistance(int[] colors) {
        int max = 0;

        for(int i = 0;i<colors.length;i++){
            for(int j = i+1;j<colors.length;j++){
                if(colors[i] != colors[j] && max < Math.abs(i - j)){
                    max = Math.abs(i - j);
                }
            }
        }

        return max;
    }
}

//Optimized Approach
class Solution {
    public int maxDistance(int[] colors) {
        int j = colors.length - 1;
        int max = 0;
        int max1 = 0;

        for(int i = j;i>=0;i--){
            if(colors[i] != colors[0]){
                max = Math.abs(i - 0);
                break;
            }
        }

        for(int i = 0;i<colors.length;i++){
            if(colors[i] != colors[colors.length - 1]){
                max1 = Math.abs(i - (colors.length - 1));
                break;
            }
        }

        return Math.max(max1, max);
    }
}
