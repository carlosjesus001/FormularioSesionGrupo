
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="css/bootstrap.min.css">  
	<meta name="viewport" content="width=device-width, initial-scale=1">
  
	<title>Paneles - Cuadros Modales: Bootstrap</title>

</head>

<!-- Se fija un contenedor normal que tenga 1em de espacio en el top del cuerpo -->
<div class="container">
<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
  <!-- El logotipo y el icono que despliega el menú se agrupan
       para mostrarlos mejor en los dispositivos móviles -->
  <div class="navbar-header">
    <button type="button" class="navbar-toggle" data-toggle="collapse"
            data-target=".navbar-ex1-collapse">
      <span class="sr-only">Desplegar navegación</span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
    </button>
    <a class="navbar-brand" href="#">
    	<img src="imagenes/bg48.png" title="Biblioteca Perla de la Sabana" /></a>
  </div>
 
  <!-- Agrupar los enlaces de navegación, los formularios y cualquier
       otro elemento que se pueda ocultar al minimizar la barra -->
  <div class="collapse navbar-collapse navbar-ex1-collapse">
    <ul class="nav navbar-nav navbar-left">
      <li class="active"><a href="#">Home</a></li>
      <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
          Registro <b class="caret"></b>
        </a>
        <ul class="dropdown-menu">          
          <li><a href="#">Autor</a></li>
          <li><a href="#">Tema</a></li>
          <li><a href="#">Libro</a></li>
          <li><a href="#">Ejemplar</a></li>          
          <li class="divider"></li>        
          <li><a href="#">Lector</a></li>  
          <li><a href="#">Préstamo</a></li>
          <li><a href="#">Devolución</a></li>
        </ul>
      </li>
      <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
          Listados<b class="caret"></b>
        </a>
        <ul class="dropdown-menu">
          <li><a href="#">Autores</a></li>
          <li><a href="#">Temas</a></li>
          <li><a href="#">Libros</a></li> 
          <li><a href="#">Ejemplares</a></li> 
        </ul>
      </li>            
      <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
          Informes<b class="caret"></b>
        </a>
        <ul class="dropdown-menu">
          <li><a href="#">Préstamos</a></li>
          <li><a href="#">Dovoluciones</a></li>
          <li class="divider"></li>        
          <li><a href="#"><a>Sancionados</a></li>
          <li><a href="#"><a>Perdidos</a></li>
        </ul>
      </li>   
    </ul>
	
	<ul class="nav navbar-nav navbar-right">
	  <li><a href="#">admin <span class="glyphicon glyphicon-user"></span></a></li>
      <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
         Perfil<b class="caret"></b>
        </a>
        <ul class="dropdown-menu">
          <li><a href="#">Privilegios</a></li>
          <li><a href="#">Cuenta</a></li>
          <li><a href="#">Cambiar contraseña</a></li>
        </ul>
      </li>
      <form class="navbar-form navbar-left" role="search">
	      <button type="submit" class="btn btn-default"><a href="#">Cerrar</a></button>
	    </form>       
    </ul>    

  </div>
</nav>
</div><!-- container -->


<div class="container" style="padding-top: 3em;">

	<div class="row" style="padding-top: 3em;">
		<div class="col-xs-6">

      <!-- AQUI VA EL PANEL DE LA MISION -->

		</div><!-- col-xs-6 -->

		<div class="col-xs-6">

      <!-- AQUI VA EL PANEL DE LA VISION -->    

    </div><!-- col-xs-6 -->	
	 </div>	
</div><!-- container -->


<div class="container" style="padding-top: 1em;">  
 <div class="row">
     <div class="col-xs-6">  

      <!-- AQUI VA EL BOTON QUE LLAMA AL CUADRO MODAL Y EL CUADRO MODAL -->

    </div> <!-- col-xs-6 -->   
  </div><!-- row -->
</div><!-- container -->





<div class="footer" style="padding-top: 1em;">
  <div class="container">
    <p class="text-muted">Todos lo derechos reservados 2017. Programación WEB</p>
  </div>
</div><!-- fin footer -->




<!-- Librerias JavaScript necesarias -->
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>

</body>

</html>
