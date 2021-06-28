# DISCLAIMER

This README.md file has been worked on under the guidance of professor Antonis Gkortzis 

visit the highlighted url for a full and more concrete explanation on how a smiliar project can work and run.
https://github.com/AntonisGkortzis


# Assignment

This part of the assignment is to import (as a module in my existing repository) a given Maven application and execute unit test whilst adding Travis amd jacoco ( Continuous Integration). 

# Project Structure

This repository consists of a module Maven project called unnitesting. It consists of:
	ArithmeticOperations class
	MyMath class
	
	and test classes for illustrating Unit testing:
	ArithmeticOperationsTest class
	MyMathTest class

# Build and Run

In order to be able to run this code on your local computer, do the following:

```
 mvn clean package jacoco:report

```

