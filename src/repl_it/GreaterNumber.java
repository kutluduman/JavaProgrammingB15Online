package repl_it;

import java.util.Scanner;

public class GreaterNumber {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
       int a = scan.nextInt();
       int b = scan.nextInt();


if (a>b) {

    System.out.println(a + " is greater");
} else if (b>a) {

    System.out.println(b + " is greater");
}



    }


}
