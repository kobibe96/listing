# **Usages**

* java 11
* Spring Boot 2.5.6
* OpenCsv
* Running on port 8089

# **Instructions**

1. Change in docker.yml your local path to csv file. (In volumes parameter)

2. Run this command to create an image for docker (Using maven plugin):

mvn verify package jib:dockerBuild -DskipTests

3. Run attached docker.yml file using command:

docker-compose -f "docker.yml" up -d

The application is up!

