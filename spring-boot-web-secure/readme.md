### Application Requirements

```
1. ssh                  - only accessible through https endpoints                                                       - done

2. authentication       - only authenticated users should be able to access endpoints                                   - in_progress
   1 - simple in-memory spring-security, thymeleaf based auth                                                           - done        
   2 - simple in-memory db (h2/hsql), spring-security, html based auth (for development/unit/integration testing)       - done
   3 - simple db (postgres/mysql), spring-security, html based auth (for production)                                    - todo
   4 - oauth2 based authentication (for production)                                                                     - todo
   
3. autherization        - role based access using spring-security                                                       
   1 - simple in-memory db (h2/hsql) based role definition (for development/unit/integration testing)
   2 - simple db (h2/hsql) based role definition (for production)
   
4. internationalization - support for location based access
```
