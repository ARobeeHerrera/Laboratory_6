# Lab Assignment 6 Dependency Inversion  

The NEU Library offers a variety of resources, including books, theses, capstones, internet access, journals, and newspapers.  

Currently, the Student object has methods like borrowBook(), borrowJournal() with a parameter of title, which directly depend on specific resource types.  

To adhere to the Dependency Inversion Principle (DIP) and ensure flexibility for future changes (such as introducing audio books or e-journals), we need to refactor the program while   maintaining SOLID principles. The goal is to create a robust system that can seamlessly accommodate new resource types in the future.    

Your solution should not violate other SOLID principles.  
# UML DIAGRAM
![image](https://github.com/ARobeeHerrera/Laboratory_6/assets/152839434/f739761f-5bc6-4b5d-9b18-75910ffeb4ec)
