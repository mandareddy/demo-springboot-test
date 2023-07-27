
 #####simple  springboot with rest api and running springboot application inside docker####
 

 https://start.spring.io/          #create and generate spring boot application
 unzip --> import it into the specific IDE(like Intellij/Eclipse)
 build springboot app as jar file (select project-->rightside(execute maven goal)-->mvn package) , target folder gets created.
 Rightclik(project)-->New-->file-->Dockerfile(name can be anything)
 terminal check docker --version 
 docker build -t "nameoftheimage:tag" .      #used to build dcoker image
 #docker image ls      //listing out the docker images
 
 
 
 
 
 
