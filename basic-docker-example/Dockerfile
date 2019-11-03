FROM openjdk:8

COPY ./target/helloworld-0.0.1-SNAPSHOT.jar /src/app.jar
WORKDIR /src

ENTRYPOINT [ "java", "-jar", "app.jar" ]