package pa2_u1_ms;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped
@Named("VIP")
public class DescuentoVip implements Descuento {
    @Override
    public double aplicar(double valor) {
        return valor * 0.90;
    }
}