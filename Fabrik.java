import java.util.ArrayList;
import java.io.*;
/**
 * @author Gruppe 29
 * @version 1.0 (25. Oktober 2022)
 * 
 * Die Klasse Fabrik bildet die Schnittstelle zwischen Kund:innen und Produktion.
 * Sie nimmt Bestellungen entgegen und verwaltet diese.
 */
public class Fabrik
{
    /** 
     * Instanzvariabeln:
     * 
     * bestellungen         = Eine Array-Liste, in der alle eingegangenen Bestellungen als Typ <Bestellung> abgespeichert werden.
     * bestellungsNr        = Eine Bestellungsnummer, welche jeder Bestellung aufsteigend zugeordnet wird, beginnend bei 1. (int)
     */
   
    private ArrayList<Bestellung> bestellungen; 
    private int bestellungsNr;

    /**
     * Konstruktor für Objekte der Klasse Fabrik: Hier werden die Instanzvariabeln initialisiert.
     */
    
    public Fabrik()
    {
        /**
         *bestellungen = Liste aller eingetroffenen Bestellungen vom Typ ArrayList
        */
       
        bestellungen = new ArrayList<Bestellung>();
        bestellungsNr = 0;
    }

    /**
     * Main-Methode
     * BESCHRIEB JEFF HIER
     */
    
    public static void main(String[] args){
        
        System.out.println("Ausgabe aus der main()-Methode:");
        Fabrik fabrik= new Fabrik();
        
        boolean weiterBestellen = true;
        boolean invaliderInput = false;
        
        BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Willkommen bei AEKI");
        
        while(weiterBestellen){
            int anzahlSofas;
            int anzahlStühle;
            String weiterBestellenString;
            
            try{
                if(!invaliderInput){
                    System.out.println("Geben Sie die Anzahl Sofas an, welche Sie bestellen möchten: ");
                    anzahlSofas = Integer.parseInt(infile.readLine().trim());
                    System.out.println("Geben Sie die Anzahl Stühle an, welche Sie bestellen möchten: ");
                    anzahlStühle = Integer.parseInt(infile.readLine().trim());
                    fabrik.bestellungAufgeben(anzahlSofas, anzahlStühle);
                    }
                System.out.print("Möchten Sie weiter bestellen? (ja/nein)");
                weiterBestellenString = infile.readLine();
                if(weiterBestellenString.equals("ja")){
                    weiterBestellen = true;
                    invaliderInput = false;
                    } 
                else if(weiterBestellenString.equals("nein")){
                    weiterBestellen = false;
                    invaliderInput = false;
                    }
                else{
                    System.out.println("Invalider Input, geben sie ja oder nein ein.");
                    invaliderInput = true;
                    }
                } 
            catch (Exception E){
                System.out.println("Invalider Input, geben sie eine Zahl ein.");
                }
            
            }
        fabrik.bestellungenAusgeben();
        }
        
    
    /** 
     * Methode bestellungAufgeben:
     * Durch bestellungAufgeben wird eine neue Instanz der Klasse Bestellung erstellt und in der Array "bestellungen" gespeichert. 
     * Bei jeder erfolgreiche n Bestellausgabe, wird auf der Konsole eine Message ausgespielt.
     * In der folgenden Methode wird zudem festgelegt, dass die Bestellung nur positive Werte enthalten darf (Keine Minusbestellungen, sonst Fehlermeldung).
     */
    public void bestellungAufgeben(int sofa, int stuhl){
          if (sofa<0 || stuhl<0 || sofa+stuhl==0){
               System.out.println("Bitte geben sie eine positiven Bestellbetrag ein");
           }
           else {

               Bestellung bestellung = new Bestellung(sofa, stuhl);
               bestellungsNr++;
               bestellung.bestellungBestaetigen();
              
               bestellungen.add(bestellung);
           
               System.out.println("Bestellung erfolgreich aufgegeben");
           }
           
    }
    
    /**
     * Methode:gibBestellungsNr: 
     * Gibt die Totale Anzahl der aufgegebenen Bestellungen aus.
     */
    public int gibBestellungsNr(){
        return bestellungsNr;
    }
    
    /**
     * Methode gibBestellungen: 
     * Gibt die Bestellungsinformationen aus.
     * Hier: Gibt die Bestellungsinformationen für den Unit-Test zur Methode BestellungAifgeben wieder.
     */
    public ArrayList<Bestellung> gibBestellungen(){
        return bestellungen;
    }
   
    /**
    * Methode bestellungenAusgeben:
    * Für jede Bestellung aus der Liste bestellungen, gibt die Konsole die unten programmierte Print-Meldung aus. 
    * Diese Methode gibt somit alle Informationen (Anzahl Stühle / Anzahl Sofas / Bestellungen Total / Bestellungsnummer) 
    * für alle aufgegebenen Bestellungen wieder.
    */
    public void bestellungenAusgeben() {

        System.out.println("Total Bestellungen bisher:"+bestellungsNr);
        
        for(Bestellung eineBestellung: bestellungen) {
            
            System.out.println(eineBestellung);
            
        }
    }
    
    /**
     * Methode bestellungAusgeben:
     * Gibt die Informationen einer bestimmten Bestellung wieder. 
     * Dazu muss diese Methode mit der gewünschten Bestellungsnummer aufgerufen werden.
    */
    public void bestellungAusgeben(int spannendeBestellungNr) {
        
        
        System.out.println("Details der Bestellung mit der Nummer:" + spannendeBestellungNr);
        
        for(Bestellung eineBestellung: bestellungen) {
            
            if(spannendeBestellungNr==eineBestellung.gibBestellNummer()){
            System.out.println(eineBestellung);
            }
    
        }
    
    }
}