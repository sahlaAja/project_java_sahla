package nomor3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Manager extends Employee {
    //deklarasi variabel
    private String SecretaryName;

    //constructor
    public Manager(String n, double s, int d, int m, int y){
        super(n, s, d, m, y);
        SecretaryName = "";
    }

    @Override
    public void raiseSalary(double byPercent){
        //tambah bonus 0.5% untuk tiap tahun masa kerja
        GregorianCalendar todaysDate = new GregorianCalendar();
        int currentYear = todaysDate.get(Calendar.YEAR);
        double bonus = 0.5 * (currentYear - hireYear());

        super.raiseSalary(byPercent + bonus);
    }
    public String getSecretaryName() { 
        return SecretaryName;
    }
    
}
