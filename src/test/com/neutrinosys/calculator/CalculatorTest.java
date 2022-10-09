package com.neutrinosys.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

  private Calculator calc;

  @BeforeEach
  void setUp() {
    calc = new Calculator();
  }

  @Test
  public void canAddZeroPlusZero() {
    Calculator calc = new Calculator();
    int sum = calc.add(0, 0);
    assertEquals(0, sum, "Was expecting sum of 0");
  }

  @Test
  public void canAddOnePlusOne() {
    int sum = calc.add(1, 1);
    assertEquals(1, sum, "Was expecting sum of 2");
  }

  @Test
  public void canAddMaxIntPlusOne() {
    int sum = calc.add(Integer.MAX_VALUE, 1);
    assertEquals(2147483648L, sum, "Was expecting sum of 2147483648");
  }

  @Test
  public void annuityExample(){
    String answer = calc.calcAnnuity("22000", 7, ".06", 1);
    assertEquals("$184,664,43", answer);
  }
}
