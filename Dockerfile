FROM openjdk:11
ADD build/libs/*.jar  ./
EXPOSE 8888
ENTRYPOINT ["java","-jar","/jenkins-1.jar"]
