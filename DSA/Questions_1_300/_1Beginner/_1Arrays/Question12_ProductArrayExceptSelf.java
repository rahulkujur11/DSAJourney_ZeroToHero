package DSA.Questions_1_300._1Beginner._1Arrays;

public class Question12_ProductArrayExceptSelf {
    public static void main(String[] args) {
        int [] nums = {-1, 1, 0, -3, 3};
        int[] results = findProductOfArrayExceptSelf(nums);
        for(int num:results)
        {
            System.out.print(" "+num+" ");
        }
    }

    public static int [] findProductOfArrayExceptSelf(int [] nums){

        int length = nums.length;

        int [] prefixProduct = new int[length];
        int [] suffixProduct = new int[length];

        int currentPrefixProduct = 1;
        for(int i=0;i<length;i++){
            prefixProduct[i] = currentPrefixProduct;
            currentPrefixProduct = currentPrefixProduct * nums[i];
            
        }
        int currentSuffixProduct = 1;
        for(int i=length-1;i>=0;i--){
            suffixProduct[i] = currentSuffixProduct;
            currentSuffixProduct = currentSuffixProduct * nums[i];
        }

        int [] productArray = new int[length];
        for(int i=0; i<length; i++){
            productArray[i] = suffixProduct[i] * prefixProduct[i];
        }
        return productArray;
    }
    
}
