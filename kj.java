
import com.sun.source.tree.NewArrayTree;

import java.util.*;

/*
 * @created 15/09/2021 - 14:36
 * @project test
 * @author note-admin
 */
public class kj {
    public static void main(String[] args) {
        int[] ints = {0, 2, 4, 6, 8, 10, 11, 123, 112, 44, 53, 5667 ,76835, 45, 5};
        OptionalInt max = Arrays.stream(ints).max();
        OptionalInt min = Arrays.stream(ints).min();
        Integer suma = Arrays.stream(ints).sum();
        OptionalDouble avgd = Arrays.stream(ints).average();

        System.out.println("minVal = " + min.getAsInt() + "\nmaxVal = " + max.getAsInt() + "\nsumelement = " + suma + "\nAvg = " + avgd.getAsDouble());

        System.out.print("Масив нечётных ");

        int counter = 1;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {
                System.out.print(" " + ints[i]);
            }
        }
    }
}

