import java.sql.SQLOutput;
import java.util.Arrays;

class Main {
    public static void main(String[] args){





        try {
            int[] array = {1,2,3};
            int maxnumber = array[3];
            System.out.println(maxnumber);}
        catch(Exception e){
            System.out.println("This is why QA Engineers always have to do boundary testing! The array only has 3 values and you've requested a 4th");

        }
    }
}
//        4. Write a simple application to finish the assignments below:
//        Declare an array of integers with the values: 1, 2, 3.
//        Catch an exception when you attempt to get the forth value of the array.
//        Print out to console custom exception:
//        "This is why QA Engineers always have to do boundary testing! The array only has 3 values and you've requested a 4th".