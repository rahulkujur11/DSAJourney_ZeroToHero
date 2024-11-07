package DSA.Questions_1_300.Question11;

import java.util.HashMap;

public class OptimalApproach {
    public static void main(String[] args) {
        int [] ar = {1,2,3,4,5,6,7,8,9};
        int [] result = findTwoSum(ar, 9);
        System.out.print("{");
        for(int num:result){
            System.out.print(" "+num+" ");
        }
        System.out.print("}");
    }

    public static int[] findTwoSum(int [] ar, int target){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0;i<ar.length;i++){
            int complement = target - ar[i];
            if(hashMap.containsKey(complement)){
                return new int[]{hashMap.get(complement), i};
            }
            hashMap.put(ar[i], i);
        }
        return new int[0];
    }
}
