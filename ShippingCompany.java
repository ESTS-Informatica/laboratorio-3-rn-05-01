import java.util.HashSet;
import java.util.ArrayList;

/**
 * Escreva uma descrição da classe ShippingCompany aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ShippingCompany extends HashSet<Transport>
{
    // variáveis de instância 
    private String name;
    private ArrayList<Transport> inService;
    

    /**
     * Construtor para objetos da classe ShippingCompany
     * @param name, Nome da companhia
     */
    public ShippingCompany(String name)
    {
        super();
        this.name = name;
        this.inService = new ArrayList<>();
        
    }
    /**
     * Seletor name
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * Método toString()
     */
    @Override
    public String toString(){
       StringBuilder sb = new StringBuilder();
        sb.append("Transportes em " + this.name + ":\n");
        for (Transport transport : this.inService) {
            sb.append(transport.toString());
        }
        sb.append(super.toString());
        return sb.toString();
   
    }
    /**
     * Método makeTransportation
     * @param id, identificador do transporte
     * @param origin, origem de transporte
     * @param destination, destino do transporte
     * @param price, preço
     */
    public void makeTransportation (String id, String origin, String destination,  double price){
        Transport transport = getTransportation(id);
        if (transport != null){
            inService.remove(transport);
            transport.setOrigin("");
            transport.setDestination("");
            transport.setPrice(0.0);
            transport.setAvailable(true);
            this.add(transport);
        }
                              
     }
     /**
      * Método finalizeTransportation
      * @param id
      */
     public void finalizeTransportation(String id) {
        Transport transport = getTransportation(id);
        if (transport != null) {
            inService.remove(transport);
            transport.setOrigin("");
            transport.setDestination("");
            transport.setPrice(0.0);
            transport.setAvailable(true);
            this.add(transport);
        }
    }
     /**
      * Método auxiliar getTransportation, para obter um transporte pelo ID
      * @param id
      */
     private Transport getTransportation(String id){
         for (Transport transport: this){
             if (transport.getId().equals(id)){
                 return transport;
             }
         }
         return null;
     }


    }
