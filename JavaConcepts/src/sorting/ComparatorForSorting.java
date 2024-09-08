package sorting;

import java.util.*;

public class ComparatorForSorting {
    static class Student {
        String name = "";
        int age = 0;

          Student(String name, int age) {
              this.name = name;
              this.age = age;
          }
    }

    static class SortByName implements Comparator<Student> {
        public int compare(Student student1, Student student2) {
            // Using compareTo() in case of String
            return student1.name.compareTo(student2.name);
        }
    }

    // class to implement Comparator class to use the compare() method for sorting
    static class SortByAge implements Comparator<Student>{
        public int compare(Student student1, Student student2) {
            // Using '-' operator in case of Integers
            return student1.age - student2.age;
        }
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Logesh", 24));
        list.add(new Student("Kamalesh", 20));
        list.add(new Student("Mani", 21));

        // Sorting the List(which is part of Java Collections)
        Collections.sort(list, new SortByAge());

        Iterator<Student> studentIterator = list.iterator();
        while(studentIterator.hasNext()) {
            Student student = studentIterator.next();
            System.out.println("Name : " + student.name + " Age : " + student.age);
        }
    }
}


