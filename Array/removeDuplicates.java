import java.util.Arrays;
class removeDuplicates{
    public static void main (String[] args){

    int[] nums = {1,2,3,2,1,3,5};
    Arrays.sort(nums);

    int i = 0;

    for(int j=1; j < nums.length; j++){
        if(nums[i]!=nums[j]){
            i++;
            nums[i] = nums[j];
        }
    }

    System.out.println(i+1);
    
    }
}