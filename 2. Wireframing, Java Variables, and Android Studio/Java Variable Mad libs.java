/*
Description:
1.
Let’s create a comment that describes the program!

The  comments are already in place for you. In between them, write a description that looks something like:

This program generates a mad libbed story.
Author: Laura
Date: 2/19/2049
2.
Take a look at the variable named story. It is set equal to a string that will contain our story.

All of these variables will need to be declared and initialized before the code will compile without errors.

3.
The story that we have provided is going to need a protagonist.

Create a String called name1 that stores the name of the main character.

4.
You will need to provide three adjectives.

Create three Strings, adjective1, adjective2, and adjective3 and store different adjectives in them.

5.
You’ll also need to provide one verb.

Create a String called verb1 and store a verb in it.

6.
The story also needs six nouns.

Create six Strings, noun1, noun2, noun3, noun4, noun5, and noun6 and initialize them to your favorite nouns.

7.
Our story needs another character. Declare a String variable called name2 and initialize it to the value of another name.

8.
Our story requires one number. Declare an int variable called number and set it to any whole number you like.

9.
There’s one more variable! Declare a String called place1 and store any place in it. This could be a city, or a town, or a country, or a planet!

10.
Alright! It seems like we have all the variables we need. Save the file to see it run. Does it compile without errors?

11.
Time to read the story! Use System.out.println() to print the story variable.

12.
Put some whitespace in your code so that the story variable is hidden, and show your friends the code. Have someone else fill in the variables you have declared with the nouns, adjectives, verbs, and names that they like.

Then, run the code to see a new story get told!
*/

public class MadLibs {
  /*
  This program generates a mad libbed story.
Author: AnOnYmOus001100
Date: 18/08/2020

  */
  	public static void main(String[] args){
      
      //potagonist for the story
      String name1 = "Hero";
      
      //three adjectives
      String adjective1 = "blue", adjective2 = "nice", adjective3 = "small";
      
      //verb
      String verb1 = "sing";
     
      //nouns
      String noun1 = "cat", noun2 = "food", noun3 = "bird", noun4 = "human", noun5 = "river", noun6 = "dog";
     
      //another character
      String name2 = "Zero";
      
      //number
      int number = 4004;
      
      //place
      String place1 = "New York";

      
      
      
      
      
      
      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.println(story);
    }       
}

