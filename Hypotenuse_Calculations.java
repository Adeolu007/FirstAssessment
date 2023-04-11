package FirstAssessment;
//6.15 (Hypotenuse Calculations) Define a method hypotenuse that calculates the hypotenuse of
//        a right triangle when the lengths of the other two sides are given. The method should take two arguments of type double and return the hypotenuse as a double. Incorporate this method into an
//        application that reads values for side1 and side2 and performs the calculation with the hypotenuse
//        method. Use Math methods pow and sqrt to determine the length of the hypotenuse for each of the
//        triangles in Fig. 6.14. [Note: Class Math also provides method hypot to perform this calculation.]
public class Hypotenuse_Calculations {

    public double hypo (double a, double b){

        a = Math.pow(a, 2);
        b= Math.pow(b, 2);

        double hypothenuse = Math.sqrt(a+b);
        return hypothenuse;
    }



    public static void main(String[] args) {
        Hypotenuse_Calculations newAns = new Hypotenuse_Calculations();
        System.out.println(newAns.hypo(5,3));
    }
}
