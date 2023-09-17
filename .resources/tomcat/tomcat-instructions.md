### Installing tomcat in macOS
```
brew install tomcat
```

### Running tomcat in macOS

```
brew tap homebrew/services
brew services start tomcat
brew service stop tomcat
```

### Changing password for tomcat admin UIs
```
vi /opt/homebrew/Cellar/tomcat/10.1.13/libexec/conf/tomcat-users.xml

uncomment and add user/passwords
```

### Creating a new WAR module (IntelliJ Idea)

```
new -> module -> maven archetype -> archetype=maven-archetype-webapp
```

### Packaging a War file (Maven)

```
maven -> Lifecycle -> package

check maven logs to determine war file location (war_file_location)

for example, war_file_location = /Users/aniket/Files/github/java-spring/spring-mvc-tomcat/target/spring-mvc-tomcat.war
```

### Copying war files to local tomcat server

```
1 - command to find CATALINA_BASE: 

catalina

2 - for example CATALINA_BASE:

/opt/homebrew/Cellar/tomcat/10.1.13/libexec

3 - command to copy war file to: 

cp /Users/aniket/Files/github/java-spring/spring-mvc-tomcat/target/spring-mvc-tomcat.war /opt/homebrew/Cellar/tomcat/10.1.13/libexec/webapps
```
