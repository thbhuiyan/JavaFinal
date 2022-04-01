class Hi  implements Runnable{
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
		
		try {
                Thread.sleep(52);//means 0.5 seconds
            } catch(Exception e) {
            }
		
		obj1.start();
		try {
                Thread.sleep(10);//means 0.5 seconds
            } catch(Exception e) {
            }
		obj2.start();//start always calls run() method
		//both are reaching in the same time
		
/*		obj1.show();
		obj2.show();
*/
	}
}
