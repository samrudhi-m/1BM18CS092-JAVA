import java.util.*;
class student
{
public String usn;
public String name;
public int credits[]=new int[5];
public int marks[]=new int[5];
public int sum;
public float sgpa;

public void accept()
{
int i;
Scanner s= new Scanner(System.in);
System.out.println("Enter name:");
name= s.next();
System.out.println("Enter usn:");
usn= s.next();
System.out.println("Enter marks for 5 subjects");
for(i=0; i<5; i++)
{
marks[i]=s.nextInt();
}
System.out.println("Enter the credits:");
for(i=0; i<5; i++)
{
credits[i]=s.nextInt();
sum= sum+credits[i];
}
}

public void display()
{
int i;
System.out.println("Name:"+name);
System.out.println("USN:"+usn);
System.out.println("Marks:");
for(i=0; i<5;i++)
{
System.out.println(marks[i]);
}
System.out.println("Credits:");
for(i=0;i<5;i++)
{
System.out.println(credits[i]);
sum=sum+credits[i];
}
System.out.println("SGPA:" +sgpa);
}

public void calculate()
{
int i, gradepoints, total;
total=0;
for(i=0; i<5; i++)
{ 
gradepoints=0;
if(marks[i]>=90)
{
gradepoints=10*credits[i];
total=total+gradepoints;
}
else if(marks[i]>=75)
{
gradepoints=9*credits[i];
total=total+gradepoints;
}
else if(marks[i]>=60)
{
gradepoints=8*credits[i];
total=total+gradepoints;
}
else if(marks[i]>=50)
{
gradepoints=7*credits[i];
total=total+gradepoints;
}
else if(marks[i]>=45 )
{
gradepoints=6*credits[i];
total=total+gradepoints;
}
else if(marks[i]>=40)
{
gradepoints=5*credits[i];
total=total+gradepoints;
}
else
{
total=total+0;
}
}
sgpa=(float)total/sum;
}

public static void main(String args[])
{
student obj=new student();
obj.accept();
obj.calculate();
obj.display();
}
}

