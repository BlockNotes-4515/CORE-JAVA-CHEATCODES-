//Making the values of the interface implements by the two classes.
interface Device
{
    //making the abstract Methods.
    void turnOn();
    void turnOff();
}
//Implemented by the class Fan
class Fan implements Device
{
    public void turnOn()
    {
        System.out.println("Fan is turned ON");
    }
    public void turnOff()
    {
        System.out.println("Fan is turned OFF");
    }
}
//Implemented by the class Light
class Light implements Device
{
    public void turnOn()
    {
        System.out.println("Light is turned ON");
    }
    public void turnOff()
    {
        System.out.println("Light is turned OFF");
    }
}
//calling the main class
public class TASK10 {
    public static void main(String[] args) {
        //Creating the object of the class Fan
        Device fan = new Fan();
        fan.turnOn();
        fan.turnOff();

        //Creating the object of the class Light
        Device light = new Light();
        light.turnOn();
        light.turnOff();
    }
}