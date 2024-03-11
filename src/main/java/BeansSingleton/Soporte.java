package BeansSingleton;

import LocalBeans.ILocal;
import javax.ejb.EJB;
import javax.ejb.Singleton;

@Singleton
public class Soporte implements ISoporte{
    
    @EJB
    private ILocal iLocal;
    
    @Override
    public String noti(){
        return iLocal.notificacion();
    }
    
    @Override
    public String Problema(){
        return "El problema es: ";
    }
    
    
}
