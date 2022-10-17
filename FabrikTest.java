

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

/**
 * Die Test-Klasse FabrikTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class FabrikTest
{
    /**
     * Konstruktor fuer die Test-Klasse FabrikTest
     */
    public FabrikTest()
    {
    }

    /**
     *  Setzt das Testgerüst fuer den Test. -->Können wir brauchen, aber nicht nötig
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @BeforeEach
    public void setUp()
    {
        
    }

    /**
     * Gibt das Testgerüst wieder frei. -->Brauchen wir sicher nicht
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @AfterEach
    public void tearDown()
    {
        
    }
    
    
    @Test
    public void TestBestellungsNummer(){
        //Hier Tests eingeben, die ich machen will -->Notizen = Übungsstunde
        //Beispiel: Objekttest:
        
        //1. Arrange:
        Fabrik Testfabrik = new Fabrik();
        
        //2. Act
        Testfabrik.bestellungAufgeben(2,3);
        Testfabrik.bestellungAufgeben(1,1);

        //3. Assert
        assertEquals(2, Testfabrik.gibBestellungsNr());
        
        /**
         * Getestet, ob richtige Bestellnummer, wenn Instanz Fabrik 
         * erzeugt und 2 Testbestellungen aufgegeben.
         */
    }
    
    @Test
    public void TestBestellungAusgeben(){
        //Hier Tests eingeben, die ich machen will -->Notizen = Übungsstunde
        //Beispiel: Objekttest:
        
        //1. Arrange:
        Fabrik Testfabrik = new Fabrik();
        
        //2. Act
        Testfabrik.bestellungAufgeben(2,3);
        Testfabrik.bestellungAufgeben(6,6);
        
        //3. Assert
        assertEquals("Bestellnummer:"+1+"\nStühle bestellt:"+2+"\nSofas bestellt:"+3,Testfabrik.gibBestellungen().get(0).toString());
        assertEquals("Bestellnummer:"+2+"\nStühle bestellt:"+6+"\nSofas bestellt:"+6,Testfabrik.gibBestellungen().get(1).toString());
        /**
         * Hier wird getestet, ob die erste (Index 0) und die zweite (Index 1) Bestellung der ArrayList bestellungen den Erwartungen entspricht.
         * Merke: Testfabrik.gibBestellungen().get(0).toString() entspricht System.out.println(eineBestellung) aus Fabrik.bestellungAusgeben
         */
    
    }
    
    @Test
    public void TestBestellungAufgeben(){
        
        
        //1. Arrange:
         Fabrik Testfabrik = new Fabrik();
        //Bestellung Testbestellung = new Bestellung(4,7);
        
        //2. Act
         Testfabrik.bestellungAufgeben(4,7);
        
        
        //3. Assert
        assertEquals(4, Testfabrik.gibBestellungen().get(0).gibAnzahlStuehle());
        assertEquals(7, Testfabrik.gibBestellungen().get(0).gibAnzahlSofas());
        
        Bestellung.resetBestellnummerGenerator();
        
    
    }
}

