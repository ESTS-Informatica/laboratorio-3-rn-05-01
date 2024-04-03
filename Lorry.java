
/**
 * Escreva uma descrição da classe Lorry aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Lorry extends GroundTransportation
{
    private int numberOfPallets;
    private int trailers;
    
    

    /**
     * Construtor para objetos da classe Lorry
     */
    public Lorry(int numberOfPallets, int trailers,String licensePlate)
    {
        super(licensePlate);
        this.numberOfPallets = numberOfPallets;
        this.trailers = trailers;
        
        
       
    }
    
    public int getNumberOfPlates(){
        
        return this.numberOfPallets;
    }
    public int getTrailers (){
        return this.trailers;
    }
    
    public void setNumberOfPlates(int numberOfPallets){
        this.numberOfPallets = numberOfPallets;
    }
    
    public void setTrailers (int trailers){
        this.trailers =  trailers;
    }
    
    

}
