
/**
 * @author Gruppe 29 
 * @version 1.0 (25. Oktober 2022)
 * 
 * Die Klasse Stuhl bildet eine Erweiterung / Subklasse der Klasse Produkt. 
 * Sie erbt somit die Funktionalitäten sowie die globalen Variabeln der Klasse Produkt.
 * Zudem enthält sie Variabeln, welche für den Produkttyp <Stuhl> einzigartig sind.
 */

public class Stuhl extends Produkt
{
    /**
     * Instanzvariabeln:
     * 
     * (Bisher noch keine)
     */
    

    /**
     * Konstruktor für Objekte der Klasse Stuhl
     * Dieser initialisiert alle Instanzvariabeln der Klasse Produkt
     */
    public Stuhl(int zustand, int holzeinheiten, int schrauben, int farbeinheiten, int kartoneinheiten, int produktionsZeit)
    {
        super (zustand, holzeinheiten, schrauben, farbeinheiten,kartoneinheiten, produktionsZeit);
    }
}
