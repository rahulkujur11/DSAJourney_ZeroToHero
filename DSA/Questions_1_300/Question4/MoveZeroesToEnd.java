package DSA.Questions_1_300.Question4;

public class MoveZeroesToEnd {

    public static void main(String[] args) {
        int []ar = {1, 0, 1, 2, 0, 3, 4, 4, 0, 6, 7};
        moveZeroes(ar);
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]);
        }
    }

    public static void moveZeroes(int[] ar){
        int length = ar.length;
        int [] temp = new int[length];
        int j = 0;

        for(int i=0;i<length;i++){
            if(ar[i]!=0){
                temp[j++] = ar[i];
            }
        }

        while(j<length){
            temp[j++] = 0;
        }

        for(int i=0;i<j;i++){
            ar[i] = temp[i];
        }



    }    
}
