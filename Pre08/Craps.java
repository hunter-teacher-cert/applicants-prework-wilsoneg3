https://github.com/hunter-teacher-cert/pre-acceptance-prework/blob/master/pre08.org

Final Project
References for this assignment:

Reference	Chapter(s)
Think Java	9
Chapter 9 of Think Java deals with String manipulations. You don’t explicitly need it for this section but you should review it prior to starting our program.

Create a directory named pre08 in your assignments folder.

You will write a program named Craps.java that will play a simplified game of craps.

There should be at least three static methods in addition to main. One named roll which accepts an integer parameter and returns a random number between 1 and that number, inclusive. There should also be one named shoot which accepts two parameters - a number of dice and the maximum value for those dice and returns the result of rolling those dice.

//Static Method 1- roll int () 


//Static Method 2- Shoot (2, 12)- return random number therein

// Static Method 3- 


The third method should be named round. It should accept no parameters and it should return something to indicate if the shooter of the round wins or loses.

A round is played as follows:

The shooter shoots (rolls) the dice.
// if sRoll= 2, 3, or 12{return "Oh Crap! You lose"}
If he rolls a 2,3, or 12,that’s Craps and he loses.
// else if sRoll = 7 or 11 {return "That's a natural.  You win!"}
If he rolls a 7 or 11, that’s a Natural and he wins.
Otherwise:
//else ( if sRoll = 4,5,6,8,9,10){ return "The point is now "pointValue" and Save}
//if pRoll=sRoll, return "YOU WIN"
// if pRoll=7, return "YOU LOSE"
// if pRoll=(2,3,4,5,6,8,9,10,11,12), return (Wow you're doing great! Keep going).

the value he rolled is now called the Point
the shooter continues to shoot (roll) until he either rolls the Point again at which point he wins or he rolls a 7 at which point he loses.
The main program should take a parameter from the command line, play that many rounds and as it plays indicate each time the shooter wins or loses. The program should also print out the status of the rounds they occur.

For more information, here’s a great documentary on the subject: link.

When done, add and push Craps.java to GitHub.