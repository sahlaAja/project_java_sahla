package tugasweek6.nomor2;

public class Student {
    //deklarasi variabel
    private String name;
    private int id;

    //constructor
    public Student(int i, String n){
        this.id = i;
        this.name = n;
    }

    //getter
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

    //setter
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
}
