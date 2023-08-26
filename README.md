# java-springboot-demo

This is a demo  sprint boot web application for testing. 

created by https://start.spring.io/

* Gradle 6.9.2 
* Java 11
* SpringBoot 2.7.15
* port 6060


## 1. Provided APIs

### 1.1 SprintBoot Actuator API:

```bash
curl http://localhost:6060/actuator/health 
```

### 1.2. Get Project Version:

```bash
curl http://localhost:6060/version
```

## 2. Run as Jar

```bash
./gradlew clean build
java -jar build/libs/demo-0.0.1-SNAPSHOT-8ab3d16.jar
```

## 3. Run with Docker

### 3.1 Build Docker Image

```bash
./gradlew clean build && \ 
docker build -t villim/java-sprintboot-demo .
```

### 3.2 Run with Docker

```bash
docker run -p 6060:6060 villim/java-sprintboot-demo 
```

Read more at: [Spring Boot Docker](https://spring.io/guides/topicals/spring-boot-docker/)
