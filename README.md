## Phase4-SCSB-Common

   

## Software Required

      - Java 11
      - Docker 19.03.13   
      
## Build

- Download the Project , navigate inside project folder and build the project using below command

-${VersionNumber} - Current Version of Common Jar i.e. 1.6

./gradlew clean build -x test -DarchiveVersion=${VersionNumber} 

- Move the Generated Jar file to  **/data/commonjar/**
