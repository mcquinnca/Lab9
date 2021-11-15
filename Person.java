/**
@author Colin McQuinn
@version 11-15-2021
*/
class Person {
String name;
String color;
int age;

/**
This method is the default constructor which sets the name, favorite color, and age.
@param aName is the person's name
@param aColor is the person's favorite color
@param aAge is the peron's age
*/
Person(String aName, String aColor, int aAge){
name = aName;
color = aColor;
age = aAge;
}

/**
This method is an accessor method which returns the person's name
@return Name the name of the person
*/
String getName(){
  return name;
}

/**
This method is an accessor method which returns the person's favorite color
@return color the person's favorite color
*/
String getColor(){
  return color;
}

/**
This method is an accessor method which returns the person's age
@return age the age of the person
*/
int getAge(){
  return age;
}
}