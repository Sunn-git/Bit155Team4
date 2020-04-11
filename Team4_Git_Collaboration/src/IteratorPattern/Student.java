package IteratorPattern;
// 학생을 만들어볼까요??
// 학생은 이름을 가지고 있고 직책을 가지고 있고 취미를 가지고 있다.
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