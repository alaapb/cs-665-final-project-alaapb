
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | Alaap Bharadwaj       |
| Date         | 05/04/2023                 |
| Course       | Spring     |
| Assignment # |     Final Project                       |

# Assignment Overview

This projects intent was to create a recipe book generator. An app that allows the user to input various custom recipes and put them all together neatly and print them out in a list. 

# GitHub Repository Link:
https://github.com/alaapb/cs-665-assignment-final-project-alaapb

# Implementation Description 


For each assignment, please answer the following:

- Explain the level of flexibility in your implementation, including how new object types can
be easily added or removed in the future.

In this implementation of the recipe book creator, there is a good level of flexibility as there is a lot of room to expand on what is currently built. Currently there are multiple classes being called from one class which is much easier to navigate and therefore add more classes/features to in the future.

- Discuss the simplicity and understandability of your implementation, ensuring that it is
easy for others to read and maintain.

Not including the documentation, this implementation has a very good natural flow to how each different class is called and how it all work together. This was made even easier with the use of the Facade design pattern which helps future developers to understand the code better and easily trace what the next steps are.

- Describe how you have avoided duplicated code and why it is important.

Avoiding duplicated code is important as if in the future you want to make a change then you will have to make it in multiple places instead of one. I created various classes to minimize the likelihood of having duplicated code. These various classes were created as they did not have relevant relationships with other classes to group them together.

- If applicable, mention any design patterns you have used and explain why they were
chosen.

In this implementation I used the Builder pattern, Iterator pattern, and the Facade Pattern. The builder pattern was chosen because we required to build recipes and ingredients, the best way to do this easily and in a uniform way was to use the builder pattern. This helped reduce the amount of code in the Run class where the recipes are built. The iterator pattern was used because I wanted to display the fully updated recipes list every time a new recipe was inputted, however, this required looping through all the recipes so to make it easier we used the iterator pattern. And last but not least I used the Facade pattern, to help reduce what the user can use and have access to in terms of method calls. Another pattern I used was the MVC pattern, I used this to allow of expandability in the future once a proper front end is added this pattern will come in handy, however, currently I am using to save the users recipes list and making sure that data is not mishandled and does not get corrupted by only returning read only versions of the list.


# Maven Commands

We'll use Apache Maven to compile and run this project. You'll need to install Apache Maven (https://maven.apache.org/) on your system. 

Apache Maven is a build automation tool and a project management tool for Java-based projects. Maven provides a standardized way to build, package, and deploy Java applications.

Maven uses a Project Object Model (POM) file to manage the build process and its dependencies. The POM file contains information about the project, such as its dependencies, the build configuration, and the plugins used for building and packaging the project.

Maven provides a centralized repository for storing and accessing dependencies, which makes it easier to manage the dependencies of a project. It also provides a standardized way to build and deploy projects, which helps to ensure that builds are consistent and repeatable.

Maven also integrates with other development tools, such as IDEs and continuous integration systems, making it easier to use as part of a development workflow.

Maven provides a large number of plugins for various tasks, such as compiling code, running tests, generating reports, and creating JAR files. This makes it a versatile tool that can be used for many different types of Java projects.

## Compile
Type on the command line: 

```bash
mvn clean compile
```



## JUnit Tests
JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:
```bash
mvn clean test
```


## Spotbugs 

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


## Checkstyle 

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on any issues or violations of the coding standards defined in its configuration. This includes issues like code style, code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices, making it easier for other developers to read and maintain. It can also help to identify potential issues before the code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser. 

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`




