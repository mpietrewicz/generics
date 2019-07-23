package workshop.java.generics;

public class _I_Wprowadzenie {

    /*
        Tyoy generyczne (Java > 5 ) - dodatkowe zabezpieczenie dla programisty, przed niewłaściwym
        korzystaniem z API.



        Problem z niegeneryczną kolekcją:

        List rawList = Arrays.asList(1, "Ala", 3d);
        String  o1 = (String) rawList.get(0);

        Wskazanie typu, zabezpiecza przed powyższym problemem:

        List<String> genericList = Arrays.asList("Jan", "Ala", "Ola");
        String  s1 = genericList.get(0);

        TODO Podejrzyj javadoc List, wyszukaj kilka z poniższych symboli (to nazewnicze konwencje):

        T - Type
        E - Element (np. kolekcji)
        K - Key
        V - Value
        S,U,V itd. - kolejne typy

     */
}
