package tests;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

import com.hucs.System;
@RunWith(ConcordionRunner.class)
public class CalculatorTest {
   
	System system = new System();
   
	public Double soma(Double firstNumber, Double secondNumber) {
      return system.soma(firstNumber, secondNumber);
   }
}