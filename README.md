# Note


<details>
  <summary>Off Log</summary>

  ###


  ```properties
spring.application.name=_____________
spring.datasource.url=jdbc:mysql://localhost:3306/_____________
spring.datasource.username=_____________
spring.datasource.password=_____________

#Turn off the Spring Boot Banner
spring.main.banner-mode=off
# Reduce Logging level
logging.level.root=WARN
logging.level.org.springframework.web=DEBUG
logging.level.org.hibernate=ERROR
  ```
 ### 
  ```properties
# display logging SQL statements
logging.level.org.hibernate.SQL=debug
logging.level.org.hibernate.jdbc.bind=trace
# Create database from code
spring.jpa.hibernate.ddl-auto=create / update /...
  ```
</details>

