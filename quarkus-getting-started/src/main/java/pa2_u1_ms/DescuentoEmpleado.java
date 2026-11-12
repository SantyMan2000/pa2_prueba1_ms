package pa2_u1_ms;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped
@Named("EMPLEADO")
public class DescuentoEmpleado implements Descuento {
    @Override
    public double aplicar(double valor) {
        return valor * 0.80;
    }
}