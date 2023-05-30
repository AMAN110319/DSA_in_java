

class CountStudents
{
    public static void main(String s[])
    {
        Student st1 = new Student("Rajesh", 34, 'A');
        Student st2 = new Student("Mahesh", 78, 'B');
        System.out.println("Number of students after st1, st2 : " + Student.count);
        Student st3 = new Student("Suresh", 65, 'A');
        System.out.println("Number of students after st3: " + Student.count);
        Student st4 = createStudent();
        System.out.println("Number of students after st4: " + Student.count);
        System.out.println("Print count using objects : " + st1.count + " " + st2.count + " " + st3.count + " " + st4.count);
    }
    
    public static Student createStudent()
    {   
        String name ="akhilesh";
        return new Student(name, 59, 'C');
    }
}

class Student
{
    // Static variable
    static int count = 0; 

    // Member variables
    String name;
    int marks;
    char section;

    Student(String name, int marks, char section)
    {
        this.name = name;
        this.marks = marks;
        this.section = section;

        
        // Increment the static variable
        count++; 
    }
}