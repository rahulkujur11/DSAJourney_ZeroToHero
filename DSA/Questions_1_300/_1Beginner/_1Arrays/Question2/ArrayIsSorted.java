package DSA.Questions_1_300._1Beginner._1Arrays.Question2;

public class ArrayIsSorted {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        boolean result = IsArraySorted(array);
        System.out.println(result);
    }
    public static boolean IsArraySorted(int[] array){
        for(int i=1;i<array.length-1;i++){
            if(array[i] < array[i-1])
            return false;
        }
        return true;
    }
}
