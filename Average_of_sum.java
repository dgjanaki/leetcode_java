import java.util.Scanner;

public class Average_of_sum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers you want to enter:");
        int total_no_inputs = input.nextInt();

        int sum = 0;
        int avg;

        for(int i = 1; i <= total_no_inputs; i++) {

            System.out.println("Enter number:");
            int n = input.nextInt();

            sum = sum + n;
            
        }
        System.out.println("sum  : " +sum);
        avg = sum / total_no_inputs;

        System.out.println("Average = " + avg);
    }
}