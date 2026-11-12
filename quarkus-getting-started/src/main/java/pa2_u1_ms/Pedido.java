package pa2_u1_ms;

public class Pedido {
    private String codigo;
    private String producto;
    private double valor;
    private String tipoCliente; 

    public Pedido(String codigo, String producto, double valor, String tipoCliente) {
        this.codigo = codigo;
        this.producto = producto;
        this.valor = valor;
        this.tipoCliente = tipoCliente;
    }

    public String getCodigo() {
         return codigo;
         }
    public String getProducto(){
         return producto; 
        }
    public double getValor() {
         return valor; 
        }
    public String getTipoCliente() { 
        return tipoCliente; }
}


