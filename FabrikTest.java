

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        //Bestellung Bestellung = new bestellung();
        //student.addCourseByIds(new int[} {23,52,12,67});
        
        //2. Act
        //Course course = student.findCourseById(67); -->Diese Methode wird getestet
        //Course courseNull = student.findCourseById(11); -->Falls es den Kurs nicht gibt (abdecken)
        
        //3. Assert
        //assert<Objekt>(course);
        //assertEquals(67, course.getId()); -->Hat etwas den Wert, den wir möchten? Hat Kurs 67 auch wirklich die ID 67?
        //assertNull(courseNull);
        
        //Fazit:  getestet ob es den Kurs gibt, ob die ID richtig ist und was ist, wenn ein Kurs ==NUll ist.
        //Lösungen sind bei wöchentlichen Lösungen hochgeladen.
    }
}

