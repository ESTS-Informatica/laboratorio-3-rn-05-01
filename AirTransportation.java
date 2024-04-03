
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
    private static double feeAirTransportation = 4;

    /**
     * Construtor para objetos da classe AirTransportation
     * @param name, Nome da aeronave
     * @param numberOfContainers, Número de contentores
     */
    public AirTransportation(String name, int numberOfContainers)
    {
        super();
        this.name =name;
        this.numberOfContainers = numberOfContainers;
        setFees(feeAirTransportation);
        
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
        
        if (numberOfContainers < 0){
             return;
        }
        this.numberOfContainers = numberOfContainers;
        
    }
    
   /**
    * 
    */ 
    @Override
   public double getPriceWithFees(){
       return getPrice()* (1.0 + (getFees() * 0.01));
   }
   @Override
   public String getTransportType() {
        return "Transporte Aereo";
    }
    /**
     * Método toString()
     */
    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("%15s: %s\n", "Nome", getName()));
        sb.append(String.format("%15s: %s\n", "NºContentores", getNumberOfContainers()));
        
        return sb.toString();
        
        
    }
}
