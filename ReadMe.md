# CCT CA1 Secure Scripting & Programming Web App

UPDATE: Spring Boot is too well configured out-of-the-box to handle SQL Injection and XSS attacks. At this time, I'm not
going to go into Spring Security and loosen the default configuration.

This is a Web App purposely designed to be vulnerable to SQL Injection and XSS. There is also a non-vulnerable page. It
is pretty straightforward in nature, it is just a search page and a search box, where users can try to SQL Inject and
XSS Attack the pages.

## Build, Run and Test.

Use Gradle to build and run the Web App.

    ./gradlew clean bootRun

Press `Ctrl+C` to stop the Web App.

In your browser go to:

* http://localhost:8080/
* http://localhost:8080/?searchterm=gold
* http://localhost:8080/vulnerable
* http://localhost:8080/vulnerable?searchterm=gold

To try some SQL Injection and XSS attacks, use the following:

* http://localhost:8080/vulnerable?searchterm=Gold%%27;%20DROP%20TABLE%20ARTICLE
* http://localhost:8080/?searchterm=1%27%20or%201=1%20--
* http://localhost:8080/?searchterm=1%27%20or%201=1%20%3Cscript%3Ealert(1)%3C/script%3E
* http://localhost:8080/?searchterm=1%27%20or%201=1%20%3Cimg%20src%3D%22x%22%20onerror%3Dalert(1)%3E
* http://localhost:8080/vulnerable?searchterm=1%27%20or%201=1%20--
* http://localhost:8080/vulnerable?searchterm=1%27%20or%201=1%20%3Cscript%3Ealert(1)%3C/script%3E
* http://localhost:8080/vulnerable?searchterm=1%27%20or%201=1%20%3Cimg%20src%3D%22x%22%20onerror%3Dalert(1)%3E

We are aiming to do something similar to:

    SELECT * FROM ARTICLE WHERE TITLE LIKE %Gold'; DROP TABLE ARTICLE

### H2 Database

This Web App uses H2 Database. To see the database, go to http://localhost:8080/h2-console.  
The password is `password`.

### REST API Access

The `ArticleController` has a REST API defined within it. You can access it via `curl` or `Postman`.

Optionally, you can use `json` to pretty print the JSON responses.

    npm install -g json

Usage Examples:

    curl -X GET  localhost:8080/api/articles | json
    curl -X GET  localhost:8080/api/articles/count | json
    curl -X POST localhost:8080/api/articles/search -d "searchTerm=Gold" | json

