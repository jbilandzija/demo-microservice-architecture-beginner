# demo-vue-with-spring-boot

## Getting started

### Dev environment setup
* Use IntelliJ or Eclipse as IDE
* As standalone editor VSCode is recommended
* Ensure Maven is installed and points to the right JRE
    * Otherwise you may use given Maven executable (./mvnw)
* Additional tooling
    * OpenJDK 11+
    * DBeaver for Database access
    * Postman for REST CRUD operations against APIs
* NPM and Vue CLI are needed

### Run the application
#### Manually
1. Start Postgres DB container by executing `./start-postgreSQL.sh`
2. Start the application in Spring profile `ldev`
    * either by IDE 
    * with Maven (`mvn springboot:run`)
    * or by CLI `java -jar target/spring-boot-microservices-service-0.0.1-SNAPSHOT.jar`
3. You may start the frontend as standalone application with hot-reload
    * navigate into frontend folder and execute `npm run serve`

