# OpenBanking
This micro service will provide the ATM details based on the identification number


To Run without Docker

> gradlew clean build

> java -jar /build/libs/OpenBanking-0.0.1-SNAPSHOT.jar

To Run with Docker

> gradlew clean build

> docker build -t openbanking .

> docker run -d -p 8080:8080 openbanking

> docker stop <image-name>
