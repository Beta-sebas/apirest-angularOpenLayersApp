# Apirest-angularOpenLayersApp

RestApi creada con _Spring Boot_ , sus endpoints permiten crear y consultar información sobre posiciones geográficas básicas (Nombre, Lat, Lon).
 
Librerías de la aplicación

* _Spring Web_
* _Spring Data JPA_
* _MySQL Driver_
* _Spring Boot DevTools_

## Construido con 🛠️

* [Spring Boot](https://spring.io/projects/spring-boot) version 2.7.0.
* [Spring Initializr](https://start.spring.io/)
* _Java Maven Project_ vesion 8 

## Comenzando 🚀

En el IDE de preferencia importa el proyecto (Existing Maven projec) para que se descarguen las dependencias necesarias, edita el archivo application.properties ubicado en:
/src/main/resources/ con los datos necesarios para la conexión con tu Db, si tu despliegue es en un servidor local comenta la linea _server.port=${PORT}_ ya que por defecto la aplicación se ejecutará en el puerto 8080.

## Rutas ⚙️

GET    /api/all Devuelve información de todas las posiciones
POST   /api/setMarcador  Crea posiciones

Filter

GET   /api/marcador/{id}
GET   api/name?name={nombre}

## Deploy Heroku 💻
[Apirest-angularOpenLayersApp](https://spring-openlayers-markers.herokuapp.com/api/all)

## Autor ✒️
* **Juan Sebastian Betancourt**  - [Beta-sebas](https://github.com/Beta-sebas)
