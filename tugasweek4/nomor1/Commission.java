package tugasweek4.nomor1;

public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate){
        super(eName, eAddress, ePhone, socSecNumber, rate);

        this.commissionRate = commissionRate;

        totalSales = 0;
    }

    //tambah total penjualan
    public void addSales(double sales){
        totalSales += sales;
    }

    //hitung gaji 
    public double pay(){
        double payment = super.pay() + (totalSales * commissionRate);

        totalSales = 0;

        return payment;
    }

    public String toString(){
        String result = super.toString();

        result += "\nTotal sales : " + totalSales;

        return result;
    }
}
