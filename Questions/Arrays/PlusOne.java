package Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        digits[i] += 1;
         while(i > 0){
             if(digits[i] > 9){
                 digits[i] = digits[i] % 10;
                 digits[i - 1] += 1;
             } else{
                 break;
             }

             i--;
         }

         if(digits[0] > 9){
             int[] arr = new int[digits.length + 1];
             digits[0] %= 10;
             arr[0] = 1;
             for (int j = 0; j < digits.length; j++) {
                 arr[j + 1] = digits[j];
             }

             digits = arr;
         }

         return digits;
    }
}
