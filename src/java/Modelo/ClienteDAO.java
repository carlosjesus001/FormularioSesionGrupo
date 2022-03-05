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
public class ClienteDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;

    public Cliente buscar(String dnicl) {
        Cliente c = new Cliente();
        String sql = "select * from cliente where Dni=" + dnicl;

        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                c.setIdcl(rs.getInt(1));
                c.setDnicl(rs.getString(2));
                c.setNomcl(rs.getString(3));
                c.setDir(rs.getString(4));
                c.setEstcl(rs.getString(5));

            }
        } catch (Exception e) {
        }
        return c;
    }//fin del metodo buscar

    /**
     * public Cliente validar(String nomcl,String dnicl){ Cliente cl= new
     * Cliente(); String sql="select * from cliente where nomcl=? and dnicl=?";
     * try { con=cn.Conexion(); ps=con.prepareStatement(sql); ps.setString(1,
     * nomcl); ps.setString(2, dnicl); rs=ps.executeQuery(); while (rs.next()) {
     * cl.setIdcl(rs.getInt("IdCliente")); cl.setNomcl(rs.getString("Nombres"));
     * cl.setDnicl(rs.getString("Dni")); cl.setDir(rs.getString("Direccion"));
     * cl.setEstcl(rs.getString("Estado")); } } catch (Exception e) { }
     *
     * return cl; }  *
     */  //fin de la clase validar cliente
    public List ListarCliente() {
        String sql = "select * from cliente;";
        List <Cliente> Listado = new ArrayList<>();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente cl = new Cliente();
                cl.setIdcl(rs.getInt(1));
                cl.setDnicl(rs.getString(2));
                cl.setNomcl(rs.getString(3));
                cl.setDir(rs.getString(4));
                cl.setEstcl(rs.getString(5));
                Listado.add(cl);

            }
        } catch (Exception e) {
        }

        return Listado;
    }//fin de la clase listar cliente

    public int agregar(Cliente cl) {
        String sql = "insert into cliente (Dni, Nombres, Direccion, Estado) values(?,?,?,?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, cl.getDnicl());
            ps.setString(2, cl.getNomcl());
            ps.setString(3, cl.getDir());
            ps.setString(4, cl.getEstcl());
            ps.executeUpdate();

        } catch (Exception e) {
        }
        return r;
    }//fin del metodo agregar cliente

    public Cliente listarIdcl(int idcl) {
        Cliente cl = new Cliente();
        String sql = "select * from cliente where IdCliente" + idcl;

        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                cl.setDnicl(rs.getString(2));
                cl.setNomcl(rs.getString(3));
                cl.setDir(rs.getString(4));
                cl.setEstcl(rs.getString(5));

            }
        } catch (Exception e) {
        }
        return cl;
    }//fin del metodo listarId cliente

    public int actualizar(Cliente cl) {
        String sql = "update  cliente set Dni=?, Nombres=?, Direccion=?, Estado=? where IdCliente=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, cl.getDnicl());
            ps.setString(2, cl.getNomcl());
            ps.setString(3, cl.getDir());
            ps.setString(4, cl.getEstcl());
            ps.setInt(5, cl.getIdcl());
            ps.executeUpdate();

        } catch (Exception e) {
        }
        return r;

    }//fin actualizar cliente

    public void delete(int id) {
        String sql = "delete from cliente where IdCliente=?" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }//fin delete cliente

}//fin de la clase clientedao
