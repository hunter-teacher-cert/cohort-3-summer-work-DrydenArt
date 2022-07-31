# Introduction to Processing/p5.js
## Student Audience  
* Digital Media Arts, Foundation Level Art Course
* Grades 9 - 12, predominantly 9th and 10 graders
* Class Duration: 38 minutes :hankey:

## Pedagogical Techniques
* Unplugged activities / Silent, independent thinking / Small group / 
Diagramming / Deliverable  / Student demo / Student discovery by tinkering


## Objectives
* Students will predict how a given (unknown) code block works.
* Students will experiment with the setup() and draw() code blocks to determine and define what the information in the code blocks do.

## Prior Experience 
* Day 1 :  [Google Slide Presentation](Introduction_to_Processing) and [Slide Deck notes](SlideDeck_notes.md).
* Unplugged Activity: Students have worked in small groups to write directions on how to make a PBJ, then tested them on the teacher, and worked iteratively to improve their directions.  [[source]](http://static.zerorobotics.mit.edu/docs/team-activities/ProgrammingPeanutButterAndJelly.pdf)
* Debrief: Students have discussed the differences in the ways computers and people work, the importance of iterative work.

## Warm Up
* **Question:** In what ways was the PBJ activity like computer programming?

## Lesson Content
* Introduction of what computer programming is with diagramming connections on the board.
* Go over the terms: programming language, syntax and algorithm.
* See [vocabulary document](01_Vocabulary.md).
* Introduce p5.js and it's origins with a diagram of how it connects. See [drawing document](p5_origins.draw).
---
## Lesson Activity
* **Provide:** Write the setup() and draw() code blocks on the board (or show it on a slide).
```p5.js
function setup() {
  createCanvas(400, 400);
}

function draw() {
  background(220);
}
```
* **Silent Thinking:** Students take 2 - 5 minutes to look at and think about these blocks of code and consider what they think it will do.  Students can jot down their ideas if they choose to.
* **Teacher:** defines code block and demonstrates how to make comments in code.
 ---
* **Small Group:**
  * Students form the same teams from the PBJ activity
  * They are provided with a pieces of paper with the code printed on it with a blank space to the right.
  * STUDENT TASK: 
    * Discuss your ideas that you thought about with your teammates first.
  * DELIVERABLE:
    * Create a sketch of what your team thinks will happen with this code.
    * Write comments next to each line indicating what you think the code means/will do.
* **Quick Team Demo**
  * Students share and compare ideas.
---
**TEST IT OUT!**
  * Student groups go back into teams to test their theories.
  * Students open the p5.js interface on their own devices and work collaboratively to make changes and to experiment with the code. 
  * Deliverable:
    * Create a program that establishes a canvas  500 pixels in height and 700 pixels in width.
    * Comments in the code should reflect their understanding of which argument controls which.
    * **Challenge:** create a background that is purple (instead of the default gray). 