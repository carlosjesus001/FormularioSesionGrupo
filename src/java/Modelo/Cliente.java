
package Modelo;

/**
 *
 * @author Flia Salas Romero
 */
public class Cliente {
    int idcl;
    String dnicl;
    String nomcl;
    String dir;
    String estcl;

    public Cliente() {
    }

    public Cliente(int idcl, String dnicl, String nomcl, String dir, String estcl) {
        this.idcl = idcl;
        this.dnicl = dnicl;
        this.nomcl = nomcl;
        this.dir = dir;
        this.estcl = estcl;
    }

    public int getIdcl() {
        return idcl;
    }

    public void setIdcl(int idcl) {
        this.idcl = idcl;
    }

    public String getDnicl() {
        return dnicl;
    }

    public void setDnicl(String dnicl) {
        this.dnicl = dnicl;
    }

    public String getNomcl() {
        return nomcl;
    }

    public void setNomcl(String nomcl) {
        this.nomcl = nomcl;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getEstcl() {
        return estcl;
    }

    public void setEstcl(String estcl) {
        this.estcl = estcl;
    }

   



    
    
    
    
}//fin de la clase cliente
