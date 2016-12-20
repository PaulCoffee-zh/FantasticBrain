package com.leesun.java.al;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LeeSun
 * @comment 二叉树
 */
@SuppressWarnings("rawtypes")
public class BinaryTree<T extends Comparable> {

	private class Node {
		/** 父节点 */
		public Node parent;
		/** 左节点 */
		public Node left;
		/** 右节点 */
		public Node right;
		/** 节点数据 */
		public Object data;

		Node(Object data, Node parent, Node left, Node right) {
			this.data = data;
			this.parent = parent;
			this.left = left;
			this.right = right;
		}

		public String toString() {
			return "[data = " + this.data + "]";
		}

		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj.getClass() == Node.class) {
				Node target = (Node) obj;
				return data.equals(target.data) && left == target.left && right == target.right
						&& parent == target.parent;
			}
			return false;
		}
	}

	/** 根节点 */
	private Node root;

	public BinaryTree() {
		root = null;
	}

	public BinaryTree(T o) {
		root = new Node(o, null, null, null);
	}

	/**
	 * 添加节点
	 * 
	 * @param ele
	 */
	public void add(T ele) {
		if (null == root) {
			root = new Node(ele, null, null, null);
		} else {
			Node current = root;
			Node parent = null;
			int cmp;

			// 搜索合适的叶子节点，以该叶子节点为父节点添加新节点
			do {
				parent = current;
				cmp = ele.compareTo(current.data);
				// 如果新节点的值大于当前节点的值
				if (cmp > 0) {
					// 以当前节点的右子节点作为当前节点
					current = current.right;
				} else {
					current = current.left;
				}
			} while (null != current);
			
			//创建新节点
			Node newNode = new Node(ele, parent, null, null);
			
			//如果新节点的值大于父节点的值
			if(cmp > 0){
				parent.right = newNode;
			}else{
				parent.left = newNode;
			}
		}
	}
	
    /** 
     * 中序遍历 
     * @return 
     */  
    public List<Node> inIterator(){  
        return inIterator(root);  
    }  
    
	private List<Node> inIterator(Node node){  
        List<Node> list = new ArrayList<Node>();  
          
        //递归处理左子树  
        if(node.left != null){  
            list.addAll(inIterator(node.left));  
        }  
          
        //处理根节点  
        list.add(node); 
          
        //递归处理右子树  
        if(node.right != null){  
            list.addAll(inIterator(node.right));  
        }  
          
        return list;  
    }  
}
