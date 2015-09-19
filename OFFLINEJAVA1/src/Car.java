/**
 * Created by HP on 9/18/2015.
 */
public class Car {
    private String name;
    private String  manufacturer;
    private Driver driver;
    private int  fuelCapacity;

    public Car(String name, String manufacturer, Driver driver ,int fuelCapacity)
    {
        this.name=name;
        this.manufacturer=manufacturer;
        this.driver=driver;
        this.fuelCapacity=fuelCapacity;

    }


   public Car(String name, String manufacturer)
   {
       this.name=name;
       this.manufacturer=manufacturer;
   }


    public void setfuelCapacity (int fuelCapacity)
    {
        this.fuelCapacity=fuelCapacity;

    }



    public void setDriver (Driver driver)
    {
        this.driver=driver;
    }


    public String getName ()
    {
        return name;
    }


    public String getManufacturer ()
    {
        return manufacturer;

    }



    public Driver getDriver()
    {
        return driver;
    }



     public int getfuelCapacity()
     {
         return fuelCapacity;
     }



    public void drive (int miles)
    {
        if (fuelCapacity>=miles)
            fuelCapacity-=miles;

    }






    public void refuel(int miles)
    {
        fuelCapacity+=miles;
    }



    public void print()
    {
        System.out.printf(name);
        System.out.println(" Manufacturer: " + manufacturer);
        driver.print();
        System.out.println("Fuelcapacity "+ fuelCapacity);

    }





}
