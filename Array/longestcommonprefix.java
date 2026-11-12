import java.util.Arrays;
class Solution {
    public static void main(String[] args) {
         StringBuilder result = new StringBuilder();

    String[] strs = {"krishna","krish","krpp"};

    Arrays.sort(strs);      
   
    char[] first = strs[0].toCharArray();
    char[] last = strs[strs.length-1].toCharArray();

    for(int i =0; i<first.length; i++){
        if(first[i] != last[i]){
            break;
            }

    result.append(first[i]);
  
    }
 result.toString();

        
    }
}