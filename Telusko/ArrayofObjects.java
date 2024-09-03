
class Student{
    int roll;
    String name;
    int marks;
}

class ArrayofObjects{
    public static void main(String args[]){
        Student s1=new Student();
        s1.roll=1;
        s1.name="Ram";
        s1.marks=98;

        Student s2=new Student();
        s2.roll=2;
        s2.name="Sathish";
        s2.marks=90;

        Student s3=new Student();
        s3.roll=3;
        s3.name="Visal";
        s3.marks=85;


        Student students[]=new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        // System.out.print(students[0].name);
        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name +"\t: "+ students[i].marks);
        }


    }
}