
/**
 * Escreva uma descrição da classe Main aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Main
{
    public static void main(String[] args) {
        ShippingCompany s = new ShippingCompany("RELIABLE-MOVING");
    
        GroundTransportation g1 = new GroundTransportation("12345");
        AirTransportation a1 = new AirTransportation("LYNX",2);
        AirTransportation a2 = new AirTransportation("BOEING",4);
        Lorry l1 = new Lorry(5,2,"6789");
        Van v1 = new Van("2468",6);
        s.add(g1);
        s.add(a1);
        s.add(a2);
        s.add(l1);
        s.add(v1);
        System.out.println(s.toString());
    }
}
