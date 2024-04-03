
/**
 * Escreva uma descrição da classe Van aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Van extends GroundTransportation
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio    
    private int packages=0;

    /**
     * Construtor para objetos da classe Van
     */
    public Van(String licensePlate , int packages )
    {
        super(licensePlate);
        this.packages=packages;   
    }

   
    /**
     * Metodo para retornar numero de pakages
     * 
     */
    public int getPackages(){
        return  this.packages;
    }
    
    
    
    /**
     * Método para atualizar o numero de packages
     * 
     * @param matricula
     */
    
    public void setPackages(int packages){
        
         this.packages= packages;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("%15s: %d\n","Packages",getPackages()));
     
        return sb.toString();
        
        
    }
}
