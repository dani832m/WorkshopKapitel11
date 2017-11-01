///// OBS! Denne klasse kan ikke køres, da den ikke indeholder nogen main(), men kodeeksemplerne burde være korrekte.
///// Kodeeksemplerne er taget ud af kontekst, og kan ikke altid stå alene /////

/*
Hvad er en superclass og subclass i Java?

I Java nedarves en klasse altid fra en anden klasse. Som udgangspunkt stammer alle klasser fra den overordnede klasse
"Object". Når en klasse nedarves, får den nye klasse automatisk de egenskaber, som den klasse, den stammer fra.
Man kan snakke om et parent-child forhold eller et superclass-subclass forhold. Den klasse, der nedarves fra kalder man
for parent eller superclass til den klasse, der modtager dens egenskaber. Den klasse, der modtager egenskaber fra
superclass'en kalder man så for subclass eller child.

Lærebogen beskriver det: "Inheritance enables you to define a general class (i.e., a superclass) and later extend it
to more specialized classes (i.e., subclasses)"

For UML: Se png-filen "Superclass and subclass UML.png"
*/

//EKSEMPEL PÅ SUPERCLASS OG SUBCLASS

class Super { //Superclass eller parent til "Sub"
    //Indhold i klassen
}

class Sub extends Super { //Subclass som extender superclass'en "Super"
    //Arver egenskaber og metoder fra "Super"
}

/*
Hvordan kan vi kalde superklassens constructor og superklassens metoder?

En constructor er IKKE direkte nedarvet til subklassen. Hvis vi skal kalde en superklasses constructor i subklassen,
skal vi bruge keywordet "super". Vi kan også kalde en superklasses metoder i subklassen med det samme keyword.
Jeg vil prøve at forklare dette med et eksempel:
*/

public class Frugt { //Superklasse

    //Klassevariabler
    int age;
    int antalKerner;

    //No-arg constructor
    public Frugt() {
        //Ingenting her
    }

    //Constructor der tager to parametre ind
    public Frugt(int age, int antalKerner) {
        this.age = age;
        this.antalKerner = antalKerner;
    }

    //Metode der ikke returnerer noget
    public void dejligSmag() {
        System.out.println("Denne frugt smager herligt!");
    }

}

public class Apple extends Frugt { //Subklasse til "Frugt"

    //Hvis jeg skulle bruge constructoren fra klassen "Frugt", så ville den se således ud:

    //Signaturen skal være den samme som ved constructoren i superklassen (altså med to parametre)
    public Apple(int age, int antalKerner) {
        super(age, antalKerner); //Her fortæller vi, at "age" og "antalKerner" stammer fra superklassen.
        /* Vi kunne også navngive de to parametre noget andet. Det vigtige er, at antal og type af parametrene er de
        samme som i vores constructor i superklassen */
        super.dejligSmag(); /* Her sætter vi keywordet "super" foran en metode. Det er dog ikke alid nødvendigt at gøre,
        men en god idé for at dokumentere vores kode */
    }

}

/*
Man kan også kalde en constructor i en constructor. Dette kaldes "Constructor chaining".
Se JPG-filen: "Constructor Chaining.jpg"

Hvad er forskellen mellem overriding methods og overloading methods i Java?

Hvis man ønsker at ændre noget i en metode i sin subklasse, som den har arvet fra superklassen, så kan man anvende
"Overriding". Her bruger man samme signatur, men ændrer funktionaliteten. "Overloading" vil sige, at man anvender den
samme metode (navn), men giver den forskellig anvendelse.
*/

public class OverloadingOverriding {

    //Overloading
    public int plusTal(int a, int b) { //En metode kaldet "plusTal", der tager to parametre ind.
        return a + b; //Returnerer summen af de to parametre.
    }

    public int plusTal(int a, int b, int c) { //Samme metode, denne gang tager den bare tre parametre ind.
        return a + b + c; //Returnerer summen af de tre parametre.
    }

    //Ovenstående eksempel overloader, fordi vi ikke ændrer på parametrenes navn, men tilføjer blot endnu et.
    //Glimrende link: https://beginnersbook.com/2013/05/method-overloading/

    //Overriding - vi beholder metodens signatur, men ændrer funktionalitet/parametrenes navne.
    public int plusTal(int x, int y) { //Samme signatur, men med andre parametrenavne.
        return x + y;
    }

    //Ovenstående eksempel overrider, fordi vi ændrer på parametrene, men beholder samme datatype og antal.
    //Glimrende link: https://beginnersbook.com/2014/01/method-overriding-in-java-with-example/
}

/*
Lærebogen beskriver det: "To override a method, the method must be defined in the subclass using the same signature
and the same return type as in its superclass. Overloading means to define multiple methods with the same name but
different signatures. Overriding means to provide a new implementation for a method in the subclass"

Hvad er toString() metoden i Java?

Hvis du har kreeret et objekt ud fra en klasse og tildelt objektet egenskaber, så kan du bruge metoden toString().
Denne metode vil returnerer en "String", der repræsenterer objektet.

Eksempel:
*/

public class FrugtFremviser {

    Frugt appelsin = new Frugt(); //Laver "appelsin" ud fra klassen "Frugt"

    System.out.println(appelsin.toString()); //Kalder toString-metoden på objektet

}

/*
Som default viser metoden "toString()" fra hvilken klasse objektet stammer fra og objektets memory address. Dette er
normalt ikke specielt brugbart. Derfor kan man blive nødt til at override toString(). Et eksempel på dette kunne være:
*/

public String toString() {
    String infoString = "Frugten har " + antalKerner + " kerner og er " + age + " dage gammel.";
    return infoString;
}

// Lærebogen beskriver toString-metoden: "The toString() method returns a string representation of the object."