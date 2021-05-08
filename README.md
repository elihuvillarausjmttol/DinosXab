# DISCLAIMER

This README.md file has been worked on under the guidance of professor Antonis Gkortzis 

visit for a full and more concrete explanation on how a smiliar project can run.
https://github.com/AntonisGkortzis

# HundoP

This is my first private repository for the assignment requirements of the Software Eningineering in Practice (SEiP) course offered by the Department of Management Science & Technology of the Athens University of Economics and Business.

# Assignment

my assignment is to create a Java application (by using the Maven build automation tool) that reads a file with students’
grades and generates its histogram.

# Project Structure

This repository consists of a parent Maven project and a child (module) Maven project, that handle the dependencies in a different way.

# Prerequisites

In order to be able to run this on your local computer, firstly you will need to download the following:

:Eclipse
:Apache Maven
:Git bash (for windows)
:Terminal (already installed in Mac)

Next step:

fork this directory and clone it in your local computer using the command:

git clone

Then open Git-Bash or Terminal depending on if you have mac or windows and execute the following command in the repository root directory in order to build all modules:

mvn pachkage

This command generates a seperate jar file in each module's corresponding target (module/target) directory.

Next step is typing in the command:

mvn clean install 

Apache Maven is a popular build tool, that takes your project’s Java source code, compiles it, tests it and converts it into an executable Java program: either a .jar or a .war file. mvn clean install command does exactly that. You are using the clean command, which will delete all previously compiled Java sources and resources (like .properties) in your project. Your build will start from a clean slate.Install will then compile, test & package your Java project and even install/copy your built .jar/.war file into your local Maven repository.
reference: https://www.marcobehler.com/guides/mvn-clean-install-a-short-guide-to-maven



