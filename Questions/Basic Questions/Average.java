public class Average {
    public static void main(String[] args) {
        int[] arr = {1, 8, 4, 3, 2, 5, 6, 9};

        int sum = 0;
        for (int ele: arr) {
            sum = sum + ele;
        }

        float avg = (float) (sum / arr.length);
        System.out.println(avg);

    }
}
