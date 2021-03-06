/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.debugger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.PrintStream;
import net.virtualinfinity.atrobots.debugger.PrintStreamConsoleOutput;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PrintStreamConsoleOutputEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PrintStreamConsoleOutput printStreamConsoleOutput0 = new PrintStreamConsoleOutput((PrintStream) null);
      // Undeclared exception!
      try {
        printStreamConsoleOutput0.handleExceptione((Exception) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      PrintStreamConsoleOutput printStreamConsoleOutput0 = new PrintStreamConsoleOutput((PrintStream) null);
      // Undeclared exception!
      try {
        printStreamConsoleOutput0.println((Object) "French");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
