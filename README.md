# Food Truck Project

## Description
The goal of this project was to develop a program that users could input instances of "food trucks", rate them, and review the logged data, in the form of logged trucks, average rating, and highest rated. All of this was required to be achieved while preserving the highest level of encapsulation, meaning that only our main method was allowed to be a static method.

I elected to split the program into two unique spaces; data entry and data review. I used a while loop in my main to intake all of the user data entry. I iterated through up to five times with each iteration creating a new food truck instance and placing it in a "wrapper" organized as an array. With this I was able to pass the array around within my "wrapper" class to perform calculations required in the data review section of the app.

The data review section of my program functioned off a while loop calling a menu method from the "AppController" and then utilized a switch to call different calculation methods from my "wrapper" class and then print them to the terminal.

If I were to attempt to achieve a greater level of encapsulation (given the static method restriction), I would have moved both of these loops into my "controller" class to clean up my main a little further.

## Lessons Learned
This program seemed daunting at first but once I got working it came together fairly easily. I think the thing I did best on this one was recognize when I had coded myself into a corner, and after realizing that taking the appropriate steps to get reset to continue forward. In this instance it was taking a break and coming back later.

The largest area of improvement is planning and laying out my program ahead of time. It is obvious in the complexity jump from week one that I will not be able to just program off the user story moving forward. The five P's will have to be used... Proper, Planning, Prevents, Poor, Performance!

## Technologies Used
Java, Markdown, Eclipse, Atom, Git, GitHub, Unix Shell
