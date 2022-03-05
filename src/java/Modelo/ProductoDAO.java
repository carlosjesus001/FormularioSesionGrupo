package Modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Flia Salas Romero
 */
public class ProductoDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;

    public Producto buscar(int id) {
        Producto p = new Producto();
        String sql = "select * from producto where idproducto=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                p.setIdp(rs.getInt(1));
                p.setNomp(rs.getString(2));
                p.setPrecio(rs.getDouble(3));
                p.setStock(rs.getInt(4));
                p.setEstapro(rs.getString(5));
            }
        } catch (Exception e) {
        }
        return p;
    }//fin producto buscar

    public int actualizarstock(int id, int stock) {
        String sql = "update producto set Stock=? where idproducto=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, stock);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }//fin metodo actualizarstock

    public List ListarProducto() {
        String sql = "select * from producto;";
        List<Producto> ListaProducto = new ArrayList<>();
        try {

            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto pro = new Producto();
                pro.setIdp(rs.getInt(1));

                pro.setNomp(rs.getString(2));
                pro.setPrecio(rs.getDouble(3));
                pro.setStock(rs.getInt(4));
                pro.setEstapro(rs.getString(5));

                ListaProducto.add(pro);
            }

        } catch (Exception e) {
        }
        return ListaProducto;

    }//fin listarProducto 
    


    public int agregar(Producto pro) {
        String sql = "insert into producto(Nombres,Precio,Stock,Estado) values(?,?,?,?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getNomp());
            ps.setDouble(2, pro.getPrecio());
            ps.setInt(3, pro.getStock());
            ps.setString(4, pro.getEstapro());

            ps.executeUpdate();

        } catch (Exception e) {
        }
        return r;
    }//fin agregarProducto    

    public Producto listarId(int id) {
        Producto pro = new Producto();
        String sql = "select * from producto where IdProducto = " + id;

        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pro.setIdp(id);
                pro.setNomp(rs.getString(2));
                pro.setPrecio(rs.getDouble(3));
                pro.setStock(rs.getInt(4));
                pro.setEstapro(rs.getString(5));

            }
        } catch (Exception e) {
        }
        return pro;
    }//fin del metodo listar idProducto

    public int actualizar(Producto pro) {
        String sql = "update  producto set  Nombres=?, Precio=?, Stock=?, Estado=? where IdProducto=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getNomp());
            ps.setDouble(2, pro.getPrecio());
            ps.setInt(3, pro.getStock());
            ps.setString(4, pro.getEstapro());

            ps.setInt(5, pro.getIdp());
            ps.executeUpdate();

        } catch (Exception e) {
        }
        return r;

    }//fin actualizarproducto

    public void delete(int id) {
        String sql = "delete from producto where IdProducto=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }//fin delete producto

}//fin de la clase productodao
