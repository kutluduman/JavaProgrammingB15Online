package day11;

public class WarmUp1_IfElseLight {

    public static void main(String[] args) {


        /*

        You have 4 switches in your home to turn on
        Bd = bedroom
        Lr-living room
        ki-kitchen
        Ha-Hallway

       Create a variable: targetOption as String and assign one of above option for example bd

       Use switch statement to write a program to print which room light is turned on
       Example: if bd was targetOption then print you have turned on bedroom light

         */


        String targetOption = "Ha" ;




        if (targetOption == "Bd") {


            System.out.println("You have turned on bedroom Light");

        }  else if (targetOption == "Lr") {


            System.out.println("You have turned on living room Light");

        } else if (targetOption == "Ki") {


            System.out.println("You have turned on kitchen Light");

        }    else if (targetOption == "Ha") {


            System.out.println("You have turned on hallway Light");

        } else {



                System.out.println("Wrong Room");

        }




    }


}





