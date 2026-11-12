package pa2_u1_ms;

import io.quarkus.arc.runtime.BeanContainer.Instance;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import pa2_u1_ms.extensiones.MedirTiempo;
import pa2_u1_ms.extensiones.Notificacion;

@ApplicationScoped
public class PedidoService {

    @Inject @Named("VIP")
    Descuento descuentoVip;

    @Inject @Named("NORMAL")
    Descuento descuentoNormal;

    @Inject @Named("EMPLEADO")
    Descuento descuentoEmpleado;

    @Inject @Named("mail")
    Notificacion notificacion;

    @MedirTiempo
    public void procesar(Pedido pedido) {
        Descuento descuento;
        if (pedido.getTipoCliente().equals("VIP")) {
            descuento = descuentoVip;
        } else if (pedido.getTipoCliente().equals("EMPLEADO")) {
            descuento = descuentoEmpleado;
        } else {
            descuento = descuentoNormal;
        }

        double total = descuento.aplicar(pedido.getValor());

        System.out.println("PEDIDO:" + pedido.getCodigo() + "|TOTAL:" + String.format(java.util.Locale.US, "%.2f", total));
        notificacion.enviar(pedido.getCodigo());
    }
}