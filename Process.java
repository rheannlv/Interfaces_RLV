
public class Process implements Comparable<Process>, Priority{
	
	private String processID;
	private int priority;
	
	public Process() {
		this.processID= "";
		this.priority=0;
		
	}//end empty constructor
	
	public Process(String processID, int priority) {
		this.processID = processID;
		this.priority = priority;
		
	}//end preferred constructor

	public String getProcessID() {
		return processID;
	}//end getProcess

	public void setProcessID(String processID) {
		this.processID = processID;
	}//end setProcess

	public int getPriority() {
		return priority;
	}//end getPriority

	public void setPriority(int priority) {
		this.priority = priority;
	}//end setPriority
	
	@Override
	public int compareTo(Process o) {
	int result = 0;
		
		if (this.priority > o.getPriority()) {
			result = 1;
		}
		
		else if (this.priority < o.getPriority()) {
			result = -1;
		} else {
			return 0;
		}
		return result;
		
	}//end compareTo
	

	@Override
	public String toString() {
		return "Process [Process ID: " + processID + ", Priority: " + priority + "]";
	}//end toString


	
}//end class
