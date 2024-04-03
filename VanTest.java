

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste VanTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class VanTest
{
    
    private Van van;
    
    /**
     * Construtor default para a classe de teste VanTest
     */
    public VanTest()
    {
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
        
      van=new Van("ABC123", 10);
    }

    /**
     * Desfaz a 'fixture' do teste.
     *
     * Chamado após cada método de teste de caso.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    public void testSetLicensePlate() {
        van.setLicensePlate("XYZ789");
        assertEquals("XYZ789", van.getLicensePlate());
    }
    
    @Test
    public void testGetPackages() {
        assertEquals(10,van.getPackages() );
    }
    
    
    
    @Test
    public void testToString() {
        String expected = "\nTipo Transporte: Transporte Terrestre\n" +
                          "             ID: " + van.getId() + "\n" +
                          "         Origem: \n" +
                          "        Destino: \n" +
                          "          Preço:  0,00€\n" +
                          "     Honorarios: 3,00%\n" +
                          "    Preço Final: 0,00€\n" +
                          "      Matricula: ABC123\n" +
                          "       Packages: 10\n";
        assertEquals(expected, van.toString());
    }
}
