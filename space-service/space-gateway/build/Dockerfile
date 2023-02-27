FROM eclipse-temurin:17-jdk-alpine
#时区
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
COPY ../space-gateway-runner-consul/target/space-gateway-consul.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

# maven
# docker build -t com.levizheng/space-gateway .