FROM unimedgf/microservice-base:java8
COPY maven /opt/app/
WORKDIR /opt/app

ENTRYPOINT java $JAVA_OPTIONS -jar ./*.jar

EXPOSE 8106
