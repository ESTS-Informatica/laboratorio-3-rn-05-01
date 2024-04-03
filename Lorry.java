
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
     * @param numberOfPallets, número de paletes
     * @param trailers, número de atrelados
     * @param licensePlate, matrícula
     */
    public Lorry(int numberOfPallets, int trailers,String licensePlate)
    {
        super(licensePlate);
        this.numberOfPallets = numberOfPallets;
        this.trailers = trailers;
        
        
       
    }
    /**
     * Seletores e modificadores
     */
    public int getNumberOfPallets(){
        
        return this.numberOfPallets;
    }
    public int getTrailers (){
        return this.trailers;
    }
    
    public void setNumberOfPallets(int numberOfPallets){
        this.numberOfPallets = numberOfPallets;
    }
    
    public void setTrailers (int trailers){
        this.trailers =  trailers;
    }
    /**
     * Método toString
     */
    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("%15s: %s\n","Nr. Paletes", getNumberOfPallets()));
        sb.append(String.format("%15s: %s\n","Nr. Atrelados", getTrailers()));
        return sb.toString();
    }
    

}
