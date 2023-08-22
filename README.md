![image](https://github.com/eliseoBcn/S04T2N03EscobarJuliaAndres/assets/125320599/b7bdacf1-41d2-4913-9740-5ad317c827f2)# Spring Boot. CRUD con Api RES + Mongo DB
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

Definimos el id en nuestro bean como String pues el id que genera MongoDB tambien es String  .
 

## Juego de pruebas con Postam


### 1. Inicio. Mensaje de base de datos vacia.




![image](https://github.com/eliseoBcn/S04T2N03EscobarJuliaAndres/assets/125320599/ecbc8cd8-8b27-4852-8e9f-02e571253605)





### 2. Alta Frutas. Id generado automaticamente.





![image](https://github.com/eliseoBcn/S04T2N03EscobarJuliaAndres/assets/125320599/ea3988a7-51f7-4415-9b32-dc205543d4f8)





### 3. Alta Frutas. Id insertado manualmente.




![image](https://github.com/eliseoBcn/S04T2N03EscobarJuliaAndres/assets/125320599/8fc56e29-80f0-4462-ba0a-b28bb81585ae)





### 4. Obtener todo la coleccion de Frutas.




![image](https://github.com/eliseoBcn/S04T2N03EscobarJuliaAndres/assets/125320599/6137d117-ff59-4e57-aa16-ae2c1516dcfc)





### 5.  Buscar por id "64e51ed339535a136bf6d5c5"




![image](https://github.com/eliseoBcn/S04T2N03EscobarJuliaAndres/assets/125320599/8cceb863-2f0e-4040-bca1-8cfc96d635c7)




### 6 .  Actualizar  id "64e51ed339535a136bf6d5c5". Restamos kilos.





![image](https://github.com/eliseoBcn/S04T2N03EscobarJuliaAndres/assets/125320599/1b0ac773-003f-4dfc-bd46-5ebf2000d7a5)



### 7 .  Actualizar  id "69" inexistente. Mensaje de aviso.




![image](https://github.com/eliseoBcn/S04T2N03EscobarJuliaAndres/assets/125320599/1abb1e3d-4caa-4d11-9c4b-99348b69c52e)





### 8 . Borramos por  id "1".




![image](https://github.com/eliseoBcn/S04T2N03EscobarJuliaAndres/assets/125320599/65d17b25-9ec8-48a3-8143-ec08e97422fc)






### 9 .Consultamos toda la colección.





![image](https://github.com/eliseoBcn/S04T2N03EscobarJuliaAndres/assets/125320599/fd1ef149-ab16-41ed-bbab-c202bc9b008b)

















