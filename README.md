# AP CSA Assignment 3 - ArrayMethods  

Here are the instructions for Assignment 3: ArrayMethods. This should give you practice in working with arrays, but major topics like Polymorphism are not covered. Before you ask, yes... I skipped assignment 2. Now the assignments line up with the units.  
This assignment contains three regular questions and one extra credit question, for a max score of 105/100 points. In all questions, the array passsed as argument is non-empty.

### Windows users -- the makefile works for you now!

Use comands `make windows-test` and `make windows-clean` instead of the regular test and clean. **DO THIS FROM COMMAND PROMPT, NOT POWERSHELL**.

## Question 1: elementAdd

Write a public instance method called `elementAdd` that takes two parameters:  
- an `int` array, let's call it `arr`  
- an `int`, let's call it `x`  

This method should add `x` to every element of `arr`. Nothing should be returned.

## Question 2: min

Write a public instance method called `min` that takes one parameter:
- an `int` array, let's call it `arr`

This method should return the smallest element of the array, i.e. the minimum.

## Question 3: range

Write a public instance method called `range` that takes one parameter:
- an `int` array, let's call it `arr`

This method should return the smallest element of the array subtracted from largest element of the array, i.e. the range.

## Question 4: uniqueSum

Write a public instance method called `uniqueSum` that takes one parameter:
- an `int` array, let's call it `arr`. The elements of `arr` are non-decreasing, i.e. `arr[i+1] >= arr[i]`.

This method should return the sum of the unique elements within `arr`. Correctly returning this value will achieve 2 of the possible 5 points.  
To achieve the other 3 points, limit yourself to using only **one loop that lets you repeat code. (i.e. for, while loops)** That is, you may use only one for loop, or only one while loop. I will manually grade this aspect.



