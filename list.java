import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class list {
    public static void main(String[] args){
        //arrayList();
        addStudent.createStudenList();
     }

     public static void arrayList(){
        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add("ravi");
        arr1.add("monu");
        arr1.add("Sonu");
        arr1.add("Pinku");
        arr1.add("Damru");

        System.out.println(arr1);
        System.out.println(arr1.size());
        //arr1.sort(name);
        
        //iterating in list with for loop
        for(String name:arr1){
            System.out.println(name);
        }
        // Iteration with ListIterator
        ListIterator<String> i = arr1.listIterator();
        while(i.hasNext()){
            System.out.println(i.nextIndex() +" "+i.next());
        }

        
        //get and set methods
        System.out.println("value at 2nd index:- "+arr1.get(2));
        arr1.set(2, "Pankaj");
        System.out.println("value at 2nd index:- "+arr1.get(2));

        //sorting of list
        Collections.sort(arr1);
        System.out.println("Sorted list is:- "+arr1);

        arr1.clear();
     }
}

class Student{
    int rollno;
    String name;
    int age;

    Student(int rollno,String name,int age){
        this.rollno= rollno;
        this.name=name;
        this.age=age;
    }
}
class addStudent{

    public static void createStudenList(){
        Student s1 = new Student(1, "Ravi", 35);
        Student s2 = new Student(2, "Mohit", 30);
        Student s3 = new Student(3, "Pathan", 25);

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        ListIterator itr = students.listIterator();
        while(itr.hasNext()){
            Student st = (Student)itr.next();
            System.out.println(st.age + st.name +st.age);
        }

        students.remove(s1);
        System.out.println(students);

    }
    

    
}

