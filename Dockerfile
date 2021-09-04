FROM openjdk:11
ADD build/libs/*.jar  ./
ENTRYPOINT ["java","-jar","/jenkins-1.jar"]
