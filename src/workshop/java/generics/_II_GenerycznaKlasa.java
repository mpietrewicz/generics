package workshop.java.generics;

import java.util.HashMap;

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

        GenericPass<HashMap<String, String>> genericPass = new GenericPass<HashMap<String, String>>();
        HashMap<String, String> firstPass = new HashMap<String, String>();
        firstPass.put("pass1", "test");
        genericPass.setP(firstPass);

        System.out.println(genericPass.getP());

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

class GenericPass<P> {
    private P p;

    public P getP() {
        return p;
    }

    public void setP(P p) {
        this.p = p;
    }
}