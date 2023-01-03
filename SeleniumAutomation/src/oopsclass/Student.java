package oopsclass;

public class Student {
int sid;
String sname;
char grade;

void display()
{
	System.out.println(sid+" "+sname+" "+grade);
	
}

void setdata(int id,String name,char g)
{
	sid=id;
	sname=name;
	grade=g;
}

Student(int id,String name,char g)
{
	sid=id;
	sname=name;
	grade=g;
}
/*
public static void main(String[] args) {
	Student stu1=new Student();
	stu1.sid=001;
	stu1.sname="kanady";
	stu1.grade='A';
	
	stu1.display();
	
}
*/
}
