/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.hardware.missiles;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.virtualinfinity.atrobots.arena.Arena;
import net.virtualinfinity.atrobots.arena.Heading;
import net.virtualinfinity.atrobots.arena.Position;
import net.virtualinfinity.atrobots.arenaobjects.DamageInflicter;
import net.virtualinfinity.atrobots.hardware.HasOverburner;
import net.virtualinfinity.atrobots.hardware.heatsinks.HeatSinks;
import net.virtualinfinity.atrobots.hardware.missiles.MissileLauncher;
import net.virtualinfinity.atrobots.ports.PortHandler;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MissileLauncherEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MissileLauncher missileLauncher0 = new MissileLauncher();
      Arena arena0 = new Arena();
      missileLauncher0.setArena(arena0);
      assertEquals(0, arena0.countActiveRobots());
  }

  @Test
  public void test1()  throws Throwable  {
      MissileLauncher missileLauncher0 = new MissileLauncher();
      PortHandler portHandler0 = missileLauncher0.getActuator();
      assertNotNull(portHandler0);
  }

  @Test
  public void test2()  throws Throwable  {
      MissileLauncher missileLauncher0 = new MissileLauncher();
      Position position0 = new Position();
      missileLauncher0.setPosition(position0);
  }

  @Test
  public void test3()  throws Throwable  {
      MissileLauncher missileLauncher0 = new MissileLauncher();
      DamageInflicter damageInflicter0 = missileLauncher0.getDamageInflicter();
      assertNull(damageInflicter0);
  }

  @Test
  public void test4()  throws Throwable  {
      MissileLauncher missileLauncher0 = new MissileLauncher();
      missileLauncher0.setHeatSinks((HeatSinks) null);
  }

  @Test
  public void test5()  throws Throwable  {
      MissileLauncher missileLauncher0 = new MissileLauncher();
      HasOverburner hasOverburner0 = missileLauncher0.getOverburner();
      assertNull(hasOverburner0);
  }

  @Test
  public void test6()  throws Throwable  {
      MissileLauncher missileLauncher0 = new MissileLauncher();
      Arena arena0 = missileLauncher0.getArena();
      assertNull(arena0);
  }

  @Test
  public void test7()  throws Throwable  {
      MissileLauncher missileLauncher0 = new MissileLauncher();
      Heading heading0 = new Heading();
      missileLauncher0.setHeading(heading0);
      assertEquals("4.884194828627882r/7", heading0.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      MissileLauncher missileLauncher0 = new MissileLauncher();
      missileLauncher0.setOverburner((HasOverburner) null);
  }

  @Test
  public void test9()  throws Throwable  {
      MissileLauncher missileLauncher0 = new MissileLauncher();
      missileLauncher0.setDamageInflicter((DamageInflicter) null);
  }

  @Test
  public void test10()  throws Throwable  {
      MissileLauncher missileLauncher0 = new MissileLauncher();
      missileLauncher0.setPower(1467.4155600660456);
  }

  @Test
  public void test11()  throws Throwable  {
      MissileLauncher missileLauncher0 = new MissileLauncher();
      HeatSinks heatSinks0 = missileLauncher0.getHeatSinks();
      assertNull(heatSinks0);
  }
}
