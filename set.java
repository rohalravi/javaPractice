
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

import javafx.print.Collation;

public class set {

    public static void main(String[] args){
        //setUnionIntersectionDifference();
        //setAddRemove();
        //sortingSet();
        readUserValue();
        
     }

     //Set methods for add, remove, clear, addAll, removeAll, retainAll
     public static void setUnionIntersectionDifference(){
        Integer[] A = {1,2,3,4,5,6,7,8};
        Integer[] B = {5,6,7,8,9,10};

        Set<Integer> s1 = new HashSet<Integer>();
        s1.addAll(Arrays.asList(A));

        Set<Integer> s2 = new HashSet<Integer>();
        s2.addAll(Arrays.asList(B));

        Set<Integer> union = new HashSet<Integer>(s1);
        union.addAll(s2);
        System.out.println("Union:-"+union);

        Set<Integer> intersection = new HashSet<Integer>(s1);
        intersection.retainAll(s2);
        System.out.println("Intersection:-"+intersection);

        Set<Integer> difference = new HashSet<Integer>(s1);
        difference.removeAll(s2);
        System.out.println("Difference:-"+difference);
     }

     public static void setAddRemove(){
        Set<Integer> S1 = new HashSet<>();
        S1.add(1);
        S1.add(2);
        S1.add(4);

        System.out.println("Set is:- "+S1);
        int cnt=0;
        for(int v:S1){
            if((v%2)==0){
                cnt++;
            }
        }
        System.out.println("Even count is:- "+ cnt);
        
        S1.remove(2);
        System.out.println(S1);

        S1.clear();
        System.out.println(S1);
     }

     public static void sortingSet(){
        String[] arr1 = {"Mohan", "Sohan","Raju","Arti"};

        Set<String> s1 = new HashSet<>();
        s1.addAll(Arrays.asList(arr1));
        System.out.println("orignal set:- "+s1);

        // way1
        Set<String> sorted1 = new TreeSet<String>(s1);
        System.out.println("sorted set:- "+sorted1);

        //way2
        ArrayList<String> sorted2 = new ArrayList<>();
        sorted2.addAll(s1);
        Collections.sort(sorted2);
        System.out.println("Sorted list 2:-"+sorted2);
        
     }

     //example of taking input from user 
     public static void readUserValue(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the 1st set count:-");
        int fsize = scan.nextInt();
        Set<Integer> s1 = new HashSet<>();
        for(int i=0;i<fsize;i++){
            s1.add(scan.nextInt());
        }

        System.out.println("Enter the 2nd set count:-");
        int ssize = scan.nextInt();
        Set<Integer> s2 = new HashSet<>();
        for(int i=0;i<ssize;i++){
            s2.add(scan.nextInt());
        }

        Set<Integer> union = new HashSet<>(s1);
        System.out.print("Unioun of sets is:-");
        union.addAll(s2);
        System.out.println(union);

        Set<Integer> intersection = new HashSet<>(s1);
        System.out.print("intersection of sets is:-");
        intersection.retainAll(s2);
        System.out.println(intersection);

        Set<Integer> subtraction = new HashSet<>(s1);
        System.out.print("subtraction of sets is:-");
        subtraction.removeAll(s2);
        System.out.println(subtraction);


     }

     
    
}
