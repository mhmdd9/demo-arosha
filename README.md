
# Sample project for Arosha

## Description
This Project consists of two main Entities: Person (table PERSON), 
Document (table DOCUMENT) which are related
 via ManyToMany relationship, and the join table name is PERSON_DOCUMENTS.
 
## Requirements to run

- JDK 11+
- Maven 3

## Running application locally

One way is to simply execute the `main` method of the `com.example.demo.DemoApplication` class from your IDE.

Alternatively You can use the Spring Boot Maven Plugin like so:

```shell
mvn spring-boot:run
```

the application would be up on port `8080` 
of `localhost` 
with context path of `/app`

#### Note:

after running the application, 3 Persons 
and 3 Documents get Stored into DB initially
 with ManyToMany relation between them.  


## API References
Read and/or Modify Entities via APIs.

You can view Models and view/test APIs through url `/swagger-ui/#` 
after running the app with the guide noted above. 


## Tech Stack

**Spring boot version 2.7.1**
* Spring Data - JPA
* Spring Web

**Database:** H2 In-Memory Database

**Documentation:** Swagger2

## Author
**Mohamad Daryabari**
(m.daryabari10@gmail.com)

