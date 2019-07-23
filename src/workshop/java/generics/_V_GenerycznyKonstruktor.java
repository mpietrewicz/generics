package workshop.java.generics;

public class _V_GenerycznyKonstruktor {
    public static void main(String[] args) {

    new ClassWithGenericConstructor("",10,new Object());

    }
}



/*
    Klasa z generycznym konstuktorem.

    TODO 1 utwórz obiekt poniższej klasy

    TODO 2 zmodyfikuj klasę tak, żeby konstruktor mógł przyjmować różne 3 typy (przy generycznym tworzeniu)

    TODO 3 zaobserwuj, że bez modyfikacji, gdy używamy niegenerycznej wersji, możemy użyć dowolnych typów
    (Podobnie do przykładu z listą)


 */

class ClassWithGenericConstructor<T>
{
    private T first;
    private T second;
    private T third;


    public ClassWithGenericConstructor(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
}