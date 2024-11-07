package DSA.Questions_1_300.Question5;

public class RotateArray {

    public static void main(String[] args) {
        int []ar = {1,2,3,4,5,6,7,8,9};
        rotateArray(ar, 3);
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]);
        }
    }

    public static void rotateArray(int[] ar, int k){
        int length = ar.length;
        int last;
        while(k>0){
            last = ar[length-1];
            for(int i =length-1; i>0 ;i--){
                ar[i] = ar[i-1];
            }
            ar[0] = last;
            k--;
        }
    }
    
}
