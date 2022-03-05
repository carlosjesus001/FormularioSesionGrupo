
package Modelo;

/**
 *
 * @author Flia Salas Romero
 */
public class Producto {
    int idp;
    String nomp;
    Double precio;
    int stock;
    String estapro;

    public Producto() {
    }

    public Producto(int idp, String nomp, Double precio, int stock, String estapro) {
        this.idp = idp;
        this.nomp = nomp;
        this.precio = precio;
        this.stock = stock;
        this.estapro = estapro;
    }

    public int getIdp() {
        return idp;
    }

    public void setIdp(int idp) {
        this.idp = idp;
    }

    public String getNomp() {
        return nomp;
    }

    public void setNomp(String nomp) {
        this.nomp = nomp;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getEstapro() {
        return estapro;
    }

    public void setEstapro(String estapro) {
        this.estapro = estapro;
    }

    
    
    
}//fin de la clase producto
