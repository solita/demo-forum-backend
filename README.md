# demo-forum-backend

The purpose of this demo is to give a quick overview to how to build a modern backend using Java and Spring Framework. The application that we build is a simple discussion forum. The application allows user to view topics and message chains under a specific topic. The user is also able to create new topics and post new messages to existing topics.

The demo is split into following sections in different GIT branches:


## develop
This is the starting point of the demo. The branch contains a simple "Hello World!!" -application that can be compiled using Gradle: gradlew clean build. If you intend to follow the demo as a hands-on exercise on your own computer you are required to do the following steps before the demo.

1. Install and configure Java 1.8
2. Run command gradlew clean build. This will bootsrap Gradle to you computer
3. Install Java IDE (recommended Eclipse) and import the project to the IDE
4. Install Gradle plugin to your IDE. For Eclipse the plugin is called Gradle IDE Pack


## version_1
This step adds Spring Boot to the project. After this step the project can already be run the from IDE or from command line: java -jar build/libs/demo-forum-backend.jar
The web server can be accessed with URL http://localhost:8080. The web server still responds with error page because no content is available yet.

1. Update build.gradle with Spring Boot dependencies
2. Update App.class to be main function for Spring Boot application


## version_2
This step adds the frontend as a dependency jar. After this step the UI of the application can be accessed using URL http://localhost:8080/webjars/forum/index.html
The REST API is still missing so expect to get JavaScript errors when using the application.

1. Update build.gradle with dependency to libs directory


## version_3
This step adds database to the application. The used database is a light-weight H2 embedded database that does not require installation. The data of the database is written to the demo-fofum-backend/db directory. The database can be reset at any time by deleting the directory and restarting the application.

1. Update build.gradle with JPA and H2 dependencies
2. Add database configuration to application.properties file


## version_4
This step add SQL script that can be used to create the schema and add some initial data. Also uses Flyway to automatically update the database schema.

1. Update build.gradle with Flyway dependency
2. Add SQL migration scripts to project


## version_5
This step adds Controller, Service and Model layers to the project.

1. Add code in controller, service and model packages to the project


## version_6
This step adds DAO layer to the project. The DAOs are created using Spring JpaRepository-mechanism. After this step we have a fully working backend implementation.

1. Uncomment code in the service classes (TopicService, MessageService) and create the missing DAO interfaces (TopicDao, MessageDao) to dao package.















#0 Intro
  1. Esitellään stäcki joka on rakennettu Fingridin projektissa
  2. Esitellään vain backi
  3. Nopea katsaus moneen eri aiheeseen - ei kovin syvällistä
  4. Tuloksena toimiva sovellus - projektirunko - voi poimia yksittäisiä ideoita/työkaluja
  5. Valmistuva sovellus on keskustelufoorumi (aihe - viesti)
  6. Jos aikaa jää niin lopuksi Q&A osuus

#1 Gradle
  1. Kopio projekti: \\freecell\users\antti\koulutus\forum-backend
  2. Käännä komentoriviltä: (chmod u+x gradlew) gradlew clean build
  3. Importoi projekti Eclipseen
  4. Asenna Gradle plugin Eclipseen: Gradle IDE Pack

#2 Spring Boot
  1. Gradle riippuvuudet
  2. App luokan funktion päivitys
  3. Käynnistys Eclipsestä
  4. Käynnistys komentoriviltä: java -jar build/libs/demo-forum-backend.jar

#3 Webjar
  1. Kopioi libs
  2. Lisää Gradle dependency
  3. Päivitä Eclipse
  4. http://localhost:8080/webjars/forum/index.html

#4 Kanta-access
  1. Lisää Gradle dependencyt
  2. Lisää DB propsut: application.properties

#5 Flyway
  1. Lisää Gradle dependency
  2. Lisää kanta SQL skriptit

#6 Controller, Service, Model
  1. Kopioi koodit projektiin

#7 JpaRepot
  1. TopicService
  2. MessageService

#8 Lombok
  1. Päivitä Eclipse: http://projectlombok.org/download.html
  2. Lisää Gradle dependency
  3. Refaktoroi DTO
  4. Refaktoroi Modeli


