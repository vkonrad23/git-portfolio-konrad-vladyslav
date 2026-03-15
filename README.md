# This project is a console-based calculator application written in Java. In the project Java 21 is used with Maven. Calculator supports basic arithmetic operations such as addition, subtraction, multiplication, and division.


# To run the application, follow these steps:
Build/run steps for this project:

Verify prerequisites
Java 21 installed and active:

java -version
Maven installed:
mvn -version

Build and test
From the project root, run:
mvn clean test
Run the app

mvn org.codehaus.mojo:exec-maven-plugin:3.5.0:java -Dexec.mainClass=com.example.Main
Alternative run after compile:

mvn clean compile
java -cp target/classes com.example.Main


# This repo demonstrates a feature branch workflow,
where development happens in separate branches, and changes are merged back to the main branch through pull requests. 

 Branch integration into main
main is now aligned with feature/basic-operations, which indicates integration happened (likely via fast-forward merge in this case).

Remote tracking
You have origin/main plus local branches, which demonstrates local vs remote branch tracking.

History is split into small focused commits (README, pom, gitignore, docs, screenshots, class updates)





# Conflict resultion
File that conflicted is Operation.java


How the conflict happened

Branch 'main' contained only basic methods such as add and subtract
Branch feature/advanced-operations added new methods: multiply and divide
Both branches modified the same file Operations.java which caused a merge conflict


How it was resolved

Opened the file in VS Code Merge Editor
Combined changes from both branches manually
Kept all methods from both sides (add, subtract, multiply, divide)
Kept all methods from both branches to create a complete implementation