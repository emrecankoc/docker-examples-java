# Basic Docker Example Project

This project shows how to build minimal basic docker image.

## How to use

- First install docker on your machine [from here](https://hub.docker.com/search/?type=edition&offering=community)

- Then clone this repository.

```
git clone https://github.com/emrecankoc/docker-examples-java.git
cd docker-examples-java
cd basic-docker-example
```

- Then generate jar file with maven

```
# this command will generate jar file under the target folder
mvn clean install
# or you can use mvn wrapper inside the folder
mvnw clean install
```

- Then use docker cli to build image.

```
# docker build --help for more information.
# docker build <dockerfile directory> -t <name you want to give your image>
docker build . -t helloworldspring
```

- Then run and create new container.

```
# -p <port that published outside world>:<port that published inside of the container>
# -e <KEY>=<VALUE> any environment variables can be passed as
docker run -p 8080:8080 -e PORT=8080 helloworldspring
```

- Run below command find out your docker machine ip

```
docker-machine ip
# 192.168.99.100 -- will be used as example ip furthermore
```

- Now check http://192.168.99.100:8080/helloworld on your browser.

```
docker container ls         # list your containers with this command
docker stop <container_name> # this command stops your container
```

## Conclusion

This project show you basics of docker, you can find more information on [official docs](https://docs.docker.com)
