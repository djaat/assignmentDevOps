FROM openjdk:latest

WORKDIR /app

COPY /bin /app
COPY /src /app

RUN cd /bin

CMD ["java","Solution"]

