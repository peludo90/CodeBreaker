package co.udea.appempresariales.tdd;

import static org.junit.Assert.*;

import org.junit.Assert.*;
import org.junit.Test;

import co.udea.appempresariales.code.CodeBreaker;

public class CodeBreakerTest {


	@Test
	public void probeContainOne() {
		CodeBreaker codeBreaker = new CodeBreaker();

		codeBreaker.setSecret(6781);
		assertEquals("_", codeBreaker.compare(2365));
	}
	
	@Test
	public void probeEqualsOne() {
		CodeBreaker codeBreaker = new CodeBreaker();
		
		codeBreaker.setSecret(6781);

		assertEquals("X", codeBreaker.compare(2385));
	}
	
	@Test
	public void probeHasOneinPlaceOneContained() {
		CodeBreaker codeBreaker = new CodeBreaker();
		
		codeBreaker.setSecret(6781);

		assertEquals("X_", codeBreaker.compare(1385));
	}
	
	@Test
	public void probeContained() {
		CodeBreaker codeBreaker = new CodeBreaker();
		
		codeBreaker.setSecret(6781);

		assertEquals("XXXX", codeBreaker.compare(6781));
	}
	
	@Test
	public void probeContainedRandom() {
		CodeBreaker codeBreaker = new CodeBreaker();
		
		codeBreaker.setSecret(6781);

		assertEquals("____", codeBreaker.compare(1876));
	}
	
	@Test
	public void probeAllEquals() {
		CodeBreaker codeBreaker = new CodeBreaker();
		
		codeBreaker.setSecret(1234);

		assertEquals("X", codeBreaker.compare(1111));
	}
	

	@Test
	public void probeWrongParameters() {
		CodeBreaker codeBreaker = new CodeBreaker();
		
		codeBreaker.setSecret(1234);

		assertEquals("X", codeBreaker.compare(1111));
	}
	
	@Test
	public void validateInt(){
		CodeBreaker codeBreaker = new CodeBreaker();

		assertFalse(codeBreaker.isPositiveInt("1135"));
	}
	
	@Test
	public void validateIntNegative(){
		CodeBreaker codeBreaker = new CodeBreaker();

		assertFalse(!codeBreaker.isPositiveInt("-1135"));
	}
	
	@Test
	public void validatesString(){
		CodeBreaker codeBreaker = new CodeBreaker();

		assertFalse(!codeBreaker.isPositiveInt("252F"));
	}
	
	@Test
	public void validateLong(){
		CodeBreaker codeBreaker = new CodeBreaker();

		assertFalse(!codeBreaker.isPositiveInt("252F"));
	}
	
	
}
