package IteratorPattern;

public class Study_Group implements Aggregate{
    
	//ĸ��ȭ �����ٷ�?
    private Student[] Students;
    private int num =0;
    
    //private �� ����� �迭�� 
    //public ���� ����� �޼ҵ带 ���� return �ϸ�, 
    //�� �迭�� ���۷����� �ܺο� �����Ǿ� �ܺο��� �迭 ���� ����!
    
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