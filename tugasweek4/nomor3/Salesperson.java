package tugasweek4.nomor3;

public class Salesperson implements Comparable{
    //kamus data
    private String firstName, lastName;
    private int totalSales;

    //constructor
    public Salesperson(String first, String last, int sales){
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    public String toString(){
        return lastName + ", " + firstName + " : \t" + totalSales;
    }

    public boolean equals (Object other){
        return (lastName.equals(((Salesperson)other).getLastName()) &&  firstName.equals(((Salesperson)other).getFirstName()));
    }

    public int compareTo(Object other){
        Salesperson sp = (Salesperson) other;

        int result;

        if(totalSales != sp.getSales())
            result = sp.getSales() - totalSales;
        else{
            result = lastName.compareTo(sp.getLastName());

            if(result == 0)
                result = firstName.compareTo(sp.getFirstName());
        }

        return result;
    }

    //getter
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getSales(){
        return totalSales;
    }
}
