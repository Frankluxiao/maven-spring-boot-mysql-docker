From openjdk:8
copy ./target/maven-spring-boot-mysql-1.0-SNAPSHOT.jar maven-spring-boot-mysql-1.0-SNAPSHOT.jar
CMD ["java","-jar","maven-spring-boot-mysql-1.0-SNAPSHOT.jar"]