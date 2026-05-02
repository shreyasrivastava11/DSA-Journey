class Solution {
    public int rotatedDigits(int n) {
        int cnt = 0;

        for(int i = 1;i<=n;i++){
            if(isGood(i)){
                cnt+=1;
            }
        }
        return cnt;
    }

    public boolean isGood(int i){
        boolean value = false;
        while(i != 0){
            int rem = i % 10;
            i = i / 10;

            if(rem == 3 || rem == 4 || rem == 7){
                return false;
            }else if(rem == 2 || rem == 5 || rem == 6 || rem == 9){
                value = true;
            }
        }

        return value;
    }
}