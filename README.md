# OrderShirt
This project is for ordering a T Shirt from a web application

### Tools required to run the project
1. Intellij idea or Eclipse
2. Maven build tool

### Steps to run test scenarios
##### From Intellij
1. Go to TestRunner class.
2. Edit tags
3. Right click 
4. Run

##### From Eclipse
1. Go to TestRunner class.
2. Edit tags
3. Right click 
4. Run as JUnit

##### Using terminal
1. Write command "mvn test"
2. Hit enter.



### Improvements that can be done
1. I am using GSON to read data for .json file by creating a .java file for the keys present. .json file can also be read directly, it will ease the developer if there are 100s of enteries.
2. Order can be verified from order history table.
3. PicoContainer dependency can be used to share the contents of step definition file into multiple step definition files, if there are more number of scenarios.
