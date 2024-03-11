package Test;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import BeansStateful.ItoDoList;
//import LocalBeans.ILocal;

public class TestStateful {

    public static void main(String[] args){
        nuevaTarea();
        //llamadaDireccionLocal();
    }
    
    private static void nuevaTarea(){
        System.out.println("Ejecutando EJB >> SESSION STATEFULL");
        try {
            Context jndi = new InitialContext();
            ItoDoList agg = (ItoDoList) jndi.lookup("java:global/laboBeans/toDoList!BeansStateful.ItoDoList");
            System.out.println(agg);
            System.out.println("NUEVA TAREA AGREGADA");
            agg.aggTarea();
            System.out.println("Llamada Local");
            System.out.println(agg.llamadaLocal());
        }catch(NamingException e){
            e.printStackTrace(System.out);
        }

    }
    
}
