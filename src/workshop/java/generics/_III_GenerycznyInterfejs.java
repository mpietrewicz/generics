package workshop.java.generics;

import java.util.ArrayList;
import java.util.List;

public class _III_GenerycznyInterfejs {

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

