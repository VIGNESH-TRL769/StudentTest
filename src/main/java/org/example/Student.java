package org.example;

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
