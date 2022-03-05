<%-- 
    Document   : RegistrarVenta
    Created on : 28/11/2021, 10:37:35 PM
    Author     : Flia Salas Romero
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Registrar Ventas</title>
        <style>
            @media print{
                .parte01, btn, .accion{
                    display: none;
                }
            }
        </style>
    </head>
    <body>

        <div class="d-flex">
            <div class="col-lg-5 parte01">
                <div class="card">
                    <form action="Controlador?menu=NuevaVenta" method="POST">
                    <div class="card-body">
                        <div class="form-group">
                            <label>Datos del Cliente</label>
                        </div>
                        <div class="form-group d-flex">
                            <div class="col-sm-6 d-flex">
                                <input type="text" name="codigocliente" value="${cl.getDnicl()}" class="form-control" placeholder="codigo">
                                 <input type="submit" name="accion" value="BuscarCliente" class="btn btn-outline-info">
                            </div>
                           
                            <div class="col-sm-6">
                                <input type="text" name="nombrescliente" value="${cl.getNomcl()}" class="form-control" >  
                            </div>
                           
                            
                           
                        </div>
                        <div class="form-group">
                            <label>Datos Producto</label>
                        </div>
                        <div class="form-group d-flex">
                                  <div class="col-sm-6 d-flex">
                                 <input type="text" name="codigoproducto" value="${product.getIdp()}" class="form-control" placeholder="Datos Producto">
                                 <button type="submit" name="accion" value="BuscarProducto" class="btn btn-outline-info">Buscarproducto</button>
                            </div>
                           
                            <div class="col-sm-6">
                                <input type="text" name="nomproducto" value="${product.getNomp()}" class="form-control" placeholder="Datos Productos">  
                            </div>
                        </div>
                        <div class="form-group d-flex">
                              <div class="col-sm-6 d-flex">
                                  <input type="text" name="precio" value="${product.getPrecio()}" class="form-control" placeholder="$/ 0.00">
                                
                            </div>
                           
                            <div class="col-sm-3">
                               <input type="number" name="cant" value="1" class="form-control" >  
                            </div>
                            <div class="col-sm-3">
                               <input type="text" name="stock" value="${product.getStock()}" class="form-control" >  
                            </div>
                        </div>
                        <div class="form-group">
                            <button type="submit" name="accion" value="AgregarProducto" class="btn btn-outline-info">Agregar Producto</button>
                        </div>
                    </div>
                    </form>
                </div>
            </div>
            <div class="col-sm-7">
                <div class="card">
                    <div class="card-body">
                        <div class="d-flex col-sm-6 ml-auto">
                            <label><strong>Nro.Serie</strong></label>
                            <input readonly="" type="text" name="NroSerie" value="${nserie}" class="form-control">
                </div> 
                        <br>
                        <table class="table table-hover">
                            <thead>
                                <tr class="text-center">
                                    <th>Nro </th>
                                    <th>Codigo</th>
                                    <th>Descripcion</th>
                                    <th>Precio</th>
                                    <th>Cantidad</th>
                                    <th>SubTotal</th>
                                    <th class="accion">Acciones</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="list" items="${lista}">
                                    <tr class="text-center">
                                    <td>${list.getItem()}</td>
                                    <td>${list.getIdproducto()}</td>
                                    <td>${list.getDescripcionP()}</td>
                                    <td>${list.getPrecio()}</td>
                                    <td>${list.getCantidad()}</td>
                                    <td>${list.getSubtotal()}</td>
                                    <td class="d-flex">
                                        <a href="" class="btn btn-warning">Editar</a>
                                        <a href="" class="btn btn-danger" style="margin-left:10px; ">Delete</a>
                                    </td>
                                   
                                </tr>
                                </c:forEach>
                            </tbody>
                        </table>

                    </div>
                    <div class="card-footer d-flex">
                        <div class="col-sm-6">
                            <a   href="Controlador?menu=NuevaVenta&accion=GenerarVenta" onclick="print()" class="btn btn-success">Generar Venta</a>
                           <!-- <input type="submit" name="accion" value="Generar Venta" class="btn btn-success">-->
                            <input type="submit" name="accion" value="Cancelar" class="btn btn-danger">
                        </div>
                        <div class="col-sm-3 ml-auto">
                            <input type="text" name="txtTotal" value="$/. ${totalpagar}" class="form-control">
                        </div>
                    </div>
                </div>
              
            </div>
        </div>
        
        
        
        
        
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>           

    </body>
</html>
