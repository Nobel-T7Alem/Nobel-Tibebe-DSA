package Question3;
import java.util.Arrays;

public class q3 {
    public static char[] bubbler(char[] nums){
        for (int i = nums.length; i > 0; i--){
            for(int j = 1; j < i; j++){
                int a =  nums[j];
                int b = nums[j-1];
                if( a < b){
                    char temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
        return(nums);
    }

    public static void main(String[] args) {
        char[] letters= {'a','f','b', 'd','c'};
        System.out.println(Arrays.toString(bubbler(letters)));
    }
}