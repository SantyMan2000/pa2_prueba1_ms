package pa2_u1_ms;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import pa2_u1_ms.extensiones.MedirTiempo;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    PedidoService pedidoService;

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) {
        System.out.println("INICIO_EVALUACION");

        pedidoService.procesar(new Pedido("P001", "Laptop", 1000.00, "VIP"));
        pedidoService.procesar(new Pedido("P002", "Mouse", 100.00, "NORMAL"));
        pedidoService.procesar(new Pedido("P003", "Teclado", 200.00, "VIP"));

         System.out.println("172219-ms");
        return 0;
    }
}
