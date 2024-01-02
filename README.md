# PRUEBA TÉCNICA 1 ANTONIO JOSÉ PERALBO
Ejercicio practico en el que el proyecto permite hacer un CRUD ( Create , Read, Update, Destroy) a traves de JPA .
## INSTALACIÓN E INICIO DEL PROYECTO
Para ello debemos segir los sieguientes pasos:
- Clonar el repositorio.
- Iniciar el gestor de bases de datos (En este caso Xampp).
- Importar la base de datos subida al repositorio (empleados.sql)
- Abrir en el IDE que vayan a usar el poryecto y ejecutarlo.
## CONTENIDO Y USO.
  Una vez hemos ejecutado el proyecto se nos desplegara la consola para elegir entre las sienguentes opciones:
  1. AGREGAR USUARIO:
    Se pedira a traves de la consola que se ingresen los atributos del empleado( nombre, apellidos, cargo, salario y fehca de inicio).
  2. VER LISTA DE USUARIOS:
    Con esta opcion podemos imprimir por consola la lista completa de la tabla empleados de la base de datos.
  3. EDITAR USUARIO:
    En este apartado os pedimos que nos faciliteis el id del empleado para encontrolarlo, despues podreis modificar el atributo que elijais.
  4. ELIMINAR USUARIO:
    Opcion en la que atraves del numero de empleado que se facilite por consola se elimina el registro de la tabla.
  5. VER LISTA POR CARGO:
     Se os pedira por consola que se facilite el cargo por el que quereis filrar, una vez puesto se imprime por patalla la de todos aquellos empleados que tengan ese cargo. 
  0. SALIR DE LA APLICACIÓN:
     Cierre de la aplicacion.
     
## SUPUESTOS
  - Al ser una aplicación de empleados entendemos que el id se equipara al numero de empleado por lo que al ser un número unico no habria duplicados.
  - El formato de la fecha es dd/MM/yyyy , en caso de no intruducirse asi saltara el error y la aplicación volvera a solicitar que introduzca los datos de inicio.
