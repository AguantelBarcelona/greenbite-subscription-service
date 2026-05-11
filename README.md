## GreenBite Subscription Service

Microservicio encargado de la gestión de suscripciones de usuarios dentro de la plataforma GreenBite.

### Funcionalidades

* Crear suscripciones
* Modificar planes
* Pausar suscripciones
* Cancelar suscripciones

### Tecnologías utilizadas

* Java 17
* Spring Boot
* Maven
* PostgreSQL
* Docker

## Ejecución local

```bash id="6vlgf5"
mvn spring-boot:run
```

## Docker

### Construir imagen

```bash id="ykrx38"
docker build -t greenbite-subscription-service .
```

### Ejecutar contenedor

```bash id="g0o3k7"
docker run -p 8081:8080 greenbite-subscription-service
```

## Arquitectura

Este microservicio forma parte de la arquitectura de microservicios GreenBite y se integra mediante Docker Compose con:

* BFF Service
* User Service
* PostgreSQL

## Puerto

El servicio se ejecuta en:

```bash id="y7g9tb"
http://localhost:8081
```
