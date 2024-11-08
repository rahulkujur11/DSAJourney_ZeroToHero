package DSA.Questions_1_300._1Beginner._1Arrays.Question6;

import java.util.HashSet;
import java.util.Set;

public class IntersectionArray {

    public static void main(String[] args) {
        int []ar1 = {1,2,3,4,5};
        int []ar2 = {6,8,9,7};
        int[] result = findArray(ar1, ar2);
        
        for(int num: result){
            System.out.print(num);
        }
    }
    public static int[] findArray(int []ar1, int []ar2){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        for(int num: ar1){
            set1.add(num);
        }

        for(int num: ar2){
            if(set1.contains(num)){
                resultSet.add(num);
            }
        }

        int[] result = new int[resultSet.size()];
        int i=0;
        for(int num: resultSet){
            result[i++]=num;
        }

        return result;

    }
    
}
