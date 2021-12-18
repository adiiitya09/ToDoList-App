import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestCase3 {

	public static ToDo toDoList = new ToDo();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		toDoList.addToDoTask("Complete Project Implementation",false);
		toDoList.addToDoTask("Play FIFA", false);
		toDoList.addToDoTask("Requirement Specification for next project", false);
	    
	}

	@Test
	void testNumberOfTasks() {
		assertEquals(3, toDoList.numberOfTasks());
	}
	
	@Test
	void testNumberOfRemainingTasks() {
		assertEquals(2, toDoList.numberOfTasksRemaining());
	}
	
	@Test
	void testDeleteTaskTodoList() {
		assertEquals(true, toDoList.deleteToDoListTask(2));
	}
	
}
