package curriculum.b;

public class Main {

	public static void main(String[] args) {
		//Q4 
				Greeting myGreeting = new Greeting();
		    	myGreeting.sayHello();
		    	
		 //Q5
		    	Animal lion = new Animal();
		    	
		    	lion.setName("ライオン");
		        lion.setLength(2.1);
		        lion.setSpeed(80);
		    	
		        System.out.println("名前：" + lion.getName());
		        System.out.println("体長：" + lion.getLength()+ "m");
		        System.out.println("速度：" + lion.getSpeed()+"km/h");
		        
	}

}
