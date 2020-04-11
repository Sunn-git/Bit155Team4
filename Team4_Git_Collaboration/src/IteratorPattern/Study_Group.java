package IteratorPattern;

public class Study_Group implements Aggregate{
    
	//캡슐화 시켜줄래?
    private Student[] Students;
    private int num =0;
    
    //private 로 선언된 배열을 
    //public 으로 선언된 메소드를 통해 return 하면, 
    //그 배열의 레퍼런스가 외부에 공개되어 외부에서 배열 수정 가능!
    
    public Study_Group(int num)
    {
        this.Students = new Student[num];
    }
    public Student getStudent(int index)
    {
        return Students[index];
    }
    public void AddStudnet(Student student)
    {
        this.Students[num] = student;
        num++;
    }
    public int getLength()
    {
        return num;
    }
    
    public StudyGroupIterator iterator()
    {
        return new StudyGroupIterator(this);
    }
}