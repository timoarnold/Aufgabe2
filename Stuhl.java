
/**
 * Beschreiben Sie hier die Klasse Stuhl.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

//Subklasse von Klasse Produkt (Übernimmt alle Attribute/Var & Methoden von Oberklasse)

public class Stuhl extends Produkt
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    //MRERKE: Hier sollte als erstes noch der Konstruktor der Klasse Produkt angesprochen werden /Gleiches Gilt für Sofa!!! -->VL 4
    

    /**
     * Konstruktor für Objekte der Klasse Stuhl
     * Hier Variabeln einfügen, die in Produkt nicht enthalten, für Stuhl jedoch notwendig
     */
    public Stuhl(int zustand, int holzeinheiten, int schrauben, int farbeinheiten, int kartoneinheiten, int produktionsZeit)
    {
        // Instanzvariable initialisieren
        super (zustand, holzeinheiten, schrauben, farbeinheiten,kartoneinheiten, produktionsZeit);
    }
}
