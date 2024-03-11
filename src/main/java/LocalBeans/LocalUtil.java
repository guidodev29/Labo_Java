package LocalBeans;

import javax.ejb.EJB;
import javax.ejb.Stateful;

@Stateful
public class LocalUtil implements ILocal {
    
    @EJB
    private ILib iLib;
    
    
    @Override 
    public String llamado(){
        return "LA DIRECCIÓN MANDA A LLAMAR AL ALUMNO : " ;
    }
    
    @Override 
    public String notificacion(){
        return "Soporte Técnico tendra en cuenta tu solicitud! Gracias..." + iLib.aviso();
    }
    
    @Override 
    public String detalles(){ 
       return "CLASES ASISTIDAS: 24\nFALTAS: 8\nTOTAL: 32\n";
    }
       
}
