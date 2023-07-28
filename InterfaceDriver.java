
public class InterfaceDriver {

	public static void main(String[] args) {
		
	Task t1 = new Task("Cook dinner", 5);
	t1.setStatus(Task.Status.NOT_STARTED);
	
	System.out.println(t1.toString());
	
	Task t2 = new Task("Fold clothes", 1);
	t2.setStatus(Task.Status.IN_PROCESS);
	
	System.out.println(t2.toString());
	System.out.println(t1.compareTo(t2));
	
	System.out.println();
	
	Process p1 = new Process("RV1234", 1);
	Process p2 = new Process("RV5678", 10);
	
	System.out.println(p1.toString());
	System.out.println(p2.toString());
	
	System.out.println(p1.compareTo(p2));

	
	}//end main
	
}//end class
