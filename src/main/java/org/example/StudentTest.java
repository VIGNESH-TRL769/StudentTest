package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Logger;

class Student
{
    private final String name;
    private final int age;
    private final float gpa;
    Student(String name,int age,float gpa)
    {
        this.name=name;
        this.age=age;
        this.gpa=gpa;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public float getGpa()
    {
        return gpa;
    }
}
public class StudentTest
{
    public static final Logger Log= Logger.getLogger("InfoLogging");
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> arrayList = new ArrayList<>();
        Student student;
        Log.info("Enter the data count:");
        while (true)
        {
            try {
                Log.info("\n1.UserInput\n2.Display Status\nEnter the Choice:");
                int key = input.nextInt();
                if (key==1)
                {
                        Log.info("Enter The Name:");
                        String name = input.next();
                        Log.info("Enter The Age:");
                        int age = input.nextInt();
                        Log.info("Enter The Gpa:");
                        float gpa = input.nextFloat();
                        if (gpa < 10 && gpa > 0) {
                            student = new Student(name, age, gpa);
                            arrayList.add(student);
                        } else {
                            Log.info("Please Enter Valid Gpa 1 to 10");
                        }
                    }
                else if(key==2)
                {
                    break;
                }

            } catch (Exception e) {
                String excep = String.valueOf(e);
                Log.info(excep);
                input.nextLine();
            }
        }

        if(arrayList.isEmpty())
        {
            Log.info("No Data Found");
        }
        else
        {
            Log.info("Display The StudentTest:");
            for (Student iterator : arrayList) {
                String print = "Name:" + iterator.getName() + " Age:" + iterator.getAge() + " GPA:" + iterator.getGpa();
                Log.info(print);
            }
            Log.info("\n\nDisplay The Sort StudentTest:");
            Collections.sort(arrayList, (o1, o2) -> Double.compare(o2.getGpa(), o1.getGpa()));
            for (Student iterator : arrayList)
            {
                String print="Name:" + iterator.getName() + " Age:" + iterator.getAge() + " GPA:" + iterator.getGpa();
                Log.info(print);
            }
        }


    }
}