class Solution {
    public String processStr(String s) {
        StringBuilder result = new StringBuilder();

        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '#'){
                result = duplicates(result);
            }else if(s.charAt(i) == '*'){
                result = removal(result);
            }else if(s.charAt(i) == '%'){
                result = reverses(result);
            }else{
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }

    public StringBuilder reverses(StringBuilder ans){
        return ans.reverse();
    }

    public StringBuilder duplicates(StringBuilder ans){
        return ans.append(ans);
    }

    public StringBuilder removal(StringBuilder ans){
        StringBuilder result = new StringBuilder();
        for(int i = 0;i<ans.length()-1;i++){
            result.append(ans.charAt(i));
        }

        return result;
    }
}