cd outreach-mobile-data
pwd
mvn clean compile
cd ../
pwd
mvn install
cd outreach-mobile-web
pwd
mvn clean compile tomcat7:redeploy
cd ../
pwd
