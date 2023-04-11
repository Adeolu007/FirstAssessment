package FirstAssessment;
//6.24 (Perfect Numbers) An integer number is said to be a perfect number if its factors, including
//        1 (but not the number itself), sum to the number. For example, 6 is a perfect number, because 6 =
//        1 + 2 + 3. Write a method isPerfect that determines whether parameter number is a perfect number.
//        Use this method in an application that displays all the perfect numbers between 1 and 1000. Display
//        the factors of each perfect number to confirm that the number is indeed perfect. Challenge the computing power of your computer by testing numbers much larger than 1000. Display the results
public class PerfectNumbers {
    public static boolean perfectNumbers(int n){


        int sum = 0;
        String num ="";


        for (int i = 1; i < n; i++) {

            if (n % i == 0) {
                sum += i;
                num = num + String.valueOf(i);
            }

        }
        System.out.println(num);
        if (sum == n)
            return true;

        return false;
    }
    public static void main(String[] args) {


        boolean b = perfectNumbers(28);
        if (b) System.out.println("it is a perfect number");
        else System.out.println("it is not a perfect number");
    }
}
