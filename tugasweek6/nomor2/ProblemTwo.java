package tugasweek6.nomor2;

//import library
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProblemTwo {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student(101, "Joe"),
            new Student(103, "Zulkifli"),
            new Student(102, "Riza"),
            new Student(104, "Alice"),
            new Student(105, "Joshua")
        );

        List<Student> ans = students.stream() //membuka stream
        .sorted((s1, s2)-> { //proses sorting
            //logika : jika nama sama, bandingkan ID
            if (s1.getName().equalsIgnoreCase(s2.getName())) {
                return Integer.compare(s1.getId(), s2.getId());
            } 
            //jika nama berbeda, bandingkan namanya
            else{
                return s1.getName().compareTo(s2.getName());
            }
        })
        .collect(Collectors.toList()); //mengumpulkan hasil

        for(Student student:ans){
            System.out.println("Student : { id = " + student.getId() + ", name = " + student.getName() + "}");
        } 
    }
}
