FROM adoptopenjdk/openjdk11:ubi
ARG JAR_FILE=target/*.jar
ENV BOT_NAME=test_md_javarush_bot
ENV BOT_TOKEN=5117024004:AAFgm6IPMNh2hNdjU-tSsyS-hPMlGcq2X0E
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-Dbot.username=${BOT_NAME}", "-Dbot.token=${BOT_TOKEN}", "-jar", "/app.jar"]