package Controlador;

import Modelo.Cliente;
import Modelo.ClienteDAO;
import Modelo.Empleado;
import Modelo.EmpleadoDAO;
import Modelo.Producto;
import Modelo.ProductoDAO;
import Modelo.Venta;
import Modelo.VentaDAO;
import config.GenerarSerie;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Flia Salas Romero
 */
public class Controlador extends HttpServlet {

    Producto pro = new Producto();
    ProductoDAO pdao = new ProductoDAO();
    
    Cliente cl = new Cliente();
    ClienteDAO cdao = new ClienteDAO();
    
    Empleado em = new Empleado();
    EmpleadoDAO edao = new EmpleadoDAO();
    
    int ide;
    int idp;
    int idc;
    Venta v = new Venta();
    List<Venta> lista = new ArrayList<>();
    int item;
    int cod;
    String descripcion;
    double precio;
    int cant;
    double subtotal;
    double totalpagar;
    String numeroserie;
    VentaDAO vdao = new VentaDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");
        if (menu.equals("Principal")) {
            request.getRequestDispatcher("Principal.jsp").forward(request, response);
        }

        if (menu.equals("Empleado")) {
            switch (accion) {
                case "Listar":
                    List<Empleado> listaem = edao.Listar();
                    request.setAttribute("empleados", listaem);
                    break;
                case "Agregar":
                    String dni = request.getParameter("txtDni");
                    String nom = request.getParameter("txtNombres");
                    String tel = request.getParameter("txtTel");
                    String est = request.getParameter("txtEstado");
                    String user = request.getParameter("txtUsuario");
                    em.setDni(dni);
                    em.setNom(nom);
                    em.setTel(tel);
                    em.setEstado(est);
                    em.setUser(user);

                    edao.agregar(em);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    ide = Integer.parseInt(request.getParameter("id"));
                    Empleado e = edao.listarId(ide);
                    request.setAttribute("empleado", e);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);

                    break;
                case "Actualizar":
                    String dni1 = request.getParameter("txtDni");
                    String nom1 = request.getParameter("txtNombres");
                    String tel1 = request.getParameter("txtTel");
                    String est1 = request.getParameter("txtEstado");
                    String user1 = request.getParameter("txtUsuario");
                    em.setDni(dni1);
                    em.setNom(nom1);
                    em.setTel(tel1);
                    em.setEstado(est1);
                    em.setUser(user1);
                    em.setId(ide);
                    edao.actualizar(em);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;
                case "Delete":
                    ide = Integer.parseInt(request.getParameter("id"));
                    edao.delete(ide);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;
                default:
                //throw new AssertionError();
                }
            request.getRequestDispatcher("Empleado.jsp").forward(request, response);
        }//if empleado
        if (menu.equals("Cliente")) {
            switch (accion) {
                case "ListarCliente":
                    List<Cliente> lista2 = cdao.ListarCliente();
                    
                    request.setAttribute("clientes", lista2);
                
                    break;
                case "Agregar":
                    String dni = request.getParameter("txtdnicl");
                    String nom = request.getParameter("txtnomcl");
                    String dir = request.getParameter("txtdir");
                    String est = request.getParameter("txtestcl");
                    cl.setDnicl(dni);
                    cl.setNomcl(nom);
                    cl.setDir(dir);
                    cl.setEstcl(est);
                    
                    cdao.agregar(cl);
                    
                    request.getRequestDispatcher("Controlador?menu=Cliente&accion=ListarCliente").forward(request, response);
                    break;
                case "Editar":
                    idc = Integer.parseInt(request.getParameter("id"));
                    Cliente c = cdao.listarIdcl(idc);
                    request.setAttribute("cliente", c);
                    request.getRequestDispatcher("Controlador?menu=Cliente&accion=ListarCliente").forward(request, response);

                    break;
                case "Actualizar":
                    String dnic = request.getParameter("txtdnicl");
                    String nomc = request.getParameter("txtnomcl");
                    String dirc = request.getParameter("txtdir");
                    String estc = request.getParameter("txtestcl");

                    cl.setDnicl(dnic);
                    cl.setNomcl(nomc);
                    cl.setDir(dirc);
                    cl.setEstcl(estc);

                    cl.setIdcl(idc);
                    cdao.actualizar(cl);
                    request.getRequestDispatcher("Controlador?menu=Cliente&accion=ListarCliente").forward(request, response);
                    break;
                case "Delete":
                    idc = Integer.parseInt(request.getParameter("id"));
                    cdao.delete(idc);
                    request.getRequestDispatcher("Controlador?menu=Cliente&accion=ListarCliente").forward(request, response);
                    break;
                default:
                //  throw new AssertionError();
                }
            request.getRequestDispatcher("Clientes.jsp").forward(request, response);
        }//if cliente
        if (menu.equals("Producto")) {
            switch (accion) {
                case "ListarProducto":
                    List listaproducto = pdao.ListarProducto();
                    request.setAttribute("productos", listaproducto);
                    break;
                case "Agregar":
                    String nomp = request.getParameter("txtnomp");
                    double pre = Double.parseDouble(request.getParameter("txtpre"));
                    int stock = Integer.parseInt(request.getParameter("txtstock"));
                    String estpro = request.getParameter("txtestpro");

                    pro.setNomp(nomp);
                    pro.setPrecio(pre);
                    pro.setStock(stock);
                    pro.setEstapro(estpro);

                    pdao.agregar(pro);
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=ListarProducto").forward(request, response);
                    break;
                case "Editar":
                    idp = Integer.parseInt(request.getParameter("id"));
                    Producto p = pdao.listarId(idp);
                    request.setAttribute("producto", p);
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=ListarProducto").forward(request, response);

                    break;
                case "Actualizar":
                    String nompr = request.getParameter("txtnomp");
                    double prec = Double.parseDouble(request.getParameter("txtpre"));
                    int stockp = Integer.parseInt(request.getParameter("txtstock"));
                    String estprod = request.getParameter("txtestpro");
                    pro.setNomp(nompr);
                    pro.setPrecio(prec);
                    pro.setStock(stockp);
                    pro.setEstapro(estprod);
                    pro.setIdp(idp);
                    
                    pdao.actualizar(pro);
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=ListarProducto").forward(request, response);
                    break;
                case "Delete":
                    idp = Integer.parseInt(request.getParameter("id"));
                    pdao.delete(idp);
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=ListarProducto").forward(request, response);
                    break;
                default:
                // throw new AssertionError();
                }

            request.getRequestDispatcher("Producto.jsp").forward(request, response);
        }//if producto
        if (menu.equals("NuevaVenta")) {
            switch (accion) {
                case "BuscarCliente":
                    String dni = request.getParameter("codigocliente");
                    cl.setDnicl(dni);
                    cl = cdao.buscar(dni);
                    request.setAttribute("cl", cl);
                     request.setAttribute("nserie", numeroserie);
                    break;
                case "BuscarProducto":
                    int id = Integer.parseInt(request.getParameter("codigoproducto"));
                    pro = pdao.listarId(id);
                    request.setAttribute("cl", cl);
                    request.setAttribute("product", pro);
                    request.setAttribute("lista", lista);
                    request.setAttribute("totalpagar", totalpagar);
                    request.setAttribute("nserie", numeroserie);
                    break;
                case "AgregarProducto":
                    request.setAttribute("cl", cl);
                    totalpagar = 0.0;
                    item = item + 1;
                    cod = pro.getIdp();
                    descripcion = request.getParameter("nomproducto");
                    precio = Double.parseDouble(request.getParameter("precio"));
                    cant = Integer.parseInt(request.getParameter("cant"));
                    subtotal = precio * cant;
                    v = new Venta();
                    v.setItem(item);
                    v.setIdproducto(cod);
                    v.setDescripcionP(descripcion);
                    v.setPrecio(precio);
                    v.setCantidad(cant);
                    v.setSubtotal(subtotal);
                    lista.add(v);
                    for (int i = 0; i < lista.size(); i++) {
                        totalpagar = totalpagar + lista.get(i).getSubtotal();
                    }
                    request.setAttribute("totalpagar", totalpagar);
                    request.setAttribute("lista", lista);
                    request.setAttribute("nserie", numeroserie);
                    break;
                case "GenerarVenta":
                    for (int i = 0; i < lista.size(); i++) {
                        Producto pr = new Producto();
                        int cantidad = lista.get(i).getCantidad();
                        int idproducto = lista.get(i).getIdproducto();
                        ProductoDAO aO = new ProductoDAO();
                        pr = aO.buscar(idproducto);
                        int sac = pr.getStock() - cantidad;
                        aO.actualizarstock(idproducto, sac);
                    }
                    v.setIdcliente(cl.getIdcl());
                    v.setIdempleado(1);
                    v.setNumserie(numeroserie);
                    v.setFecha("2021-11-30");
                    v.setMonto(totalpagar);
                    v.setEstado("1");
                    vdao.guardarVenta(v);
                    //guardar detalleventas
                    int idv = Integer.parseInt(vdao.IdVentas());
                    for (int i = 0; i < lista.size(); i++) {
                        v = new Venta();
                        v.setId(idv);
                        v.setIdproducto(lista.get(i).getIdproducto());
                        v.setCantidad(lista.get(i).getCantidad());
                        v.setPrecio(lista.get(i).getPrecio());
                        vdao.guardarDetalleventas(v);

                    }
                    break;
                default:
                    v = new Venta();
                    lista = new ArrayList<>();
                    item = 0;
                    totalpagar = 0.0;

                    numeroserie = vdao.GenerarSerie();
                    if (numeroserie == null) {
                        numeroserie = "00000001";
                        request.setAttribute("nserie", numeroserie);
                    } else {
                        int incrementar = Integer.parseInt(numeroserie);
                        GenerarSerie gs = new GenerarSerie();
                        numeroserie = gs.NumeroSerie(incrementar);
                        request.setAttribute("nserie", numeroserie);
                    }

                    request.getRequestDispatcher("RegistrarVenta.jsp").forward(request, response);
                //throw new AssertionError();
            }
            request.getRequestDispatcher("RegistrarVenta.jsp").forward(request, response);
        }//nuevaventa

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
