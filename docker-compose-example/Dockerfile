#dependency downlading stage
FROM maven:3.6.1-jdk-8 as base

COPY pom.xml /usr/src/build/pom.xml
WORKDIR /usr/src/build
# build all dependencies for offline use
RUN mvn dependency:go-offline -B

#building stage
FROM base as builder

COPY . /usr/src/build/
WORKDIR /usr/src/build
# build for release
# run tests if you need
RUN mvn package -DskipTests

# runtime environment
FROM openjdk:8
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS

# copy files from build stage
COPY --from=builder /usr/src/build/target/helloworld-0.0.1-SNAPSHOT.jar /usr/src/app/app.jar

WORKDIR /usr/src/app/

CMD [ "java", "-jar", "app.jar" ]