package DSA.Questions_1_300.Question11;

public class TwoSum {
    public static void main(String[] args) {
        int [] ar = {1,2,3,4,5,6,7,8,9};
        int [] result = findTwoSum(ar, 17);
        System.out.print("{");
        for(int num:result){
            System.out.print(" "+num+" ");
        }
        System.out.print("}");
    }

    public static int[] findTwoSum(int [] ar, int target){
        int [] n = new int[2];
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if((ar[i]+ar[j]) == target){
                    n[0] = i;
                    n[1] = j;
                    break;
                }
            }
        }
        return n;
    }
    
}
