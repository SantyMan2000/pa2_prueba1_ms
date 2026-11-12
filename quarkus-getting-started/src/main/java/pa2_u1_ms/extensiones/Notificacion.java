package pa2_u1_ms.extensiones;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;


public interface Notificacion {
    void enviar(String codigo);
}