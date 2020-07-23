
import java.util.Scanner;
public class TestCarRegistration 
{
    
        public static CarType[] carTypeArr =
{
    	new CarType("Toyota","Vios",1.5),
    	new CarType("Nissan","Tienna",2.0),
    	new CarType("Honda","City",1.8)
};
        
         public static void main(String []args)
{
        
  	Registration[] regArr = new Registration[2];	
  	Scanner scanner = new Scanner(System.in);
  	
  	for (int i = 0; i <  regArr.length/*todo:: loop until the number of registration */; ++i) 
{
  		System.out.println("\nRegistration number: " + Registration.getNextRegNo());
  		
  		System.out.print("Enter owner's name : ");
                String name = scanner.nextLine();
                System.out.print("Enter IC number : ");
                String icNo = scanner.nextLine();

    		Owner owner = new Owner(name,icNo);

  		System.out.print("\nEnter plate no : ");
    		String plateNo = scanner.next();
    		System.out.print("Enter color : ");
    		String color = scanner.next();
    		System.out.print("Enter year : ");
    		int year = scanner.nextInt();
                
  		System.out.println("\nCar Types: ");
  		//todo:: display all available carType
                for(int j = 0; j < carTypeArr.length; ++j){
    			System.out.println((j+1) + "." + carTypeArr[j].toString());
}
                
  		System.out.print("\nSelect car type [1.." + carTypeArr.length/* todo:: display the max number of car option */ + "]: ");
  		int selection = scanner.nextInt();
  		
                CarType carType = carTypeArr[selection-1];

  		Car car  = new Car(plateNo, color, year);

               regArr[i] = new Registration(owner, car, carType);
                
  		scanner.nextLine();
}

                displayListing(regArr);
}
  
 public static void displayListing(Registration[] regArr)
{
    	System.out.printf("\n\n%50s\n","Car Registration Listing");
    	System.out.printf("%-6s %-12s %-12s %-10s %-8s %-10s %-10s %-10s %5s\n","Reg No", "Name", "IC No.", "Plate No", "Color", "Year", "Make","Model","Capacity");
    	
    	for(int i = 0; i < regArr.length; ++i)
{
    		System.out.println(regArr[i].toString());
}
}
}
