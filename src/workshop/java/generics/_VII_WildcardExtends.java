package workshop.java.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*

     Jeśli chcemy, by akceptowany typ rozszerzał typ X, używamy
     ? extends X

 */
public class _VII_WildcardExtends {
    public static void main(String[] args) {
        // TODO 2 wywołanie metody
        List<Integer> ints = Arrays.asList(1,2,3,4,5);
        System.out.println(sum(ints));

        //List of Floats
        List<Float> floats = Arrays.asList(1.5f,2f,3f);
        System.out.println(sum(floats));
    }

    /*
        TODO 1 metoda przyjmująca generyczną kolekcję
     */
    private static Number sum (List<? extends Number> numbers){
        double s = 0.0;
        for (Number n : numbers)
            s += n.doubleValue();
        return s;
    }
}












