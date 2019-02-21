
import java.time.LocalDateTime;

public class TimesheetEntry {

	// Static variable that belongs with the TimesheetEntry class
	private static int NEXTID = 1;

	// Timesheet member variables
	private String projectName;
	private String task;
	private int id;
	private LocalDateTime startTime;
	private LocalDateTime endTime;

	// My constructor initializes the variables projectName, task, startTime, and ID
	public TimesheetEntry(String myProject, String myTask) {
		projectName = myProject;
		task = myTask;
		startTime = LocalDateTime.now();
		id = NEXTID;
		NEXTID++; // increment

	}

	// Here are my Methods.
	// This group of methods implements Getters for all five variables

	public String getProjectName() {
		return projectName;
	}

	public String getTask() {
		return task;
	}

	public int getId() {
		return id;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	// Here's my UpdateEndtime method. It sets endTime to LocalTime now if it hasn't already been set
	public void updateEndTime() {
		if (endTime == null) {
			endTime = LocalDateTime.now();
		}

	}

}
