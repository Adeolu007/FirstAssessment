package FirstAssessment;
//6.26 (Calculating the Sum of Digits) Write a method that takes a four-digit integer value and
//        returns the sum of the digits. For example, given the number 7631, the method should return 17.
//        Incorporate the method into an application that reads a value from the user and displays the result.

public class SumOfDigits {


    public static int sumOfDigits(int numbers) {
        int sum = -1;
        if (String.valueOf(numbers).length() == 4) {
            sum = 0;
            while (numbers > 0) {
                sum += numbers % 10;
                numbers /= 10;
            }
        }
        return sum;
    }

        public static void main (String[]args) {
            System.out.println(sumOfDigits(45214));
            System.out.println(sumOfDigits(4521));
            System.out.println(sumOfDigits(452));
        }
    }
