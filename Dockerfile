FROM openjdk:8
COPY ./out/artifacts/CheckPrime.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java","-jar","CheckPrime.jar"]