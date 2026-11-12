package pa2_u1_ms;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import pa2_u1_ms.extensiones.Notificacion;

@ApplicationScoped
@Named("mail")
public class NotificacionMail implements Notificacion {
    @Override
    public void enviar(String codigo) {
        System.out.println("NOTIFICACION:" + codigo);
    }
}