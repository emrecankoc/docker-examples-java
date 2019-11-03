# Basic Docker Example Project

This project shows how to build minimal basic docker image.

## How to use

- First install docker on your machine [from here](https://hub.docker.com/search/?type=edition&offering=community)

- Then clone this repository.

```
git clone https://github.com/emrecankoc/docker-examples-java.git
cd docker-examples-java
cd docker-compose-example
```

- Then use docker cli to build image.

```
docker-compose build
```

- Then run and create new container.

```
docker-compose up
```

- Run below command find out your docker machine ip

```
docker-machine ip
# 192.168.99.100 -- will be used as example ip furthermore
```

- Now check http://192.168.99.100:8080/books/ on your browser.

```
docker container ls         # list your containers with this command
docker stop <container_name> # this command stops your container
```

## Conclusion

This project show you basics of docker, you can find more information on [official docs](https://docs.docker.com)
