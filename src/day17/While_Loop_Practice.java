package day17;

public class While_Loop_Practice {

    public static void main(String[] args) {


       // Count 1 to 5 then count 5 to 1

        int counter = 1 ;

        while (counter <= 5) {


            System.out.print(counter+ " ");
            ++counter;

        }
        System.out.println(); // this is moving your code to new line - empty line
        System.out.println( "counter = " + counter);

        // now I want to count from 5 to 1, using same counter


        while (  counter>1 ) {

            --counter;
            System.out.print(counter+" ");


        }


    }
}


// Count 1 to 5 then count 5 to 1
// if I use (counter <= 5 ) as condition I will have these
// -->>  iteration 1 :   1<=5  true
// print 1   counter = 2
// -->>  iteration 2 :  2<=5  true
// print 2   counter = 3
// -->>  iteration 3 : 3 <= 5 true
// print 3   counter = 4
// -->>  iteration 4 :  4 <= 5 true
// print 4   counter = 5
// -->>  iteration 5 :  5 <= 5 true
// print 5   counter = 6

// 6 <=5  FALSE -->> GET OUT OF THE LOOP


// now I want to count from 5 to 1 , using same counter
// if I use (counter >= 1) as condition I will have these
//       -->> 6>=1 5>=1 4>=1 3>=1 2>=1 1>=1  true   0>=1 false!!

// if I use (counter > 1) as condition I will have these
// --->> 6>1  5>1  4>1  3>1  2>1  true   1>1 false!!