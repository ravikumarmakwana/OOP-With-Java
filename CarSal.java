interface Car
{
	public void start();
	public void stop();
	public void playMusic();
	public void openWindow();
	public void control();
}
class Silver implements Car
{
	public void start()
	{
		System.out.println("Start Car using Push Button");
	}
	public void stop()
	{
		System.out.println("Stop Car");
	}
	public void playMusic()
	{
		System.out.println("Play Music using Remote");
	}
	public void openWindow()
	{
		System.out.println("Open Window");
	}
	public void control()
	{
		System.out.println("Control Car");
	}
}
interface Gold extends Car
{
	public void navigation();
} 	

class Custmize extends Silver implements Gold
{
	public void navigation()
	{
		System.out.println("Navigation System");
	}
}
class GoldImplements implements Gold
{
	public void start()
	{
		System.out.println("Start car Using Finger print");
	}
	public void stop()
	{
		System.out.println("Stop Car");
	}
	public void playMusic()
	{
		System.out.println("Play Music using Bluetooth");
	}
	public void openWindow()
	{
		System.out.println("Open Window");
	}
	public void control()
	{
		System.out.println("Control Car");
	}
	public void navigation()
	{
		System.out.println("Navigation System");
	}
}
class CarSal
{
	public static void main(String args[])
	{
		switch(Integer.parseInt(args[0]))
		{
			case 1: System.out.println("Silver Car");
					Silver s=new Silver();
					s.start();
					s.stop();
					s.playMusic();
					s.openWindow();
					s.control();
					break;
					
			case 2: System.out.println("Custmize Car");
					Custmize c=new Custmize();
					c.start();
					c.stop();
					c.openWindow();
					c.playMusic();
					c.control();
					c.navigation();
					break;
			
			case 3: System.out.println("Gold Car");
					GoldImplements g=new GoldImplements();
					g.start();
					g.stop();
					g.playMusic();
					g.openWindow();
					g.control();
					g.navigation();
					break;
			
			default:System.out.println("Wrong Choice");
					break;
		}
	}
}