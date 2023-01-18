/**
 * 
 */
package assigment_01;

/**
 * @author: Mekonnen
 * @date  : Jan 17, 2023
 */
public class Task {
	private int taskId;
	private String taskName;

	/**
	 * @param taskId
	 * @param taskName
	 */
	public Task(int taskId, String taskName) {
		this.taskId = taskId;
		this.taskName = taskName;
	}

	/**
	 * @return the taskId
	 */
	public int getTaskId() {
		return taskId;
	}

	/**
	 * @param taskId the taskId to set
	 */
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	/**
	 * @return the taskName
	 */
	public String getTaskName() {
		return taskName;
	}

	/**
	 * @param taskName the taskName to set
	 */
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	

}
