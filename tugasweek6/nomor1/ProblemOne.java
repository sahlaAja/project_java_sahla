package tugasweek6.nomor1;

//import library
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import id.ac.polban.employee.model.Employee;


public class ProblemOne {
    public static void main(String[] args) {
        ArrayList<Pekerja> list = new ArrayList<>();

        list.add(new Pekerja("John", 50000));
        list.add(new Pekerja("Rob", 70000));
        list.add(new Pekerja("Bob", 40000));
        list.add(new Pekerja("Alice", 10000));

        //proses filtering/sorting menggunakan Stream API
        List<Pekerja> sortedEmp = list.stream() //ubah list ke Stream
        //sorting pekerja berdasarkan nama
        .sorted((e1, e2) -> e1.getname().compareTo(e2.getname()))
        //mengumpulkan hasil akhir
        .collect(Collectors.toList());

        for(Pekerja p : sortedEmp){
            System.out.println("{Name = " + p.getname() + ", Salary = " + p.getSalary() + "}");
        }

    }
}
