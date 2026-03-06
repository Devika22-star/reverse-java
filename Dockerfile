FROM eclipse-temurin:17
WORKDIR /app
COPY . .
RUN javac WorldHello.java
CMD ["java","WorldHello"]