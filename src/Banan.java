public class Banan extends Frugt { //Klassen "Banan" er subklasse til superklassen "Frugt"

    //Arver attributter og metoder fra "Frugt"

    public static void main(String[] args) {

        Frugt banan1 = new Banan(); //Opretter et nyt Banan-objekt, men med mulighed for egenskaber fra "Frugt"
        //Det vi har gjort her kaldes også "implicit casting"

        /* Variablens type, her er det "Frugt", bestemmer hvilke metoder, der er MULIGE at kalde. Objektets type,
        her er det "Banan", bestemmer hvilken metodekrop, der bliver udført, hvis en metode kaldes */

        /* Lad os se på objekt casting. Herunder angiver jeg, at variablen "banan2" skal være lig med "banan1".
        Hvis jeg IKKE type caster "banan1" til at være af klassen "Banan", så vil compileren håndtere objektet som
        "Frugt" og give fejl. Den tænker: "Jamen du fortalte mig jo tidligere, at "banan1" skulle være at typen "Frugt".
        Jeg er derfor nødt til at fortælle compileren, at det er en banan, ved at skrive (banan) foran */

        Banan banan2 = (Banan)banan1; //Dette kaldes "explicit casting", hvorimod det på l. 5 er "implicit casting"

        //Brug af "instanceof"

        System.out.println(banan1 instanceof Frugt); //Ja, "banan1" er en instans af klassen "Frugt"
        System.out.println(banan1 instanceof Banan); //Ja, "banan1" er også en instans af klassen "Banan"
        System.out.println(banan1 instanceof Object); //Ja, "banan1" er også en instans af klassen "Object"
        //System.out.println(banan1 instanceof Bil); //Nej! "banan" er IKKE en instans af klassen "Bil" (error)

        //Brug af equals-metoden

        Bil bil1 = new Bil(); //Opretter et objekt i klassen "Bil" for at sammenligne herunder

        //Vi bruger equals til at teste, om to objekter er ens
        System.out.println(banan1.equals(banan2)); //Ja, "banan1" er lig "banan2" (true)
        System.out.println(banan1.equals(bil1)); //Nej, "banan1" er IKKE lig "bil1" (false)

    }

}