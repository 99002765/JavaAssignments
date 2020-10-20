import java.util.*;
class Student
{
    int id;
    String name;
    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        
        ArrayList<Student> al = new ArrayList<Student>();
        Scanner scan=new Scanner(System.in);
        int id;
        String name;
    for(int i =0;i<3;i++)
    {
        id=scan.nextInt();
        name=scan.next();
        Student ob1 = new Student(id,name);
        al.add(ob1);
    }
        for(int j=0;j<3;j++)
            System.out.println("Name: "+al.get(j).name);
    }
}
