package pa2_u1_ms.extensiones;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import pa2_u1_ms.Pedido;

@MedirTiempo
@Interceptor
@Priority(Interceptor.Priority.APPLICATION + 1)
public class MedirTiempoInterceptor {

    @AroundInvoke
    public Object interceptar(InvocationContext context) throws Exception {
        Pedido pedido = (Pedido) context.getParameters()[0];

        long inicio = System.currentTimeMillis();
        Object resultado = context.proceed();
        long fin = System.currentTimeMillis();

        System.out.println("DURACION:" + pedido.getCodigo() + "|MS:" + (fin - inicio));
        System.out.println("TIEMPO:" + pedido.getCodigo() + "|OK");
        return resultado;
    }
}