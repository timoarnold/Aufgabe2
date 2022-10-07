
/**
 * Beschreiben Sie hier die Klasse Sofa.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
//Subklasse von Klasse Produkt. (Übernimmt alle Attribute/Var & Methoden von Oberklasse)
public class Sofa extends Produkt
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int holzeinheiten;
    private int schrauben;
    private int kissen;
    private int farbeinheiten;
    private int kartoneinheiten;
    private int produktionsZeit;

    /**
     * Konstruktor für Objekte der Klasse Sofa
     */
    public Sofa()
    {
        // Instanzvariable initialisieren -->nochmals anpassen
        holzeinheiten = 0;
        schrauben = 0;
        kissen = 0;
        farbeinheiten = 0;
        kartoneinheiten = 0;
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
    //Definition der Get-Methoden, um die oben definierten Variablen abzurufen
    
    public int getHolzeinheiten() {
        return holzeinheiten;
    }
    
    public int getSchrauben() {
        return schrauben;
    }
    
    public int getKissen() {
        return kissen;
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
