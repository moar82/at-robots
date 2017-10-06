/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.gui;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.virtualinfinity.atrobots.gui.RobotFileUtils;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class RobotFileUtilsEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("-d");
      linkedList0.add("-d");
      // Undeclared exception!
      try {
        RobotFileUtils.getFilesByName((List<String>) linkedList0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      File file0 = RobotFileUtils.robotFile("/M");
      assertEquals("/M", file0.getCanonicalPath());
  }

  @Test
  public void test2()  throws Throwable  {
      FileNameExtensionFilter fileNameExtensionFilter0 = RobotFileUtils.getAtRobotsFileNameFilter();
      assertNotNull(fileNameExtensionFilter0);
      assertEquals("AT-Robots files", fileNameExtensionFilter0.getDescription());
  }

  @Test
  public void test3()  throws Throwable  {
      RobotFileUtils robotFileUtils0 = new RobotFileUtils();
      assertNotNull(robotFileUtils0);
  }

  @Test
  public void test4()  throws Throwable  {
      File[] fileArray0 = new File[3];
      RobotFileUtils.EntrantFile[] robotFileUtils_EntrantFileArray0 = RobotFileUtils.getEntrantFiles(fileArray0);
      assertNotNull(robotFileUtils_EntrantFileArray0);
  }

  @Test
  public void test5()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("lib");
      RobotFileUtils.getFilesByName((List<String>) linkedList0);
      assertEquals(1, linkedList0.size());
  }
}
