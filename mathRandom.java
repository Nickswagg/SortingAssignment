import java.util.*;

public class mathRandom {
    public static void main(String[] args) {
        // Creating an array of integers with a length of 100
        int[] myIntArray = new int[100];
        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(myIntArray));

        // Sorting
        // Since Math.random()returns random double value between 0 and 1, we multiply
        // it by 100 to get random numbers between 0 to 100 and then we cast it into
        // type int.

    }

}