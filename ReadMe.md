# CCT CA1 Secure Scripting & Programming Web App

This is a Web App purposely designed to be vulnerable to SQL Injection and XSS. There is also a non-vulnerable page. It
is pretty simple in nature, it is just a search page and a search box, where users can try to SQL Inject and XSS Attack
the pages.

## Build, Test and Run.

Use Gradle to build and run the Web App.

    ./gradlew clean build bootRun

### H2 Database

This Web App uses H2 Database. To see the database, go to http://localhost:8080/h2-console.  
The password is `password`.

### REST API Access

The `ArticleController` has a REST API defined within it. You can access it via `curl` or `Postman`.

    npm install -g json
    curl -X GET localhost:8080/api/articles | json
    curl -X POST localhost:8080/api/articles -d "title=Pokémon Gold and Silver" | json

