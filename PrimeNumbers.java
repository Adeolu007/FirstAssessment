package FirstAssessment;

public class PrimeNumbers {
    static void checkPrime(int value){
        boolean isPrime = true;
    if (value>2){
        for (int i = 2; i <=Math.sqrt(value) ;i++){
            if (value % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime){
            System.out.println(value +" is a prime number");
     }


    }}

    public static void primeNumberLessthan10000(){
        for (int i=2; i<=10000;i++){
            checkPrime(i);
        }
    }
    public static void main(String args[]){
//        checkPrime(1);
//        checkPrime(3);
//        checkPrime(17);
        primeNumberLessthan10000();
    }
}

