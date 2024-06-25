package Basic;

import java.util.ArrayList;
import java.util.List;

public class HieghestMarks {
    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<>();

//        student-1
        Student student= new Student();
        SubjectMarks subjectMarks=new SubjectMarks();
        subjectMarks.setSubject("English");
        subjectMarks.setMarks(90);
        student.setName("Yash");
        student.setSubjectMarksList(subjectMarks);
        studentList.add(student);

//        Student-2
        Student student1= new Student();
        SubjectMarks subjectMarks1=new SubjectMarks();
        subjectMarks.setSubject("English");
        subjectMarks.setMarks(95);
        student.setName("Juhi");
        student.setSubjectMarksList(subjectMarks1);
        studentList.add(student1);


    }
}
