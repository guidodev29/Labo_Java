package BeansStateless;

import LocalBeans.ILocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class Asistencia implements IAsistencia{
    
    @EJB
    private ILocal iLocal;
    
    @Override
    public String confirmarAsistencia(String alumno){
        System.out.println("Cargando Asistencia... ");
        return "El alumno " + alumno + " asistió a clases";     
    }
    
    @Override 
    public String detalles(){
        System.out.println("DETALLES: ");
        return iLocal.detalles();
    }
    
}
