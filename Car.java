public class Car
 {
    
    //data members
    private String plateNo;
    private String color;
    private int year;
  
    
    public Car(String plateNo, String color, int year) 
{
    this.plateNo = plateNo;
    this.color = color;
    this.year = year;
  
}

    public String toString() 
{
        return String.format("%-11s %-10s %5d" , plateNo, color , year);
    }
    
}