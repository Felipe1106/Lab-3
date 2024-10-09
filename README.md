"To run my code you want to download my code and run these two lines of code"

CodeSpace> wget https://repo1.maven.org/maven2/junit/junit/4.13.2/junit-4.13.2.jar

CodeSpace> wget https://repo1.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar

"then you want to compule the code and create the .class files by running this command"

CodeSpace> javac -cp "junit-4.13.2.jar:./src/" src/*.java

"and lastly you want to use mvn to compile and test so use these commands"

CodeSpace> mvn compile

CodeSpace> mvn test

