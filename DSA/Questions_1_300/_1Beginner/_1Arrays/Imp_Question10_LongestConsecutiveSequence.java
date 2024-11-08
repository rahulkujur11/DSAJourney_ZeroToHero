package DSA.Questions_1_300._1Beginner._1Arrays;

import java.util.Set;
import java.util.HashSet;

public class Imp_Question10_LongestConsecutiveSequence {
    public static void main(String[] args) {
        int [] ar = {0, 3, 19, 2, 5, 16, 48, 6, 0, 1};
        int result = LongestConsecutiveSequence(ar);
        System.out.println(result);

    }

    public static int LongestConsecutiveSequence(int []ar){
        Set<Integer> set = new HashSet<>();
        if(ar.length == 0){
            return 0;
        }
        for(int num: ar){
            set.add(num);
        }

        int maxLength = 0;
        for(int num:ar){
            System.out.println("DEBUG");
            if(!set.contains(num-1)){
                System.out.println("DEBUG");
                int currentNum = num;
                int currentLength = 1;
                System.out.println("DEBUG");
                while(set.contains(currentNum+1)){
                    System.out.println("DEBUG");
                    currentNum++;
                    currentLength++;
                    System.out.println("DEBUG");
                }
                maxLength = Math.max(maxLength, currentLength);
                System.out.println("DEBUG");
            }
        }


        return maxLength;
    }
}
