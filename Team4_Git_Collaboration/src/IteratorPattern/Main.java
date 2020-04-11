package IteratorPattern;

public class Main {

	   
    public static void main(String argsp[])
    {
        Study_Group study_group = new Study_Group(5);
        study_group.AddStudnet(new Student("김썬","조장","총괄"));
        study_group.AddStudnet(new Student("안성범","조원","구글링"));
        study_group.AddStudnet(new Student("한준수","조원","구글링"));
        study_group.AddStudnet(new Student("엄지희","막내","발표하기"));
        study_group.AddStudnet(new Student("김보성","조원","구글링"));
        
        StudyGroupIterator iterator = study_group.iterator();
        
        while(iterator.hasNext())
        {
            Student student = (Student)iterator.next();
            System.out.println("이름:" + student.getName());
            System.out.println("직책:" + student.getjob());
            System.out.println("취미:" + student.gethobby());
            System.out.println("------------------");
        }
    }
}