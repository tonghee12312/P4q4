public class Registration 
{
    
    
    private int regNo;
    private Owner owner;
    private Car car;
    private CarType carType;
    private static int nextRegNo = 1001;
    
    
    public Registration(Owner owner, Car car,CarType carType) 
{
    this.regNo = nextRegNo++;
    this.owner = owner;
    this.car = car;
    this.carType = carType;
}
    
    public static int getNextRegNo()
{
    	return nextRegNo;
    }

    public String toString()
{
    	return String.format("%-6d %-2s %-39s -%10s\n",regNo,owner.toString(),car.toString(),carType.toString());
    }
}
