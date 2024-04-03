

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste LorryTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class LorryTest
{
    private Lorry lorry;
    private GroundTransportation groundTransport;
    /**
     * Construtor default para a classe de teste LorryTest
     */
    public LorryTest()
    {
        
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp() {
        lorry = new Lorry(5,2,"ABC123");
    }
    
    @Test
    public void testGetNumberOfPallets(){
        assertEquals(5,lorry.getNumberOfPallets());
    }

    @Test
    public void tesSetNumberOfPallets(){
        lorry.setNumberOfPallets(2);
        assertEquals(2, lorry.getNumberOfPallets());
        
    }
    
    @Test
    public void testGetTrailers(){
        assertEquals(2,lorry.getTrailers());
    }
    
    @Test
    public void testSetTrailers(){
        lorry.setTrailers(9);
        assertEquals(9,lorry.getTrailers());
    }
    @Test
    public void testToString() {
        String expected = "\nTipo Transporte: Transporte Terrestre\n" +
                          "             ID: " + lorry.getId() + "\n" +
                          "         Origem: \n" +
                          "        Destino: \n" +
                          "          Preço:  0,00€\n" +
                          "     Honorarios: 3,00%\n" +
                          "    Preço Final: 0,00€\n" +
                          "      Matricula: ABC123\n" +
                          "    Nr. Paletes: 5\n"    +
                          "  Nr. Atrelados: 2\n";
                          
        assertEquals(expected, lorry.toString());
}
}
