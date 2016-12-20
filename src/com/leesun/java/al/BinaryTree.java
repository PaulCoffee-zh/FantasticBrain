package com.leesun.java.al;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LeeSun
 * @comment ������
 */
@SuppressWarnings("rawtypes")
public class BinaryTree<T extends Comparable> {

	private class Node {
		/** ���ڵ� */
		public Node parent;
		/** ��ڵ� */
		public Node left;
		/** �ҽڵ� */
		public Node right;
		/** �ڵ����� */
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

	/** ���ڵ� */
	private Node root;

	public BinaryTree() {
		root = null;
	}

	public BinaryTree(T o) {
		root = new Node(o, null, null, null);
	}

	/**
	 * ��ӽڵ�
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

			// �������ʵ�Ҷ�ӽڵ㣬�Ը�Ҷ�ӽڵ�Ϊ���ڵ�����½ڵ�
			do {
				parent = current;
				cmp = ele.compareTo(current.data);
				// ����½ڵ��ֵ���ڵ�ǰ�ڵ��ֵ
				if (cmp > 0) {
					// �Ե�ǰ�ڵ�����ӽڵ���Ϊ��ǰ�ڵ�
					current = current.right;
				} else {
					current = current.left;
				}
			} while (null != current);
			
			//�����½ڵ�
			Node newNode = new Node(ele, parent, null, null);
			
			//����½ڵ��ֵ���ڸ��ڵ��ֵ
			if(cmp > 0){
				parent.right = newNode;
			}else{
				parent.left = newNode;
			}
		}
	}
	
    /** 
     * ������� 
     * @return 
     */  
    public List<Node> inIterator(){  
        return inIterator(root);  
    }  
    
	private List<Node> inIterator(Node node){  
        List<Node> list = new ArrayList<Node>();  
          
        //�ݹ鴦��������  
        if(node.left != null){  
            list.addAll(inIterator(node.left));  
        }  
          
        //������ڵ�  
        list.add(node); 
          
        //�ݹ鴦��������  
        if(node.right != null){  
            list.addAll(inIterator(node.right));  
        }  
          
        return list;  
    }  
}
