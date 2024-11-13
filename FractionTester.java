public class FractionTester {
    public static void main(String[] args) {
        Fraction f = new Fraction();
        // Der folgende Code funktioniert nur, wenn die Felder von Fraction nicht privat sind:
        f.setNumerator(12);
        f.setDenominator(1);
        
        // toString():
        System.out.println(f.toString());

        // Encapsulation, Getter und Setter:
        Fraction n = new Fraction(3,5);
        System.out.println(n);
        // Copy-Konstruktor und equals():
        Fraction g = f;
        System.out.println(g);

        System.out.println(f.equals(g));

        // Klassen- und Instanzenmethoden:

        Fraction a = Fraction.add(f, g);
        System.out.println(a);
        f.add(g);
        System.out.println(f);

        // statische Variablen:
        System.out.println(Fraction.numberOfFractions);

        //Aufgabe 2
        final double PI = 3.14159;
        //PI += 10;
        System.out.println(PI);
        //Puplic --> dass es von überall zugreifbar
        //static --> dass es nicht veränderbar ist von anderen Programmen 
        //void --> dass es etwas zurück gibt

    }



}


//Encapsulation gelernt, Getter und Setter Methode
//toString Methode
//Wie man Klassen in Java programmiert 
//neue Shortcuts und Programmiercode kennengelernt
// --> viel neures gelernt :)