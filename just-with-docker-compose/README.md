
# Docker Compose

In this example i tried to go from the bottom, and communicate my services without any other
third party.

![Architecture of application](../images/diagram%20of%20services.png "Architecture of application")


### Movies-Service

This service is a spring boot application that expose an api to get movie informations from IMDB using imdb id

### Movie-Blog-Service

This service is a fastapi application that expose an api to get movie informations from movies-service using imdb id


## How ?

The first question that i had is how Movie-blog-service will
know the Movies-service ip address ?
i could run the Movies-service then i use the ip address in the Movie-blog-service,
the best way is to find a solution to get that ip address dynamically. 

### Service Discovery

Docker has a built in service discovery, i'm not going into details, you need to specify the service-name as defined in your docker compose file, and you will replace it in the ip address.
for example in the docker compose in this project, you see that the service name of movies-service is **java**,
in the python application when we want to call this services we use `http://java:{PORT}/api/` instead of `http://127.0.0.1:{PORT}/api/`.

## Demo 

Clone the project

```bash
git clone https://github.com/mrsofiane/microservices-examples
cd Microservices-examples/just-with-docker-compose
```

Run docker compose

```bash
docker-compose up
```

Open The Browser

```bash
http://0.0.0.0/movie/tt10665342
```