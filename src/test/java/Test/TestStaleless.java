package Test;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import BeansStateless.IAsistencia;

public class TestStaleless {
    public static void main(String[] args){
        System.out.println("Ejecutando EJB >> SESSION STATELESS");
        try{
            Context jndi = new InitialContext();
            IAsistencia asistenciaEjb = (IAsistencia) jndi.lookup("java:global/laboBeans/Asistencia!BeansStateless.IAsistencia");
            String resp = asistenciaEjb.confirmarAsistencia("Anthony Miguel Hernández");
            System.out.println(resp);
            System.out.println("Llamada Local");
            System.out.println(asistenciaEjb.detalles());

            
        }catch(NamingException e){
            e.printStackTrace(System.out);
        }
    }
    
}
