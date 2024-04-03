
/**
 * Escreva uma descrição da classe AirTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AirTransportation extends Transport
{
    // variáveis de instância 
    private String name;
    private int numberOfContainers;
    private static double feeAirTransportation = 0.04;

    /**
     * Construtor para objetos da classe AirTransportation
     */
    public AirTransportation(String name, int numberOfContainers)
    {
        this.name =name;
        this.numberOfContainers = numberOfContainers;
        feeAirTransportation = 0.04;
        
    }
    /**
     * Seletores e modificadores
     */
    public String getName(){
        return this.name ;
    }
    
    public void setName (String name){
        this.name = name;
    }
    
    public int getNumberOfContainers(){
        return this.numberOfContainers;
    }
    
    public void setNumberOfContainers(int numberOfContainers){
        this.numberOfContainers = numberOfContainers;
    }

   
}
