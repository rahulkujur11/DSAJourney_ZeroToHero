package DSA.Questions_1_300;

import java.util.HashMap;

public class Imp_Question9_NSubArraySum {
    public static void main(String[] args) {
        int []ar = {3, 4, 7, 2, -3, 1, 4, 2, 1};
        int result = findSubArraySum(ar, 7);
        System.out.println(result);
    }

    public static int findSubArraySum(int [] ar, int k){
        int prefixSum = 0;
        int count = 0;
        HashMap<Integer, Integer> sumCount = new HashMap<>();
        sumCount.put(0, 1);  // To handle the case where a subarray starts from index 0

        for (int num : ar) {
            prefixSum += num;

            // Check if prefixSum - k exists in the map
            if (sumCount.containsKey(prefixSum - k)) {
                count += sumCount.get(prefixSum - k);
            }

            // Add prefixSum to the map or update its count
            sumCount.put(prefixSum, sumCount.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}
