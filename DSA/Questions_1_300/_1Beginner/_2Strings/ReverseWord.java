package DSA.Questions_1_300._1Beginner._2Strings;

public class ReverseWord {

    public static void main(String[] args) {
        String s = "Hello World I am Rahul";
        String result = reverseWord(s);
        System.out.println(result);
    }

    public static String reverseWord(String s){
        String regex = "[,\\.\\s]";
        String[] words = s.trim().split(regex);
        
        int left = 0;
        int right = words.length-1;

        while(left<right){
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }

        return String.join(" ", words);
    }
    
}
