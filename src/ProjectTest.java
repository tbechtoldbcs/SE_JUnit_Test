import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProjectTest {
    Project simple_graph;

    @Before
    public void setUp(){
        simple_graph = new Project(
                new String[][]{
                        {"A", "B"}, {"C", "D"}, {"C", "E"}
                }
        );
    }

    @Test
    public void isWellSorted_simpleGraph_returnTrue() {
        assertTrue(simple_graph.isWellSorted(new String[]{"A","B","C","D","E"}));
    }

    @Test
    public void isWellSorted_simpleGraph_returnFalse() {
        assertFalse(simple_graph.isWellSorted(new String[]{"B","A","C","D","E"}));
    }

    @Test
    public void isWellSorted_missingTask_returnFalse() {
        assertFalse(simple_graph.isWellSorted(new String[]{"A","B","C","D"}));
    }

    @Test
    public void isWellSorted_duplicateTask_returnFalse() {
        assertFalse(simple_graph.isWellSorted(new String[]{"A","A","B","C","D","E"}));
    }
}