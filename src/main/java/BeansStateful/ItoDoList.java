package BeansStateful;

import javax.ejb.Remote;


@Remote
public interface ItoDoList {
    public void aggTarea();
    String llamadaLocal();
}
