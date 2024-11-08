package DSA.Questions_1_300._1Beginner._1Arrays.Question1;


public class LargestNumberInArray {

    public static void main(String[] args) {
        int [] array = {101, 20, 99, 4, 45, 9};
        int result = findLargestNumber(array);
        System.out.println(result);
    }

    public static int findLargestNumber(int[] array){
        int max = array[0];
        for(int i=0; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
    
}
