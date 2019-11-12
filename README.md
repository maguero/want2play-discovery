[![Build Status](https://travis-ci.org/maguero/want2play-discovery.svg?branch=master)](https://travis-ci.org/maguero/want2play-discovery)
# Want2Play Discovery

This is a registration service where all services will register when loads and un-register when shutdown. This service is a Spring Boot application based on [Netflix Eureka service registry](https://spring.io/guides/gs/service-registration-and-discovery/).

# Build & Run

This service is dockerized and is built and run from [want2play-orchestration](https://github.com/maguero/want2play-orchestration) service, which loads all services with a `docker-compose` configuration. If you want to build and run this image separately you should follow these steps.

```
:$ docker image build -t want2play-discovery:0.01 .
:$ docker container run --publish 8761:8761 --detach --name bb want2play-discovery:0.01
```

## API endpoints
* Eureka dashboard: [http://localhost:8761/](http://localhost:8761/)
* Health check: [http://localhost:8761/actuator/health](http://localhost:8761/actuator/health)

## Settings

The service will on [localhost:8761](http://localhost:8761/), but if you want to modify the port please go to `application.properties` file.

```
server.port=8761
spring.application.name=discovery-server
eureka.client.register-with-eureka=false
eureka.client.fetch-registry=false
```

If the port is changed, it is also needed to update `Dockerfile` at the line `EXPOSE 8761`.