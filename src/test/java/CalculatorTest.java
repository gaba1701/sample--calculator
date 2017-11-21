import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Logger;

import org.junit.Test;

public class CalculatorTest {
	private static final Logger LOG = Logger.getLogger(Calculator.class.getName());
	Calculator calculator = new Calculator();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();

	@Test
	public void testAddSmallSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*10));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*10));
			result = firstNumber + secondNumber;
			
			LOG.info("Testing the method with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}

	@Test
	public void testAddMiddleSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);
		}
	}
	@Test
	public void testAddLargeleSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);
		}
	}
	@Test
	public void testAddZero() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;	
		for (int i = 0; i < 200; i++) {
		result = firstNumber + secondNumber;

			LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 0);
		}
	}
	@Test
	public void testAddSmallNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			double rn = ThreadLocalRandom.current().nextDouble((-10), 1);
			
			firstNumber = Double.valueOf(df.format(rn));
			secondNumber = Double.valueOf(df.format(rn));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);
		}
	}
	@Test
	public void testAddMediumNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			double rn = ThreadLocalRandom.current().nextDouble((-100), 1);
			
			firstNumber = Double.valueOf(df.format(rn));
			secondNumber = Double.valueOf(df.format(rn));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);
		}
	}
	@Test
	public void testAddLargeNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			double rn = ThreadLocalRandom.current().nextDouble((-1000), 1);
			
			firstNumber = Double.valueOf(df.format(rn));
			secondNumber = Double.valueOf(df.format(rn));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);
		}
	}
}
	
	
	
