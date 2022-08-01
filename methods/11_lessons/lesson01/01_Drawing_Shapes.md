# Making Shapes with p5.js
## Student Audience  
* Digital Media Arts, Foundation Level Art Course
* Grades 9 - 12, predominantly 9th and 10 graders
* Class Duration: 38 minutes :hankey:

## Pedagogical Techniques
* Student demo / Unplugged pair programming / Small group  / Deliverable  /  Student discovery by tinkering / Personal design with code


## Objectives
* Through short demos, students will share their discoveries about the setup() with createCanvas() functions, and the draw() with the background() functions.
* Students will practice using a coordinate system.
* Students will create a design by writing code for rectangles and ellipses.

## Warm Up
* **Question (rhetorical):** What were the discoveries we learned yesterday?

## Yesterday Debrief 
* Day 3 :  [Google Slide Presentation](Introduction_to_Processing) and [Slide Deck notes](SlideDeck_notes.md).
* Student Refresh: Students will have 2 minutes in their group to refresh their memories from yesterday about the setup() and draw() functions.
* Student teams will volunteer someone from their team to share the findings.
  * setup(): a team will explain what they discovered, and how to manipulate the code.  They will explain how to know which number is width and which is height.
  * draw(): a different team who took the challenge will present how to make the background purple.  If no one got the challenge, or only discovered how to make black, gray and white we will wait on the RGB discussion. 




## Lesson Content
* Introduce the concept of the canvas as a coordinate system that allows us to place things we code on a specific place on the computer screen.
* Go over the terms: coordinate system, x and y coordinates, function and parameters.
* See [vocabulary document](Vocabulary.md).
* Introduce coordinate system in p5.js. 
---
## Lesson Activity
**Unplugged Pair Programming**

**Provide:**  
* Blank grids double-sided [[see document]](Unplugged_Pair_Programming.md)
* Manilla folders for hiding their designs from their partner.
* Pencil/eraser.
* Given: each square is 10 pixels. The total size of the canvas (grid) is 100 x 100. 

**Student Task:**
1. Find a partner.
2. Each person should have two grids: one to use for “design and describe”, and one to use for “listen and draw”.
3. Independently, draw a rectangle on the grid. Use the manilla folder to keep your design secret.
4. Write the function for rect(); using the syntax to add the parameters. Don’t let your partner see your code.
5. Decide order.
6. Take turns driving and navigating. 


## **Time to Code:** 
Write the setup() and draw() code blocks on the board (or show it on a slide). Note the comments.
```p5.js
function setup() {
  createCanvas(400, 400);
}

function draw() { //add rect() and ellipse
  background(220); //make comments to track discoveries
}
```

* **Teacher:** explains that the name of the function for making a circle or oval is called **ellipse**.  Students should work together to work use this in their code. 
 ---
* **Small Group:**
  * Students form into the same teams.
  
  * STUDENT TASK: 
    * Add rect() function into the draw() function.
    * Add ellipse() as well.
* **DELIVERABLE:**
    * Create a design using rect() and ellipse().
    * It can be a picture (like a self-portrait, a robot or a vehicle) or it can be abstract (like a design or pattern).
    * Make comments in the code to keep track of what's happening.  Also make comments to track discoveries.
    * Be prepared to share these discoveries tomorrow. 

