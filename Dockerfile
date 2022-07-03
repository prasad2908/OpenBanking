FROM openjdk:8-jre-slim
WORKDIR /home
COPY /build/libs/OpenBanking-0.0.1-SNAPSHOT.jar openBanking.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "openBanking.jar"]