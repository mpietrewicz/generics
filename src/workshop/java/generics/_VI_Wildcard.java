package workshop.java.generics;

public class _VI_Wildcard {
    public static void main(String[] args) {

    }
}

/*
    Przypomnijmy sobie przykład z metodą generyczną i konstruktorem
    Mogliśmy podać <T,U> a w wywołaniu użyć takiego samego typu.
    Jeśli chcemy wymusić określone typy, używamy wildcard (bounded).

    Wildcard - ?

    Przykłady poprawnych deklaracji:

    Collection<?> coll = new ArrayList<String>();

    List<? extends Number> list = new ArrayList<Long>();

    Pair<String,?> pair = new Pair<String,Integer>();

    Przykłady niepoprawnych deklaracji:

    // String nie rozszerza Number
    List<? extends Number> list = new ArrayList<String>();

    //Integer nie jest superclass dla String
    Comparator<? super String> cmp = new RuleBasedCollator(new Integer(100));

    Wildcard - unbounded & bounded

    Unbounded

    ArrayList<?>  list = new ArrayList<Long>();

    ArrayList<?>  list = new ArrayList<String>();

    ArrayList<?>  list = new ArrayList<Employee>();

    Bounded (przykłady w kolejnych krokach)

    ? super
    ? extends

 */