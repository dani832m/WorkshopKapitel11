import java.util.*;

public class ShowingArrayList {

    public static void main(String args[]) {

        //Jeg putter String-elementer i nedenstående ArrayList, derfor opretter jeg det af typen String
        ArrayList<String> obj = new ArrayList<String>(); //Bemærk vi ved ArrayList bruger <> og ved alm. array []

        //Sådan tilføjer man elementer til sit ArrayList
        obj.add("Bent"); //Variabelnavn.add(Indhold);
        obj.add("Helle");
        obj.add("Tina");
        obj.add("Knud");
        obj.add("Nikita");

        //Vis indhold i ArrayList
        System.out.println("Vi har disse navne i vores array lige nu: " + obj);

        //Du kan tilføje indhold til et konkret index
        obj.add(0, "Karsten");
        obj.add(1, "Douglas");

        //Du kan fjerne elementer i et array ved at angive værdien
        obj.remove("Knud");
        obj.remove("Nikita");

        System.out.println("Nu er indholdet i vores array: " + obj);

        //Du kan ligeledes fjerne et element ved at angive, hvilket index det befinder sig på
        obj.remove(1);

    }

}