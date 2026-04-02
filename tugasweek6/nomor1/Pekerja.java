package tugasweek6.nomor1;

public class Pekerja {
    //deklarasi variabel
    private String name;
    private int salary;

    //constructor
    public Pekerja(String n, int s) {
        name = n;
        salary = s;
    }

    //getter
    public String getname(){
        return name;
    }
    public int getSalary(){
        return salary;
    }

    //setter
    public void setName(String n){
        name = n;
    }
    public void setSalary(int s){
        salary = s;
    }
}
