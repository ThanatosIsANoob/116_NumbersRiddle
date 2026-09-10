public class Riddle{
    //algorithm for ints
    public static void calculateInt(int a){
        System.out.println("Original number: " + a);
        int originalA = a;
        a *= 2;
        System.out.println("Multiply by 2:" + a);
        a += 6;
        System.out.println("Add 6: " + a);
        a /= 2;
        System.out.println("Divide by 2: " + a);
        a -= originalA;
        System.out.println("Final Number:" + a + "\n");

    };
    //algorithm for doubles
    public static void calculateDouble(double a){
        System.out.println("Original number: " + a);
        double originalA = a;
        a *= 2;
        System.out.println("Multiply by 2:" + a);
        a += 6;
        System.out.println("Add 6: " + a);
        a /= 2;
        System.out.println("Divide by 2: " + a);
        a -= originalA;
        System.out.println("Final Number:" + a + "\n");
    };
    //main
    public static void main(String[] args){
        int posInt = 2;
        int negInt = -2;
        int zero = 0;
        int one = 1;
        double posDouble = 2.00;
        double negDouble = -2.00;
        //user input
        int startingNum = 47;

        //testcases
        calculateInt(posInt);
        calculateInt(negInt);
        calculateInt(zero);
        calculateInt(one);
        calculateDouble(posDouble);
        calculateDouble(negDouble);
        calculateInt(startingNum);
    }
}
