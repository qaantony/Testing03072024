package org.example;

import com.jayway.jsonpath.JsonPath;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class UnitTest {
    @Test
    public void test1() throws IOException {
        String dataPath = "C:\\Users\\antonyg\\Automation\\PojectSAM_2203\\src\\testdata.json";

        File file = new File(dataPath);
        String jsonData = new String(Files.readAllBytes(file.toPath()));

        String username = JsonPath.read(jsonData, "$.username");
        String password = JsonPath.read(jsonData, "$.password");

        System.out.println(username);
        System.out.println(password);
    }

    @Test
    public void test2() {
        ArrayList<String> list = new ArrayList<String>();//Creating arraylist
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        //Printing the arraylist object
        System.out.println(list);

        list.get(0);
        list.get(1);
        list.get(2);
        list.get(3);


        Iterator itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }

    @Test
    public void test3() {

        ArrayList<String> fruits = new ArrayList<String>();//Creating arraylist
        fruits.add("Mango");//Adding object in arraylist
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        //Printing the arraylist object
        System.out.println(fruits);

        fruits.get(0);
        fruits.get(1);
        fruits.get(2);
        fruits.get(3);

        Iterator fruit = fruits.iterator();

        while (fruit.hasNext()) {
            System.out.println(fruit.next());
        }

        for (String fruite : fruits) {
            System.out.println(fruite);
        }
    }

    @Test
    public void test4() {

        List<String> fruits = new ArrayList<String>();//Creating arraylist
        fruits.add("Mango");//Adding object in arraylist
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");

        Collections.sort(fruits);

        for (String fruite : fruits) {
            System.out.println(fruite);
        }
    }


    @Test
    public void test5() {

        List<Integer> numbers = new ArrayList<Integer>();//Creating arraylist
        numbers.add(20);
        numbers.add(19);
        numbers.add(18);
        numbers.add(17);

        Collections.sort(numbers);

        for (int number : numbers) {
            System.out.println(number);
        }

    }

    // important
    @Test
    public void test6() {
        ArrayList<String> fruits = new ArrayList<String>();//Creating arraylist
        fruits.add("Mango");//Adding object in arraylist
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");

        ListIterator<String> listIterator = fruits.listIterator(fruits.size());  //#### impotant
        listIterator.hasPrevious();

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

    }


    @Test
    public void test7() {
        ArrayList<String> fruits = new ArrayList<String>();//Creating arraylist
        fruits.add("Mango");//Adding object in arraylist
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");

        for (int i = 0; i <= fruits.size() - 1; i++) {
            System.out.println(fruits.get(i));
        }

    }

    @Test
    public void test8() {
        ArrayList<String> fruits = new ArrayList<String>();//Creating arraylist
        fruits.add("Mango");//Adding object in arraylist
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");

        for (int i = fruits.size() - 1; i >= 0; i--) {
            System.out.println(fruits.get(i));
        }
    }

    @Test
    public void test9() {
        ArrayList<String> fruits = new ArrayList<String>();//Creating arraylist
        fruits.add("Mango");//Adding object in arraylist
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");

        fruits.forEach(a -> System.out.println(a));
    }

    @Test
    public void test10() {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(1001, "Antony", "Anto1001"));
        students.add(new Student(1002, "George", "Geor1002"));
        students.add(new Student(1003, "Anil", "Anil1003"));

       Iterator studentIterator=students.iterator();
        while(studentIterator.hasNext()){
            Student std=(Student)studentIterator.next();
            System.out.println(std.rollNo+" "+std.studentID+" "+std.studentName);
        }



    }

    @Test
    public void add(){
        int a=10;
        int b=20;
        int c=a+b;
        Assert.assertEquals(c, 30);
        System.out.println("Antony");
    }

}

class Student {
    int rollNo;
    String studentName;
    String studentID;

    Student(int rollNo, String studentName, String studentID) {
        this.rollNo = rollNo;
        this.studentName = studentName;
        this.studentID = studentID;
    }


}



