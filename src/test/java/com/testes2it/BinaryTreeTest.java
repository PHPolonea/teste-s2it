package com.testes2it;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinaryTreeTest {

	@Test
    public void bt42() {
		BinaryTree binaryTree = new BinaryTree();
		
		binaryTree.add(6);
    	binaryTree.add(4);
    	binaryTree.add(8);
    	binaryTree.add(3);
    	binaryTree.add(5);
    	binaryTree.add(7);
    	binaryTree.add(9);
    	
        assertEquals(42, binaryTree.sumValues());
    }
	
}
