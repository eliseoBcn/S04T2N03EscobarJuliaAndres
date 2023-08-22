# Spring Boot. CRUD con Api RES + Mongo DB
Con este repositorio podemos ver el circuito de creación de un aplicativo CRUD implementado a través de API REST.

Previamente crearemos un proyecto Spring Boot con las dependencias tipicas correspondientes ( Spring Boot DevTools, Web ,Data JPA y la BB.DD).

A continuación nos centraremos en definir las funcionalidades que implementará el aplicativo de este repositorio .

## El domain.
Usaremos un único Bean denominado Fruta con los siguientes campos :

* id de tipo String

* nombre de tipo String

* cantidadQuilos de tipo int

## Controlador Rest
El controlador Rest lo mapearemos con la URL localhost:8080/fruta y mapearemos e implementaremos las siguientes operaciones :

* /add
* /getAll
* /update/{id}
* /delete/{id}
* /getOne/{id}

## Base de datos MongoDB
Usaremos la base de datos MongoDB. Las propiedades de conexion las colocaremos en el fichero de configuración de Sprint Boot.

Nota : AL añadir datos a una colección desde la aplicación MongoDB COMPAS nos lo genera con un Id tipo String. Para que no haya conflictos el Id de nuestro bean Fruta tambien lo hemos definido tipo String.
