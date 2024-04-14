FROM eclipse-temurin:17
LABEL authors="rickdevmajumder"
EXPOSE 8081
VOLUME /tmp
ENTRYPOINT ["java","-jar","/priceservicetotal-1.0.0.jar"]