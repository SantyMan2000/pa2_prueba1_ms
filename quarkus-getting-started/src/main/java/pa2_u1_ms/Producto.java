package pa2_u1_ms;

import jakarta.inject.Inject;

public class Producto {

    @Inject
    ClienteNormal clienteNormal;
    @Inject 
    ClientesVip clientesVip;

    public String codigo;
    public String nombre;
    public String ValorOriginal;

    public Producto(String codigo, String nombre, String valorOriginal) {
        this.codigo = codigo;
        this.nombre = nombre;
        ValorOriginal = valorOriginal;
    }
    public ClienteNormal getClienteNormal() {
        return clienteNormal;
    }
    public void setClienteNormal(ClienteNormal clienteNormal) {
        this.clienteNormal = clienteNormal;
    }
    public ClientesVip getClientesVip() {
        return clientesVip;
    }
    public void setClientesVip(ClientesVip clientesVip) {
        this.clientesVip = clientesVip;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getValorOriginal() {
        return ValorOriginal;
    }
    public void setValorOriginal(String valorOriginal) {
        ValorOriginal = valorOriginal;
    }
    
    

}
