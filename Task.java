
public class Task implements Comparable<Task>, Priority{
	
	enum Status {
		NOT_STARTED,
		IN_PROCESS,
		COMPLETE;
	}//end enum
	
	public String name;
	public int priority;
	public Task.Status status;
	
	public Task() {
		name = "";
		priority = 0;
	}//end empty constructor
	
	public Task(String name, int priority) {
		this.name = name;
		this.priority = priority; 
	}//end preferred constructor

	public String getName() {
		return name;
	}//end getName

	public void setName(String name) {
		this.name = name;
	}//end setName

	public int getPriority() {
		return priority;
	}//end getPriority

	public void setPriority(int priority) {
		this.priority = priority;
	}//end setPriority 
	
	public Status getStatus() {
		return status;
	}//end getStatus
	
	public void setStatus(Status status) {
		this.status = status;
	}//end setSatus
	
	@Override
	public int compareTo(Task o) {
		//Compare priorities
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
		return "Task [Name: " + name + ", Priority: " + priority + ", Status: " + status +"]";
	}//end toString

	
	
}//end class