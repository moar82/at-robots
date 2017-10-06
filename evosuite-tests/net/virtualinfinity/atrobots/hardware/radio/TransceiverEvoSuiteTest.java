/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.hardware.radio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.virtualinfinity.atrobots.comqueue.CommunicationsQueue;
import net.virtualinfinity.atrobots.hardware.radio.Transceiver;
import net.virtualinfinity.atrobots.ports.PortHandler;
import net.virtualinfinity.atrobots.radio.RadioDispatcher;
import net.virtualinfinity.atrobots.radio.RadioListener;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TransceiverEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Transceiver transceiver0 = new Transceiver();
      PortHandler portHandler0 = transceiver0.getChannelLatchPort();
      assertEquals(0, portHandler0.read());
  }

  @Test
  public void test1()  throws Throwable  {
      Transceiver transceiver0 = new Transceiver();
      transceiver0.setCommQueue((CommunicationsQueue) null);
      assertEquals(0, transceiver0.getChannel());
  }

  @Test
  public void test2()  throws Throwable  {
      Transceiver transceiver0 = new Transceiver();
      RadioDispatcher radioDispatcher0 = new RadioDispatcher();
      transceiver0.setRadioDispatcher(radioDispatcher0);
      radioDispatcher0.dispatch((RadioListener) transceiver0, (int) (short) (-1958), (short) (-1958));
      assertEquals(0, transceiver0.getChannel());
  }

  @Test
  public void test3()  throws Throwable  {
      Transceiver transceiver0 = new Transceiver();
      int int0 = transceiver0.getChannel();
      assertEquals(0, int0);
  }

  @Test
  public void test4()  throws Throwable  {
      Transceiver transceiver0 = new Transceiver();
      RadioDispatcher radioDispatcher0 = new RadioDispatcher();
      transceiver0.setRadioDispatcher(radioDispatcher0);
      transceiver0.send((short) (-1958));
      assertEquals(0, transceiver0.getChannel());
  }

  @Test
  public void test5()  throws Throwable  {
      Transceiver transceiver0 = new Transceiver();
      Transceiver transceiver1 = new Transceiver();
      transceiver0.setChannel((int) (short) (-5));
      // Undeclared exception!
      try {
        transceiver0.radioSignal((RadioListener) transceiver1, (int) (short) (-5), (short) (-5));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
