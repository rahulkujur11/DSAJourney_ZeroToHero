package DSA.Questions_1_300.Question3;

public class removeDuplicates {
    public static void main(String[] args) {
        int []ar = {1,1, 1, 2, 2, 3, 4, 4, 5, 6, 7};
        int length = removeDuplicate(ar);
        for(int i=0;i<length;i++){
            System.out.print(ar[i]);
        }
    }
    
    public static int removeDuplicate(int[] ar){
        int counter = 1;
        for(int i=1;i<ar.length;i++){
            if(ar[i]!=ar[i-1]){
                ar[counter] = ar[i];
                counter++;
            }
        }
        return counter;
    }
}
