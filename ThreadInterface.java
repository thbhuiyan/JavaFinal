class Hi implements Runnable{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println(i+": Hi");
            try {
                Thread.sleep(500);//means 0.5 seconds 
            } catch(Exception e) {
            }
        }
    }
}
class Hello implements Runnable{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println(i+": Hello");
            try {
                Thread.sleep(500);//means 0.5 seconds
            } catch(Exception e) {
            }
        }
    }
}
public class Main//ThreadDemo
{
	public static void main(String[] args) {
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		try {
                Thread.sleep(10);//means 0.5 seconds
            } catch(Exception e) {
            }
		t2.start();
		//start always calls run() method
		//both are reaching in the same time
		
/*		obj1.show();
		obj2.show();
*/
	}
}
