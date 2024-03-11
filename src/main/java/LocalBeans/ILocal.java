package LocalBeans;

import javax.ejb.Local;

@Local
public interface ILocal {
    public String llamado();
    public String notificacion();
    public String detalles();
}
