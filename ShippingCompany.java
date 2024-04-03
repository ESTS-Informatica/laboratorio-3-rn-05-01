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
        for (Transport transport : inService) {
            sb.append(transport.toString());
        }
        sb.append(super.toString());
        return sb.toString();
   
    }


    }
