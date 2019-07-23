package workshop.java.generics;

public class _IV_GenerycznaMetoda {

    public static void main(String[] args) {
        int foundElements = ClassWithGenericMethod
                .countAllOccurrences(new String[]{"c","A","B","c","C","d"},"a");
        System.out.println(foundElements);
    }
}

/*

    Generyczna metoda w klasie

    TODO przetestuj wywołania metody z tablicą "c","A","B","c","C","d" idrugim parametrem
    1. "c",
    2.  10,
    3. new Object()
    Zwróć uwagę, że
     - możemy przekazać typ prosty
     - T i U mogą być takie same

     Spróbuj wyjaśnić dlaczego.


 */

class ClassWithGenericMethod {

    public static <T,U > int countAllOccurrences(T[] array, U item) {
        int counter=0;
        for(T t : array) {
            if(t.equals(item)) {
                System.out.printf("1st param type: %s, 2nd param type: %s",
                        item.getClass().getSimpleName(),
                        array.getClass().getComponentType().getSimpleName());
                counter++;
            }
        }

        return counter;
    }
}








/*
        int foundElements = ClassWithGenericMethod
                .countAllOccurrences(new String[]{"c","A","B","c","C","d"},10);
        System.out.println(foundElements);
 */