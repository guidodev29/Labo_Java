package Test;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import BeansSingleton.ISoporte;

public class TestSingleton {
    
    public static void main(String[] args){
        atencionSoporte();
    }
    
    public static void atencionSoporte(){
        System.out.println("Ejecutando EJB >> SESSION SINGLETON");
        try{
            Context jndi = new InitialContext();
            ISoporte soporte = (ISoporte) jndi.lookup("java:global/laboBeans/Soporte!BeansSingleton.ISoporte");
            System.out.println("DETALLES: " + soporte.Problema());
            System.out.println("Llamada Local");
            System.out.println(soporte.noti());
        }catch(NamingException e){
            e.printStackTrace(System.out);
        }
    }
    
}
