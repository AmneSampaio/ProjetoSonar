# Projeto Sonar

This tiny project was an exercise for a Kotlin intermediate class.

There was used a file that contained measurements of a Sonar radar on a submarine. 
All data was organized on a extensive column. If you want to use with some file of yours,
please consider that all data is converted to Integer type.
Feel free to customize for your needs! :) 

Inside the main file, we have two functions:

  - withPreviousItem() = This reads each line and then make the logical comparations. 
  Following, there is a counter running along. 
  
  At the end it would display "Counter with previous item : $count" 
  
  - withForAndWhen() = This reads each line and then save it inside a mutableList of Integers. 
  Then is used a foreach and when for comparisons and to run the counter.
  
  At the end it would display "Counter with for and when : $count"
  
  
Aside those 2 functions, I wanted to be sure that both of them had the same value.
So, there is a final piece that do this comparison using equals. 
