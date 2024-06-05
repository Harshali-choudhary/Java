package entities;

import java.time.LocalDate;

public class Task {

	private int Tid;
	private String Tname;
	private String description;
	private LocalDate Tdate;
	private Status status;
	private boolean active;
	private static int counter=1;
	
	public Task(int Tid) {
		this.Tid=Tid;
	}

	public Task(String tname, String description, LocalDate tdate, Status status, boolean active) {
		Tid=counter++;
		Tname = tname;
		this.description = description;
		Tdate = tdate;
		this.status = status;
		this.active = active;
	}

	public int getTid() {
		return Tid;
	}

	public void setTid(int tid) {
		Tid = tid;
	}

	public String getTname() {
		return Tname;
	}

	public void setTname(String tname) {
		Tname = tname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTdate() {
		return Tdate;
	}

	public void setTdate(LocalDate tdate) {
		Tdate = tdate;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Task.counter = counter;
	}

	@Override
	public String toString() {
		return "Task [Tid=" + Tid + ", Tname=" + Tname + ", description=" + description + ", Tdate=" + Tdate
				+ ", status=" + status + ", active=" + active + "]";
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Task)
		{
			Task t=(Task)o;
			return this.Tid==t.Tid;
		}
		return false;
		
	}
	
	
}
