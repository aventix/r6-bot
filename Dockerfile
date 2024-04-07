FROM openjdk:19-buster as builder

WORKDIR /src

COPY . .

RUN sh gradlew installDist

FROM openjdk:19-alpine

WORKDIR /opt/r6-bot

COPY --from=builder /src/build/install/r6-bot ./

ENTRYPOINT ["sh", "./bin/r6-bot"]