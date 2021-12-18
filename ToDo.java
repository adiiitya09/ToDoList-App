import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToDo {

	private ArrayList<String> toDoList = new ArrayList<String>();
	private Map<String, Boolean> tasks = new HashMap<String, Boolean>();
    private int positionToModifyDelete = 0;

    public void addToDoTask(String task, boolean isCompleted) {
    	if(task != "") {
    		toDoList.add(task);
    		tasks.put(task, isCompleted);
    		System.out.println(task + " Added Successfully");    		
    	} else {
    		System.out.println("Please Enter valid Task");
    	}
    }

    // This Method return entire list of tasks 
    public ArrayList<String> getToDoList() {
    	if(toDoList.size() != 0) {
    		return toDoList;    		
    	} else {
    		return null;
    	}
    }
    
    // This method is for task remaining to be completed    
    public List<String> getRemainingTaskstList() {
    	List<String> remainingTasks = new ArrayList<String>();
        for (int i = 0; i < tasks.size(); i++) {
			if(!tasks.get(toDoList.get(i))) {
				remainingTasks.add(toDoList.get(i));
			}
		}
        return remainingTasks;
    }

    // This method return number of tasks  entered
    public int numberOfTasks() {
        return toDoList.size();
    }
    
    // This method return number of tasks remained   
    public int numberOfTasksRemaining() {
        int count = 0;
        for (int i = 0; i < tasks.size(); i++) {
            if (!tasks.get(toDoList.get(i))) {
                count++;
            }
        }
        return count;
    }

    public void printToDoList() {
        System.out.println("You have " + toDoList.size() + " task in list.");
        System.out.println("id \t Task \t\t\t\t\t\t\t      status");
        System.out.println("-----------------------------------------------------------------------------");
        for (int i = 0; i < toDoList.size(); i++) {
            String comp = tasks.get(toDoList.get(i)) ? "Completed" : "Not Completed";
            System.out.printf("%-6d %-60S %-6s%n", (i+1), toDoList.get(i), comp);
        }
    }
       // used to modify the task name
    public boolean modifyToDoListTask(int position, String newTask, boolean isCompleted) {
        if (returnIsValidTask(position) && newTask.length() != 0) {
            positionToModifyDelete = position;
            modifyToDoListTask(newTask, isCompleted);
            return true;
        } else {
            System.out.println("Please Enter correct task number or New Task Name");
            return false;
        }
    }

    private void modifyToDoListTask(String newTask, boolean isCompleted) {
        String lastKey = toDoList.get(positionToModifyDelete - 1);
        tasks.remove(lastKey);
        toDoList.set(positionToModifyDelete - 1, newTask);
        tasks.put(toDoList.get(positionToModifyDelete - 1), isCompleted);
        System.out.println("Task updated Successfully!!!");
        positionToModifyDelete = 0;
    }
           // used to delete a specific task
    public boolean deleteToDoListTask(int position) {
        if (returnIsValidTask(position)) {
            positionToModifyDelete = position;
            String deleted = deleteToDoListTask();
            return deleted.length() != 0 ? true : false;
        } else {
            System.out.println("Please Enter correct task number");
            return false;
        }
    }

    private String deleteToDoListTask() {
    	String del = toDoList.get(positionToModifyDelete - 1);
        tasks.remove(toDoList.get(positionToModifyDelete - 1));
        toDoList.remove(positionToModifyDelete - 1);
        System.out.println("Task deleted Successfully!!!");
        positionToModifyDelete = 0;
        return del;
    }

    private boolean returnIsValidTask(int position) {
        if ((position - 1) < toDoList.size()) {
            return true;
        }
        return false;
    }

}
