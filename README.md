# my_cv_backend
A backend application for my CV web site, using Spring Boot
## Technologies
JDK 17

## Necessary installation
A development environment (Intellij)

GitBash

Postman

pgAdmin4

Heroku CLI

For Intellij, go to the JetBrains website and create an account. Then, download the program based on your operating system. For GitBash, simply go to the website Git-scm and download the program based on your operating system. Download Postman and pgAdmin4 based on your operating system. When it comes to the pgAdmin4, it is important to note that you have to put the port to 5432 when installing it. In addition, it will ask you type password twice and it is important that you type the same password. The password should be the same for all members of the team. For this project, it is admin. Download Heroku CLI based on your operating system and you will use it to push new code to the Heroku site.

## Framework and dependencies
Spring

The project was created by going to the https://start.spring.io/ and selecting Lombok and Spring Web as dependencies.

## Dependencies
Lombok

Spring Web

Persistence

PostgreSQL

Lombok and SpringWeb were already added when we created the project. When it comes to all other dependencies, we will add them to pom.xml file and then resolve Maven by going to the left bottom corner and hovering on the icon of two windows. Then, you should click on Maven and click on refresh.

## Environment variables
The project has environment variables to have better security since it is hosted on Heroku. If we did not have them, everybody would be able to know the username and password of our database. It allows us to have personalized configurations, but it also makes it easy to deploy our projects without having to store sensitive values in our codebase. They can be found in the application.yml file.

APP_DB_URL

APP_DB_PORT

APP_DB_NAME

APP_USERNAME

APP_PASSWORD

These variables are set for Heroku and the following ones are used locally.

localhost

5432

cv_db

postgres

admin

## Launch
Go to the GitBash and go to the folder where you want to place the project. Once you are in the folder, type git clone https://github.com/Ismar-Becirspahic/my_cv_backend.git.To run the project, open Intellij and select the project that you want to open. However, you will not click on the project itself, but will click on the arrow next to it to expand the project files. You will click on the pom.xml file and open it as a project, not as a file. In addition, you will need to set up a database in pgAdmin4 which will be called cv_db. This database is stored locally.


## Development server
Click run button or Shift + F10 to build the project. Navigate to http://localhost:4200/. The project is connected to the my_cv_frontend project. The project is also hosted on Heroku. If you update the project, you should not only push the changes to the GitHub repository, but also to the Heroku. To do that run the command in GitBash git push heroku master. To navigate to Heroku, go to https://dashboard.heroku.com/apps/my-cv-se.

