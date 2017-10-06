/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.arena;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.LinkedList;
import net.virtualinfinity.atrobots.arena.SimulationFrame;
import net.virtualinfinity.atrobots.snapshots.ArenaObjectSnapshot;
import net.virtualinfinity.atrobots.snapshots.RobotSnapshot;
import net.virtualinfinity.atrobots.snapshots.SnapshotAdaptor;
import net.virtualinfinity.atrobots.snapshots.SnapshotVisitor;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SimulationFrameEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      LinkedList<ArenaObjectSnapshot> linkedList0 = new LinkedList<ArenaObjectSnapshot>();
      LinkedList<RobotSnapshot> linkedList1 = new LinkedList<RobotSnapshot>();
      SimulationFrame simulationFrame0 = new SimulationFrame((Collection<ArenaObjectSnapshot>) linkedList0, (Collection<RobotSnapshot>) linkedList1, true);
      boolean boolean0 = simulationFrame0.isRoundOver();
      assertEquals(true, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      LinkedList<ArenaObjectSnapshot> linkedList0 = new LinkedList<ArenaObjectSnapshot>();
      LinkedList<RobotSnapshot> linkedList1 = new LinkedList<RobotSnapshot>();
      SimulationFrame simulationFrame0 = new SimulationFrame((Collection<ArenaObjectSnapshot>) linkedList0, (Collection<RobotSnapshot>) linkedList1, false);
      Collection<ArenaObjectSnapshot> collection0 = simulationFrame0.getAllObjects();
      assertNotNull(collection0);
      assertEquals(false, simulationFrame0.isRoundOver());
  }

  @Test
  public void test2()  throws Throwable  {
      LinkedList<ArenaObjectSnapshot> linkedList0 = new LinkedList<ArenaObjectSnapshot>();
      SimulationFrame simulationFrame0 = new SimulationFrame((Collection<ArenaObjectSnapshot>) linkedList0, (Collection<RobotSnapshot>) null, true);
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      // Undeclared exception!
      try {
        simulationFrame0.add((ArenaObjectSnapshot) robotSnapshot0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      LinkedList<ArenaObjectSnapshot> linkedList0 = new LinkedList<ArenaObjectSnapshot>();
      LinkedList<RobotSnapshot> linkedList1 = new LinkedList<RobotSnapshot>();
      SimulationFrame simulationFrame0 = new SimulationFrame((Collection<ArenaObjectSnapshot>) linkedList0, (Collection<RobotSnapshot>) linkedList1, false);
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      linkedList0.add((ArenaObjectSnapshot) robotSnapshot0);
      SnapshotAdaptor snapshotAdaptor0 = new SnapshotAdaptor();
      simulationFrame0.visitAll((SnapshotVisitor) snapshotAdaptor0);
      assertEquals(false, simulationFrame0.isRoundOver());
  }

  @Test
  public void test4()  throws Throwable  {
      LinkedList<RobotSnapshot> linkedList0 = new LinkedList<RobotSnapshot>();
      SimulationFrame simulationFrame0 = new SimulationFrame((Collection<ArenaObjectSnapshot>) null, (Collection<RobotSnapshot>) linkedList0, true);
      SnapshotAdaptor snapshotAdaptor0 = new SnapshotAdaptor();
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      linkedList0.add(robotSnapshot0);
      simulationFrame0.visitRobots((SnapshotVisitor) snapshotAdaptor0);
      assertEquals(true, simulationFrame0.isRoundOver());
  }
}
