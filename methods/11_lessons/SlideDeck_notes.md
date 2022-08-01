## Slide 1
Title Slide: Introduction to P5.js

## Slide 2
How to Make a PBJ
Day 1
Source: http://static.zerorobotics.mit.edu/docs/team-activities/ProgrammingPeanutButterAndJelly.pdf
Building prior knowledge:
Objective: Students will practice writing directions to complete a task
Objective: Students will use iterative practices to develop language that a computer will understand
Objective: Students will experience the difference between the way a computer thinks vs. the way a human thinks

Warm Up: How many of you like PBJ (may need to define this)?
10 minutes:  In small groups, students will collaboratively write a set of directions on how to make a PBJ (Protocol: create team name, establish roles, complete task)
15 minutes:  Test the program - students will give directions verbally and the teacher will follow the directions.  
5 minutes: Student teams will re-write the directions for clarity. 
5 minutes:  Final test. 
Summary:  When we write directions for computers, there are things that we can do that computers can’t do.  We must consider these differences when developing directions (or computer programs).  When a set of instructions is unclear to a computer, we rework the instructions to fix the problem (bug).

## Slide 3 and 4

How do we tell the computer to do something?
Day 2

Warm Up
Question: In what ways was the PBJ activity like computer programming?

Lesson Content
* Introduction of what computer programming is with diagramming connections on the board.
* Go over the terms: programming language, syntax and algorithm.
* See [vocabulary document](01_Vocabulary.md).
* Introduce p5.js and it's origins with a diagram of how it connects. See [drawing document](p5_origins.draw).

## Slide 5
* **Silent Thinking:** 
Students take 2 - 5 minutes to look at and think about these blocks of code and consider what they think it will do.  Students can jot down their ideas if they choose to.

## Slide 6
How to add comments
* **Teacher:** defines code block and demonstrates how to make comments in code.
* 
## Slide 7
Talk it out
Draw it out
//Write it out
Names on the deliverable, please

## Slide 8
Demo & Discussion

## Slide 9
TEST IT OUT!
In your teams, open the p5.js interface on your own device.
Work collaboratively to make changes and experiment with the code. 

  Deliverable:
Create a program that makes a canvas  500 pixels high, 700 pixels wide.
Comments in the code should reflect your understanding of which argument controls which.
Challenge: create a background that is purple.

## Slide 10
Warm Up
* **Question (rhetorical):** What were the discoveries we learned yesterday?


## Slide 11
Unlike the coordinate grid from 8th grade, where zero is placed in the middle, the coordinate system for pixels in a computer window is reversed along the y-axis. (0,0) can be found at the top left with the positive direction to the right horizontally and down vertically. Source: https://p5js.org/learn/coordinate-system-and-shapes.html

Behind the screen on a computer is a grid, like a electronic piece of graph paper.  

Each pixel of the screen is a coordinate - two numbers, an "x" (horizontal) and a "y" (vertical) - that determines the location of a point in space.

## Slide 12
Source: https://p5js.org/learn/coordinate-system-and-shapes.html

Behind the screen on a computer is a grid, like a electronic piece of graph paper.  

Each pixel of the screen is a coordinate - two numbers, an "x" (horizontal) and a "y" (vertical) - that determines the location of a point in space.

## Slide 13
To draw a rectangle on the computer screen, we need to create a command that gives instruction to the computer.

This is called a function.  We’ve already seen the createCanvas() and background() functions.

It includes:
Name (parameters, parameters);

To draw a rectangle in p5.js, you would write:
rect(x coord, y coord, width, height);

## Slide 14
The rectangle drawn on the grid it written in in the function like this: 

rect(0, 0, 40, 30);

The x and y coordinates are located at the top left corner of the rectangle.

## Slide 15
Unplugged Pair Programming

**Provide:**  Blank grids double-sided, manilla folders for hiding their designs from their partner. 
Students will need a pencil. 

**Given:** each square is 10 pixels. The total size of the canvas (grid) is 100 x 100. 

1. Find a partner.  
2. Each person should have two grids: one to use for “design and describe”, and one to use for “listen and draw”. 
3. Independently, draw a rectangle on the grid.
4. Write the function for rect(); using the syntax to add the parameters. Don’t let your partner see your code.
5. Decide order.
6. Take turns driving and navigating.

## Slide 16
All notes are on screen.



