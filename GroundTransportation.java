
/**
 * Escreva uma descrição da classe GroundTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class GroundTransportation extends Transport
{
    
    private String licensePlate;
    private static double feeGroundTransportation = 3;
  

    /**
     * Construtor para objetos da classe GroundTransportation
     */
    public GroundTransportation(String licensePlate )
    {
        // inicializa variáveis de instância
        this.licensePlate=licensePlate;
        setFees(feeGroundTransportation);
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
    
    
    @Override
    public double getPriceWithFees(){
        return getPrice() * (1.0 + (getFees() * 0.01));
        
        
    }
    
    @Override
    public String getTransportType() {
        return "Transporte Terrestre";
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("%15s: %s\n","Matricula", getLicensePlate()));
     
        return sb.toString();
        
        
    }
        
    
}
