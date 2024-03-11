package BeansStateless;

import javax.ejb.Remote;

@Remote
public interface IAsistencia {
    public String confirmarAsistencia(String alumno);
    public String detalles();
}
