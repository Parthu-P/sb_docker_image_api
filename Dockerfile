FROM openjdk:17

COPY usr/app/target/app.jar usr/app/app.jar

WORKDIR /usr/app

ENTRYPOINT [ "java","-jar","app.jar" ]