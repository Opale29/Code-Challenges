public class Main {
    public static void main(String[] args) {

        String test = weirdOrNotweird(0);
        System.out.println(test);



    }

    public static String weirdOrNotweird(int n) {
        if (n % 2 != 0) {
            return "Weird";

        } else if (2 <= n & n <= 5) {
            return "Not Weird";
        } else if (6 <= n & n <= 20) {
            return "Weird";
        }else if (n >20){
            return "Not Weird";
        }

        else {
            return " ";
        }


    }


}

