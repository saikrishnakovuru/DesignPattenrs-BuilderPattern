# cs542-fall-22-assign3

## Name: saikrishna kovuru

## slack days used: 0

## slack days remaining: 3

---

---

Following are the commands and the instructions to run ANT on your project.

#### Note: build.xml is present in myCampusTour/src folder.

---

## Instruction to clean:

####Command: ant -buildfile myCampusTour/src/build.xml clean

Description: It cleans up all the .class files that were generated when you
compiled your code.

---

## Instruction to compile:

####Command: ant -buildfile myCampusTour/src/build.xml all

Description: Compiles your code and generates .class files inside the BUILD folder.

---

## Instruction to run:

####Command: ant -buildfile myCampusTour/src/build.xml run -Darg0=<campusTourError.txt> -Darg1=<UPDATE_VALUE>

## you can run it in the following manner:

ant -buildfile myCampusTour/src/build.xml run -Darg0=campusTourError.txt -Darg1=2

Note: Arguments accept the absolute path of the files.

---

## Description:

Initially in the driver class we will be having a condition to check no. of parameters were being passed, if the no. of cimmands passes are more than or less than 2 then the error will be thrown.

while a debug values is passed an integer and all the enum values are set we enter into the loop, else we will be thrown errors in the error file.

StudentOrientation-----------------------------------------
In the student orientation we set the enum values and create objects based on the enum preferences and we add those created objects to the arrayList one by one.

BuilderWorkshopImpl-----------------------------------------
we just call the construct method in this class which created based on the studentOrientation object and constuct the itinerary of the student calling all the 4 options one by one.

Total values of the itinary would be displayed on console along all the spent values by the student.

When the display method is called we iterate the arrayList and display all the values in teh tostring methos in all the created objects, which displays the values of the foot print and other object related values.

Also in the studentOrientation we have the hold of all values related to the student and will also be displayed in the console which is the sum of all values of a particular activity for example measure of calories.

Design-----------------------------------------
I used an abstract base class as I have those methods fixed for all the activitied and has to be calculated along a display method which displays the activities of the student.

Created classes for all the activities whihc are BuildingVisit, cafeteria visit, leacture visit and pickup gift

A common interface "ItineraryI" extends all the interfaces CarbonFootprintI, CostI, DurationI, EffortI as they are common for all the activities.

All the activities which are BuildingVisit, cafeteria visit, leacture visit and pickup gift implements "ItineraryI" to have the hold of the values of the activity.

I used only one common interface for all the utility classes.

In the above paragraphs wich class names mentioned I expained how the code works internally right from the driver class.

### Academic Honesty statement:

---

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating I will have to sign an
official form that I have cheated and that this form will be stored in
my official university record. I also understand that I will receive a
grade of 0 for the involved assignment for my first offense and that I
will receive a grade of F for the course for any additional
offense.""

Date: 17/Nov/2022
