class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int fromLeft = 0;
        int fromRight = 0;

        for(int i = 0;i<moves.length();i++){
            if(moves.charAt(i) == 'L' || moves.charAt(i) == '_'){
                fromLeft-=1;
            }else if(moves.charAt(i) == 'R'){
                fromLeft+=1;
            }
        }

        for(int i = 0;i<moves.length();i++){
            if(moves.charAt(i) == 'L'){
                fromRight-=1;
            }else if(moves.charAt(i) == 'R' || moves.charAt(i) == '_'){
                fromRight+=1;
            }
        }

        if(Math.abs(fromLeft) > Math.abs(fromRight)){
            return Math.abs(fromLeft);
        }

        return Math.abs(fromRight);
    }
}