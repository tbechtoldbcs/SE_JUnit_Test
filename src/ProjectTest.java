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
    public void test_simple_graph_1() {
        assertTrue(simple_graph.isWellSorted(new String[]{"A","B","C","D","E"}));
    }

    @Test
    public void test_simple_graph_2() {
        assertFalse(simple_graph.isWellSorted(new String[]{"B","A","C","D","E"}));
    }

    @Test
    public void test_simple_graph_3() {
        assertFalse(simple_graph.isWellSorted(new String[]{"A","B","C","D"}));
    }

    public void test_simple_graph_4() {
        assertFalse(simple_graph.isWellSorted(new String[]{"A","A","B","C","D","E"}));
    }
}