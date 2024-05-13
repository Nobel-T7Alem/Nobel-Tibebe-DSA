package Labexam;
import java.util.Arrays;

public class q6 {

    int[] array;
    q6(int[] array){
        this.array = array;
    }

    public int[] deleteMethod(int[] array, int index){
        if (index < 0 || index >= array.length){
            System.out.println("Invalid Index entered");
            return(array);
        }else{
            int[] arr2 = new int[array.length - 1];
            for (int i = 0 ; i < arr2.length; i++){
                if(i < index){
                    arr2[i] = array[i];
                }
                else if(i >= index){
                    arr2[i] = array[i+1];
                }
            }
            return(arr2);
        }
    }

    public static void main(String[] args) {
        int[ ] array= {3,7,6,9,4};
        q6 n = new q6(array);
        array = n.deleteMethod(array, 3);
        System.out.println(Arrays.toString(array));

    }
}