
/** 
 * @author Gruppe 29
 * @version 1.0 (25. Oktober 2022)
 * 
 * Die Klasse Produkt bildet die Superklasse der beiden Produkte Stuhl & Sofa.
 * Sie enthält globale Variabeln für diese beiden Produkte / Variabeln, welche bei Stuhl & Sofa identisch sind.
 */

public class Produkt {
    /**
     * Instanzvariabeln:
     * 
     * zustand              = Beschreibt den aktuellen Zustand eines Produkts (int). 
     *                        Anmerkung: Bisher noch int-Wert, der manuell eingegeben werden kann für jeden Produkt-Zustand (bspw. "bestellt = 1")
     */
    
    private int zustand;

    /**
     * Konstruktor für Objekte der Klasse Produkt.
     * Dieser initialisiert alle Instanzvariabeln der Klasse Produkt
     */
    public Produkt(int zustand)
    {
        this.zustand = zustand;
    }

    /**
     * Methode zustandAendern:
     * Manuelle Wahl eines Produktzustands, wobei:
     * Zustand 1 = bestellt 
     * Zustand 2 = in Produktion
     * Zustand 3 = versandbereit
     * Zustand 4 = versendet
     */
    public void zustandAendern(int neuerZustand)
    {
        zustand = neuerZustand;
    }
    
    /**
     * Methode aktuellerZustand:
     * Gibt den aktuellen Zustand eines Produkts wieder.
     */
    public int alktuellerZustand()
    {
        return zustand;
    }
}
