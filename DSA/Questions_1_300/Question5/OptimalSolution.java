package DSA.Questions_1_300.Question5;

public class OptimalSolution {

    public static void main(String[] args) {
        int []ar = {1,2,3,4,5,6,7,8,9};
        rotateArray(ar, 8);
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]);
        }
    }

    public static void rotateArray(int[] ar, int k){
        int length = ar.length;
        reverse(ar, 0, length-1);
        reverse(ar, 0, k-1);
        reverse(ar, k, length-1);

    }


    public static void reverse(int [] ar, int start, int end){
        while(start<=end){
            int temp = ar[end];
            ar[end] = ar[start];
            ar[start] = temp;
            start++;
            end--;
        }
    }
    
}
