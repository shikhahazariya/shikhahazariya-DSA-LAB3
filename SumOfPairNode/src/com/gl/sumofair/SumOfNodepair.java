package com.gl.sumofair;
import java.util.*;
public class SumOfNodepair {
	static class Node {
	int nodeData ;
	  Node leftNode, rightNode;
	  };
 static Node NewNode(int nodeData) {
	 Node temp=new Node();
	 temp.nodeData=nodeData;
	 temp.leftNode=null;
	 temp.rightNode=null;
	 return temp;
 }
 public Node insert(Node root,  int key)
 {   
	 
	 if(root==null)
		 return NewNode(key);
	 if(key<root.nodeData)
		 root.leftNode=insert(root.leftNode,key);
	 root.rightNode=insert(root.rightNode,key);
	return root;
	 
 }
 
 public boolean findpairUtil(Node root, int sum, HashSet<Integer> set)
 { 
	 
	 if(root==null)
		 return false;
	 if(findpairUtil(root.leftNode,sum,set))
		 return true;
	 if(set.contains(sum-root.nodeData)) {
		 
		 System.out.println("pair is found ("+(sum-root.nodeData)+","+root.nodeData+")");
		 return true;
		 
	 }
	 else set.add(root.nodeData);
	 return findpairUtil(root.rightNode,sum,set);
	 
 }
 public void findpairwithgivenSum(Node root,int Sum) {
	 HashSet<Integer>Set=new HashSet<Integer>();
	 if(!findpairUtil(root, Sum, Set))
		 System.out.println("PAIR DO NOT EXIT");
	 
 }
 public static void main(String arg[]) {
	 Node root=null;
	 SumOfNodepair findsp=new SumOfNodepair();
	 root=findsp.insert(root, 40);
	 root=findsp.insert(root, 20);
	 root=findsp.insert(root, 60);
	 root=findsp.insert(root, 10);
	 root=findsp.insert(root, 30);
	 root=findsp.insert(root, 50);
	 root=findsp.insert(root, 70);
	 int sum=50;
	 findsp.findpairwithgivenSum(root,sum);
 }
 
}