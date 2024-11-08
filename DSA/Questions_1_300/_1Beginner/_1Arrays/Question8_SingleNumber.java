package DSA.Questions_1_300._1Beginner._1Arrays;


public class Question8_SingleNumber {
    public static void main(String[] args) {
        int []ar = {4,4,9,2,2,1,1,3,3};
        int result = findSingleNumber(ar);
        System.out.println(result);
    }

    public static int findSingleNumber(int [] ar){
        int uniqueId=0;
        for(int num: ar){
            System.out.println("Debug");
            uniqueId ^= num;
            System.out.println("Debug");
        }

        return uniqueId;
    }
}
