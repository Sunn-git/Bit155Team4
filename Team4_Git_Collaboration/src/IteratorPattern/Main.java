package IteratorPattern;

public class Main {

	   
    public static void main(String argsp[])
    {
        Study_Group study_group = new Study_Group(5);
        study_group.AddStudnet(new Student("���","����","�Ѱ�"));
        study_group.AddStudnet(new Student("�ȼ���","����","���۸�"));
        study_group.AddStudnet(new Student("���ؼ�","����","���۸�"));
        study_group.AddStudnet(new Student("������","����","��ǥ�ϱ�"));
        study_group.AddStudnet(new Student("�躸��","����","���۸�"));
        
        StudyGroupIterator iterator = study_group.iterator();
        
        while(iterator.hasNext())
        {
            Student student = (Student)iterator.next();
            System.out.println("�̸�:" + student.getName());
            System.out.println("��å:" + student.getjob());
            System.out.println("���:" + student.gethobby());
            System.out.println("------------------");
        }
    }
}