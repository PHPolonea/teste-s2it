package com.testes2it;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class ValorCTest {
	ValorC valorC = new ValorC();
	
	@Test
    public void menosUm() {
        assertEquals(-1, valorC.gerarValorC(10256, 512));
    }
	
	@Test
    public void test14253() {
        assertEquals(14253, valorC.gerarValorC(123, 45));
    }
	
	@Test
    public void test41523() {
        assertEquals(41523, valorC.gerarValorC(45, 123));
    }
	
	@Test
    public void test0() {
        assertEquals(0, valorC.gerarValorC(0, 0));
    }
}
