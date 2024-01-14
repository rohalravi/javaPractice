import java.util.ArrayList;
import java.util.Collections;

public class comparable {

    public static void main(String[] args){
        ArrayList<student> std = new ArrayList<>();
        std.add(new student(5,"Ravi", 20));
        std.add(new student(2,"Aman", 19));
        std.add(new student(7,"Pankaj", 30));

        Collections.sort(std);
        for(student s:std){
            System.out.println("roll: "+s.roll+" name:- "+s.name+" age:- "+s.age);
        }
        
    }
 
    
}

class student implements Comparable<student>{
    int age;
    String name;
    int roll;

    student(int roll,String name,int age){
        this.roll = roll;
        this.name= name;
        this.age = age;
    }

    public int compareTo(student st){
        if(age==st.age){
            return 0;
        }else if(age>st.age){
            return 1;
        }else{
            return -1;
        }
         
    }

}
