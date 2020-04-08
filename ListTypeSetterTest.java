/**
 * A class that stores, and typesets, a list of items.
 *
 * Minh Tam H Nguyen
 * CSCI 1913 Lab 8
 */
import java.math.BigInteger;
import java.security.SecureRandom;

public class ListTypeSetterTest {

    public static void main(String[] args) {

//        System.out.println("Testing the extreme case of maxItem = 0");
//        ListTypeSetter list_of_0 = new ListTypeSetter(0); //maximum object is 0 b4 crashing
////
//        System.out.println("This is the current size: " + list_of_0.currentSize() +
//                "\nThis is the content of the list initially: " + list_of_0);
////
//        //We will then add an item to the end of the output list
//        list_of_0.addToList("hello"); //this should crash and return an index out of bound error

        //---------------------------------------------------------------------------------------
//        System.out.println("Testing the case when maxItem = 2");
//        ListTypeSetter list_of_2 = new ListTypeSetter(2);
//
//        //should return a blank list and currentSize = 0
//        System.out.println("This is the current size: " + list_of_2.currentSize() +
//                "\nThis is the content of the list initially: " + list_of_2);
////
//
//        list_of_2.addToList("hello");
//        //Expected: currentSize = 1 and content should have hello
//        System.out.println("This is the current size after 1 adding: " + list_of_2.currentSize() +
//                "\nThis is the content of the list after 1 adding: " + list_of_2);
//        //Result: currentSize = 2 and content shows "* null", where is "hello"?
//
//        list_of_2.addToList("Karma");
//        //Expected: currentSize = 2  and content should have hello and Karma
//        System.out.println("This is the current size after 2 adding: " + list_of_2.currentSize() +
//                "\nThis is the content of the list after 2 adding: \n" +
//                 list_of_2);
//        //It returns an error of getting out of bounds for length 2 --> Index 2 out of bounds for length 2? BUG!
//
//        //Expected: To make a list with the format outlined in the lab write-up
//        //: Yes
//        System.out.println("Testing toString");
//        System.out.println(list_of_2.toString());
//
//        //list_of_2.addToList("Karma2"); //this should crash the code
//
//        list_of_2.reset();
//        //Expected: currentSize = 0 or nothing after reset and content should have all null
//        System.out.println("This is the current size after resetting: " + list_of_2.currentSize() +
//                "\nThis is the content of the list after resetting: " + list_of_2);
//        //Outcome: the current size still is = 2 and the content is "*null"


        //---------------------------------------------------------------------------------------
//        System.out.println("Testing the case when maxItem = -1");
//
//        ListTypeSetter list_of_negative = new ListTypeSetter(-1); //this should crash the code

        //---------------------------------------------------------------------------------------
        
        
//        System.out.println("Testing the case when maxItem = 100 ");
//        ListTypeSetter list_of_100 = new ListTypeSetter(100);
//        RandomStringGenerator cac = new RandomStringGenerator();
//
//        for (int i = 0; i <100; i++){
//            list_of_100.addToList(cac.getNextRandomString());
//        }
//
//        System.out.println("\nThis is the current size after initialize: " + list_of_100.currentSize() +
//                "\nThis is the content of the list after initialize: \n" + list_of_100);
//
//        list_of_100.addToList("-1"); //should crash




    }
    static class RandomStringGenerator{

        //initialize secure random
        static final SecureRandom secureRandom = new SecureRandom();

        //get next random string
        public String getNextRandomString(){

            //create 130 bits random BigInteger
            BigInteger bInt = new BigInteger(130, secureRandom);

            //return string representation of BigInteger in 32 radix
            return bInt.toString(32);

        }

    }
}

