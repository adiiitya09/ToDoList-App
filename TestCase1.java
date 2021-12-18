//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import junit.framework.TestCase;

class TestCase1 extends TestCase {
	public static ToDo toDoList = new ToDo();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		toDoList.addToDoTask("Complete Project Implementation", false);
		toDoList.addToDoTask("Play FIFA", false);
		toDoList.addToDoTask("Requirement Specification for next project", false);
	}

	@Test
	void testGetToDoList() {
		toDoList.getToDoList();
	}
	
	
	
//	@Test
//	void testGetToDoList1() {
//		toDoList.getToDoList();
//	}
	
	@Test
	void testPrintToDoList() {
		toDoList.printToDoList();
	}
//
//	@Test 
//	void testGetRemainingTaskstList() {
//		toDoList.getRemainingTaskstList();
//	}
//	
//	@Test
//	void testNumberOfTasksRemained() {
//        assertEquals(3, toDoList.numberOfTasks());
//	}
//
//	@Test
//	void testNumberOfTasksRemained1() {
//        assertEquals(4, toDoList.numberOfTasksRemaining());
//	}
}
