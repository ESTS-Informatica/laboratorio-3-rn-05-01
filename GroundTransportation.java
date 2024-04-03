
/**
 * Escreva uma descrição da classe GroundTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class GroundTransportation extends Transport
{
    
    private String licensePlate;
    private static double feeGroundTransportation = 0.03;
  

    /**
     * Construtor para objetos da classe GroundTransportation
     */
    public GroundTransportation(String licensePlate )
    {
        // inicializa variáveis de instância
        this.licensePlate=licensePlate;
        feeGroundTransportation = 0.03;
    }
     
    
    /**
     * Metudo para returnar a matricula da viatura
     * 
     */
    public String getLicensePlate(){
        return licensePlate;
    }
    
    
    
    /**
     * Metudo para atualizar a matricula da viatura
     * 
     * @param matricula
     */
    
    public void setLicensePlate(String licensePlate){
         this.licensePlate=licensePlate;
    }
    
    
    
}
