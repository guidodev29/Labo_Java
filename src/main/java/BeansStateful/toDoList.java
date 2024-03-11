package BeansStateful;

import LocalBeans.ILocal;
import javax.ejb.EJB;
import javax.ejb.Stateful;

@Stateful
public class toDoList implements ItoDoList{
    
    @EJB
    private ILocal iLocal;
    
    private int tarea;
    
    @Override
     public String llamadaLocal(){
         return iLocal.llamado() + " Ramón Hernandez";
     }
    
     @Override
     public void aggTarea(){
         tarea++;
     }
     
    
    
}
