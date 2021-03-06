
[![Build Status](https://travis-ci.com/DinosXa/HundoP.svg?token=PNYnGyYswdFUps8wxmnG&branch=developer)](https://travis-ci.com/DinosXa/HundoP)

# Credits

visit the highlighted url for a full and more concrete explanation on how a smiliar project can work and run.
https://github.com/AntonisGkortzis

# HundoP

This is my first private repository for the assignment requirements of the Software Eningineering in Practice (SEiP) course offered by the Department of Management Science & Technology of the Athens University of Economics and Business.

# Assignment

my assignment is to create a Java application (by using the Maven build automation tool) that reads a file with students’
grades and generates its histogram.

# Project Structure

This repository consists of a parent Maven project and 2 (module) Maven projects one is gradeshistogram and the other is unittesting.

# Requirements

This project requires:
- Java JDK [version 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) (or later) and
- Maven [3.3](https://maven.apache.org/download.cgi) (or later)


# Build and Run

In order to be able to run this on your local computer, firstly you will need to download the following:

```
:Eclipse
```
```
:Apache Maven
```
```
:Git Bash (Windows)
```
```
:Terminal (already installed in Mac)
```
# Configuration

fork this directory and clone it in your local computer using the command:

```
git clone
```

Then open Git-Bash or Terminal depending on if you have mac or windows and execute the following command in the repository root directory in order to build all modules:

```
mvn package
```

This command generates a seperate jar file in each module's corresponding target (module/target) directory.

Next step is typing in the command:

```
mvn clean install
```

```
mvn clean package jacoco:report
```

## General knowledge

Apache Maven is a popular build tool, that takes your project’s Java source code, compiles it, tests it and converts it into an executable Java program: either a .jar or a .war file. mvn clean install command does exactly that. You are using the clean command, which will delete all previously compiled Java sources and resources (like .properties) in your project. Your build will start from a clean slate.Install will then compile, test & package your Java project and even install/copy your built .jar/.war file into your local Maven repository.
reference: https://www.marcobehler.com/guides/mvn-clean-install-a-short-guide-to-maven


### gradeshistogram
This module has no dependencies and thus it requires only the definition of the class that is the main entry point of the system (the class that contains the main method). This is the reason why we add : <mainClass>gradeshistogram.HistogramGenerator</mainClass> 
```
                <plugin>
				<artifactId>maven-assembly-plugin</artifactId>
				<configuration>
					<archive>
						<manifest>
						  <classpathPrefix>lib/</classpathPrefix>
							<addClasspath>true</addClasspath>
						<!-- replace this with the class that contains the main method. It requires also the package name if exists. -->
							<mainClass>gradeshistogram.HistogramGenerator</mainClass> 
						</manifest>
					</archive>
					<descriptorRefs>
						<descriptorRef>jar-with-dependencies</descriptorRef>
					</descriptorRefs>
				</configuration>
				<executions>
					<execution>
						<id>make-assembly</id>
						<phase>package</phase>
						<goals>
							<goal>single</goal>
						</goals>
					</execution>
				</executions>
			</plugin>
```

The produced jar is located in the target directory and can be executed as following:
```
java -jar gradeshistogram-0.0.1-SNAPSHOT.jar C:\Users\30694\Desktop\grades.txt

```

### unittest

unittest file is Java project that helps illustrate/demonstrate Unit testing methods for the requirements of the SEIP course. It uses Maven in order to automate build processes.

```
<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
    	<groupId>gr.aueb.dmst.Dinos</groupId>
    	<artifactId>seip2020_practical_assignments</artifactId>
   		 <version>0.0.1-SNAPSHOT</version>
  	</parent>
	<!-- Replace the following values with your own -->
	<artifactId>unittesting</artifactId>
	<name>HonduP Unittesting</name>
	<description>A project for practicing and familiarizing Unit Testing and continuous integration for the SEIP course.</description>	
</project>
```

## Built With

* [Eclipse](//https://www.eclipse.org/) - The Editor used
* [Maven](https://maven.apache.org/) - Dependency Management
<<<<<<< HEAD
=======

>>>>>>> e561beda504d2918b159f727a646bebc991675a8
