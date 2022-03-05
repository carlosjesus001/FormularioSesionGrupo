<%-- 
    Document   : index
    Created on : 27/11/2021, 11:22:18 PM
    Author     : Flia Salas Romero
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
       <title>Sistema ventas</title>
    </head>
    <body>

        <div class="container mt-4 col-lg-4" >
            <div class="card col-sm-10">
                <div class="card-body ">
                    <form class="form-sing" action="ControlValidar" method="POST">
                        <div class="form-group text-center">
                            <h3>Registrar Usuario</h3>
                            <img src="imagenes/usuario.png" alt="70" width="170"/>
                            <br>
                            <label><strong>Datos Personales</strong></label>
                        </div>
                        <div class="form-group">
                            <label><strong>Nombres:</strong></label>
                            <input type="text" name="txtuser" class="form-control">
                        </div>
                        <div class="form-group">
                            <label><strong>Apellidos:</strong></label>
                            <input type="text" name="txtuser" class="form-control">
                        </div>
                        <div class="form-group">
                            <label><strong>Fecha Nacimiento:</strong></label>
                            <input type="text" name="txtuser" class="form-control">
                        </div>
                        <div class="form-group">
                            <label><strong>Correo Electronico:</strong></label>
                            <input type="email" name="txtuser" class="form-control">
                        </div>
                        <div class="form-group">
                            <label><strong>Usuario:</strong></label>
                            <input type="text" name="txtuser" class="form-control">
                        </div>
                        <div class="form-group">
                            <label><strong>Contraseña:</strong></label>
                            <input type="password" name="txtpass" class="form-control">
                        </div>
                        <input type="submit" name="accion" value="Registrarse" class="btn btn-primary btn-block">
                        <input type="submit" name="accion" value="Volver al login" class="btn btn-primary btn-block">
                    </form>
                </div>
            </div>
        </div>   
        
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>           

    </body>
</html>
