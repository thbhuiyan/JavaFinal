class A{
    public void show(){
        System.out.println("I am here\n");
    }
}
public class Main
{
	public static void main(String[] args) {
		A obj = new A(){// Anonymous Class does not have a name
		        public void show(){
        System.out.println("But, I am the best here\n");
    }
		};
		obj.show();
	}
}
