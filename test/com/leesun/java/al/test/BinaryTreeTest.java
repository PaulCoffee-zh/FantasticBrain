package com.leesun.java.al.test;

import java.util.Random;

import com.leesun.java.al.BinaryTree;

public class BinaryTreeTest {

	public static void main(String[] args) {
		BinaryTree<Integer> tree = new BinaryTree<Integer>();
		Random random = new Random(100);
		System.out.println(random.nextInt(10));
		for(int i = 0; i < 10; i++){
			Integer num = random.nextInt(100);
			System.out.println(num);
			tree.add(num);
		}
		System.out.println(tree.inIterator());
		tree.add(12330);
		System.out.println(tree.inIterator());
	}

}
