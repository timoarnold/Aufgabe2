
/**
 * Beschreiben Sie hier die Klasse Stuhl.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
//Subklasse von Klasse Produkt (Übernimmt alle Attribute/Var & Methoden von Oberklasse)

/**
* Feedback Cha
* siehe mein Kommentar in Miro über static variables: könnte die Produktionszeit eine solche sein? anstatt private int, private static int? warum?
* weil die Produktionszeit auch von den Sofas abhängig ist oder? es würde es flexibler machen, wenn diese Variable gemäss Google Definition nicht an diese "instance" gebunden ist, sondern an die Klasse "Produkt"
*/

public class Stuhl extends Produkt
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    //MRERKE: Hier sollte als erstes noch der Konstruktor der Klasse Produkt angesprochen werden /Gleiches Gilt für Sofa!!! -->VL 4
    private int holzeinheiten;
    private int schrauben;
    private int farbeinheiten;
    private int kartoneinheiten;
    private int produktionsZeit;

    /**
     * Konstruktor für Objekte der Klasse Stuhl
     */
     
     /**
     * Feedback Cha
     * müssen wir hier nicht Angeben, was ein Stuhl tatsächlichh für Einheiten braucht?
     *
     */
     
    public Stuhl()
    {
        // Instanzvariable initialisieren
        holzeinheiten =0;
        schrauben = 0;
        farbeinheiten =0;
        kartoneinheiten =0;
        produktionsZeit =0;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    //Hier käme:
    //public int beispielMethode()
    //{
        // tragen Sie hier den Code ein
        
    //}
    //Methoden für Abruf der Informationen analog zu Sofa
    //
    
    //Exemplar einer set-Funktion (falls später benötigt) -->käme jeweils vor get-Funktion.
    
    /** 
    * Feedback Cha
    * In Kommentaren noch kurz erklären, was bei diesen Methoden passsiert:
    * Angabe Anzahl Holzeinheiten (etc.)
    *
    * Input Bennenung der Methoden: wollen wir diese noch Stuhl und Sofa-spezifisch machen? 
    * sonst versteht ja das Programm und wir nicht, ob wir getHolzeinheiten für Stühle oder Sofas wollen... Bspw: public int getholzeinheitenStuhl()
    *
    * Frage: wieso haben wir hier diese Methode? --> "public void setHolzeinheiten..." werden diese Einheiten nicht im Lager aufgegeben (beim Einkauf)?
    *
    */
    
    public void setHolzeinheiten(int HolzFuerStuhl){
        holzeinheiten = HolzFuerStuhl;
    }
    
    public int getHolzeinheiten() {
        return holzeinheiten;
    }
    
    public int getSchrauben() {
        return schrauben;
    }
    
    public int getFarbEinheiten() {
        return farbeinheiten;
    }
    
    public int getKartoneinheiten() {
        return kartoneinheiten;
    }
    
    public int getProduktionsZeit() {
        return produktionsZeit;
    }
}
