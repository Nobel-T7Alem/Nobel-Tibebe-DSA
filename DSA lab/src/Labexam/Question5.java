package Labexam;

import java.util.Arrays;

public class Question5 {
    public static int[] merger(int[] nums, int[] left, int[] right){
        int i = 0;
        int j = 0;
        int k = 0;
        while((i < left.length ) && (j < right.length)){
            if (left[i] < right[j]){
                nums[k] = left[i];
                k++; i++;
            }else if (left[i] >= right[j]){
                nums[k] = right[j];
                k++; j++;
            }
        }

        while(i<left.length){
            nums[k] = left[i];
            k++; i++;
        }
        while(j< right.length){
            nums[k] = right[j];
            k++;j++;
        }

        return(nums);
    }
    public static int[] msplit (int[] nums){
        if (nums.length == 1){
            return(nums);
        }
        int[] half = new int[nums.length/2];
        int[] otherhalf = new int[nums.length - half.length];

        for (int i = 0, j = 0; i < nums.length; i++){
            if (i < half.length){
                half[i] = nums[i];
                continue;
            }else if ( i < nums.length){
                otherhalf[j] = nums[i];
                j++;
            }
        }

        int [] left = msplit(half);
        int [] right = msplit(otherhalf);
        return(merger(nums, left, right));
    }

    public static void main(String[] args) {
        int[] nums = {6,1,2,3,4,5,1,2,1,1,5};
        System.out.println(Arrays.toString(msplit(nums)));
    }

}