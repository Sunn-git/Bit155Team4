package IteratorPattern;
// �л��� �������??
// �л��� �̸��� ������ �ְ� ��å�� ������ �ְ� ��̸� ������ �ִ�.
public class Student {
	   private String name="";
	    private String job="" ;
	    private String hobby ="";
	    
	    public Student(String name, String job, String hobby)
	    {
	        this.name=name;
	        this.job =job;
	        this.hobby=hobby;
	    }
	    public String getName()
	    {
	        return name;
	    }
	    public String getjob()
	    {
	        return job;
	    }
	    public String gethobby()
	    {
	        return hobby;
	    }
	    
	}