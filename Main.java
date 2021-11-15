/**
@author Colin McQuinn
@version 11-15-2021
*/
import java.io.*;
import java.util.ArrayList;

class Main {

  static ArrayList<Person> peopleList;

  public static void main(String[] args) {

    peopleList = new ArrayList<Person>();
    String name = "";
    String color = "";
    String age = "";

    peopleList.add(new Person("Colin", "Green", 21));
    peopleList.add(new Person("A", "Pink", 87));
    peopleList.add(new Person("B", "Yellow", 13));
    peopleList.add(new Person("C", "Black", 55));
    peopleList.add(new Person("D", "Green", 4));

    try {
      FileWriter writer = new FileWriter("data.txt", true);
      BufferedWriter bufferW = new BufferedWriter(writer);

      for (int i = 0; i < peopleList.size() - 1; i++) {
        bufferW.write(peopleList.get(i).getName());
        bufferW.newLine();
        bufferW.write(Integer.toString(peopleList.get(i).getAge()));
        bufferW.newLine();
        bufferW.write(peopleList.get(i).getColor());
        bufferW.newLine();

      }
      bufferW.flush();
      bufferW.close();
      //System.out.println("Write successful");
    } catch (IOException e) {
      System.out.println("An error occurred: " + e);

    }

    try {
      FileReader file = new FileReader("data.txt");
      BufferedReader reader = new BufferedReader(file);
    while(reader.ready()) {
      name = reader.readLine();
      age = reader.readLine();
      color = reader.readLine();
      System.out.printf("%-10s %-10s %-10s %n", name, age, color);

    }
    } catch (IOException e) {
      System.out.println("An error occurred: " + e);
    }
  }
}