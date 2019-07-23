package workshop.java.generics;

public class _II_GenerycznaKlasa {


    public static void main(String[] args) {
        NonGenericClass ngc = new NonGenericClass();
        ngc.set(1);
        ngc.set("Ala");

        GenericClass<String> stringOnly = new GenericClass<>();
//        błąd kompilacji
//        stringOnly.set(1);

        GenericClass<Integer> integerOnly = new GenericClass<>();
        integerOnly.set(1);
//        TODO zaimplementuj swoją generyczną klasę, analogicznie do przykładu.
    }


}

    /*
         'Zwykła' klasa i jej generyczny odpowiednik
     */


class NonGenericClass {
    private Object t;

    public void set(Object t) {
        this.t = t;
    }

    public Object get() {
        return t;
    }
}

class GenericClass<T> {
    //T stands for "Type"
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}