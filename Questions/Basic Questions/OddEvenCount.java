public class OddEvenCount {
    public static void main(String[] args) {
        int[] arr = { 1, 8, 3, 98, 56, 23};
        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                evenCount++;
            } else{
                oddCount++;
            }
        }

        System.out.println("Even: " + evenCount + " Odd: " + oddCount);
    }
}
