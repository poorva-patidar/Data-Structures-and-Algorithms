package Arrays;

public class AverageSalary {
    public static void main(String[] args) {
        int[] salary = {48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,
                77000,33000,28000,4000,54000,67000,6000,1000,11000};
        System.out.println(average(salary));
    }
    public static double average(int[] salary) {
        int max = salary[0];
        int min = salary[0];

        for(int i = 0; i < salary.length; i++){
            if(salary[i] > max){
                max = salary[i];
            }

            if(salary[i] < min){
                min = salary[i];
            }
        }

        int sum = 0;
        for(int i = 0; i < salary.length; i++){
            if(salary[i] != max && salary[i] != min){
                sum += salary[i];
            }
        }
        double avg = (double) sum / (salary.length - 2);

//        // double factor = 1e5; // = 1 * 10^5 = 100000.
//        // return Math.round(avg * factor) / factor;
//        //this is not working when there are actually numbers after decimals
        return Double.valueOf(String.format("%1$.5f", avg));
    }
}
