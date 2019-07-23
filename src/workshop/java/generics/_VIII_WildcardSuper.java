package workshop.java.generics;

import java.util.ArrayList;
import java.util.List;

public class _VIII_WildcardSuper {

    public static void main(String[] args) {
        // TODO 3 wywołanie metody z generycznąkolekcją
        //List of grand children
        List<GrandChildClass> grandChildren = new ArrayList<GrandChildClass>();
        grandChildren.add(new GrandChildClass());
        addGrandChildren(grandChildren);

        //List of grand childs
        List<ChildClass> childs = new ArrayList<ChildClass>();
        childs.add(new GrandChildClass());
        addGrandChildren(childs);

        //List of grand supers
        List<SuperClass> supers = new ArrayList<SuperClass>();
        supers.add(new GrandChildClass());
        addGrandChildren(supers);

    }
    /*
        TODO 2 Metoda przyjmująca generyczną kolekcję
     */
    public static void addGrandChildren(List<? super GrandChildClass> familyMembers)
    {
        familyMembers.add(new GrandChildClass());
        System.out.println(familyMembers);
    }
}


/*
    TODO 1 utwórz hierarchię klas
 */

class SuperClass {

}

class ChildClass extends SuperClass {

}

class GrandChildClass extends ChildClass{

}
