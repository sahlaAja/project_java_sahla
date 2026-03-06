package tugasweek4.nomor1;

abstract public class StaffMember {
    protected String name;
    protected String address;
    protected String phone;

    //sets up a staff member with specified information
    public StaffMember(String eName, String eAddress, String ePhone){
        name = eName;
        address = eAddress;
        phone = ePhone;
    }

    public String toString(){
        String result = "Name : " + name + "\n";
        result += "Adress : " + address + "\n";
        result += "Phone : " + phone;

        return result;
    }

    public abstract double pay();
}
