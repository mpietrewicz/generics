package workshop.java.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _III_GenerycznyInterfejs {

    public static void main(String[] args) {
        DoubleAndLis doubleAndLis = new DoubleAndLis();
        System.out.println(doubleAndLis.doSomeOperation(22.0));
        System.out.println(doubleAndLis.doReverseOperation(Arrays.asList("12", "33")));
    }

}

    /*
        Analogicznie do klasy, możemy tworzyć generyczne interfejsy

        Zwróć uwagę na  <T,U> jak są użyte w definicjach metod i jak to się ma do implementacji

        TODO zaimplementuj interfejs - zamiast String użyj Double, zamiast Integer użyj List<String>
            (implementacje ciał metod nie mają znaczenia)
     */

//Definicja interfejsu
interface GenericInterface<T, U>
{
    U doSomeOperation(T t);
    T doReverseOperation(U u);
}

//Implementacja 1
class StringAndInteger implements GenericInterface<String, Integer>
{
    public Integer doSomeOperation(String t) {
        return 0;
    }
    public String doReverseOperation(Integer t) {
        return "";
    }
}

interface GenericInterfaceForDoubleAndList<D, L> {
    L doSomeOperation(D d);
    D doReverseOperation(L l);
}

class DoubleAndLis implements GenericInterfaceForDoubleAndList<Double, List<String>> {


    @Override
    public List<String> doSomeOperation(Double value) {
        return Arrays.asList("1", "7");
    }

    @Override
    public Double doReverseOperation(List<String> values) {
        return 44.0;
    }
}