
package LocalBeans;
import javax.ejb.Stateful;

@Stateful
public class LocalLib implements ILib{

    @Override
    public String aviso() {
           return "Aviso: \"Atención a todos los usuarios del sistema: Se ha detectado una actividad inusual en la red. Por favor, manténgase alerta y comuníquese con el equipo de seguridad de la información si observa algún comportamiento sospechoso. La seguridad de nuestros sistemas y datos es nuestra máxima prioridad. Gracias por su cooperación.\"";
    }
    
}
