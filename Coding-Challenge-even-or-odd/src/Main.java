public class Main {
    public static void main(String[] args) {
        String result = evenOrodd(23);
        String result2 = evenOrodd(66);
        System.out.println(result);
        System.out.println(result2);

        }

    public static String evenOrodd(int number){

        if ((number % 2) == 0){
            return "Even";
//            System.out.println("This number, "+ number + " is even");
        }
        else{
            return "Odd";
        }
//            System.out.println("This number, " +number +" is odd");}
//
    }
}
