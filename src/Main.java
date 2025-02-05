import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Student student2=new Student("Sham", Arrays.asList(new Subject("English",85),new Subject("Math",85)));
        Student student1=new Student("Ram", Arrays.asList(new Subject("English",77),new Subject("Math",100)));
        Student student3=new Student("John", Arrays.asList(new Subject("English",46),new Subject("Math",95)));
        Student student4=new Student("Don", Arrays.asList(new Subject("English",83),new Subject("Math",65)));

        List<Student> studentList=new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        Optional<Student> max = studentList.stream().filter(stud -> stud.getSubjectList().stream().anyMatch(sbj -> sbj.getSubjectName().equals("Math")))
                .max(Comparator.comparingInt(s -> s.subjectList.stream()
                        .filter(subj -> subj.getSubjectName().equals("Math")).findFirst().get().getSubjectMarks()));

        max.ifPresentOrElse(student -> System.out.println(student.getName()),()-> System.out.println("Student not present"));

    }
}