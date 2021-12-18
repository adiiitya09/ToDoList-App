//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import junit.framework.TestCase;

class TestCase2 extends TestCase {
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
		assertEquals(3, toDoList.numberOfTasksRemaining());
	}
	
	@Test
	void testModifyTodoList() {
		assertEquals(true, toDoList.modifyToDoListTask(2, "Play Football", false));
	}
	
	@Test
	void testNumberOfTasks1() {
		assertEquals(3, toDoList.numberOfTasks());
	}
	
	@Test
	void testNumberOfRemainingTasks1() {
		assertEquals(3, toDoList.numberOfTasksRemaining());
	}
	
	@Test
	void testModifyTodoList1() {
		assertEquals(true, toDoList.modifyToDoListTask(2, "Play Football", true));
	}
	
	@Test
	void testNumberOfTasks2() {
		assertEquals(3, toDoList.numberOfTasks());
	}
	
	@Test
	void testNumberOfRemainingTasks2() {
		assertEquals(2, toDoList.numberOfTasksRemaining());
	}
	
	@Test
	void testNumberOfRemainingTasks3() {
		assertEquals(3, toDoList.numberOfTasksRemaining());
	}
	
	@Test
	void testModifyTodoList2() {
		assertEquals(true, toDoList.modifyToDoListTask(2, "", false));
	}
}
