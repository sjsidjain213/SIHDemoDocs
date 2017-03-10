# SIHDemoDocs
For SIH Demo Programs and Concepts

prerequisite:
Eclipse Mars (preferred) or any other version of Eclipse
Java 1.8 (Preferred) or 1.7 
Apache Tomat 8.x (preferred) or 7.x

open eclipse
Create a new Dynamic Web Project name it code
Deploy this project on Apache Tomcat 
Create SIH package inside Project code. You can also add this package while adding servlet in next step
Create new Servlet name it RestDemo and place it in SIH package
Create Simple Java class name it RestDemoBean
Add Code in both class
Start Tomcat Server
Open ARC
type this in URL:  http://localhost:8080/code/RestDemo
Select Post
In RAW Payload enter:  {"username":"sjsidjain"}
Then click Send
Expected output:  {"State":"Rajasthan","Email id":"sjsidjain213@gmail.com","Zipcode":302017.0,"Country":"India","City":"Jaipur","Phone no":9.799784767E9}


Structure of Project
RestDemo is main servlet class which will reply to all request received from any webpage
RestDemoBean this is the supporter bean of RestDemo
