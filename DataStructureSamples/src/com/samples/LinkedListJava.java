package com.samples;

public class LinkedListJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list=new LinkedList();
		Node n1=new Node(10);
		list.insertend(n1);
		Node n2=new Node(20);
		list.insertend(n2);
		Node n3=new Node(100);
		list.insertbeg(n3);
		Node n4=new Node(33);
		list.insertatPosition(n4, 4);
		list.display();

	}

}

class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data=d;
		next=null;
	}
}

class LinkedList
{
	Node header=null;
	
	void insertend(Node n)
	{
		if(header==null)
		{
			header=n;
		}
		else
		{
			Node last=header;
			while(last.next!=null)
			{
				last=last.next;
			}
			
			last.next=n;
		}
	}
	
	void insertbeg(Node n)
	{
		if(header==null)
		{
			header=n;
		}
		else
		{
			n.next=header;
			header=n;
		}
		
	}
	
	void insertatPosition(Node n,int p)
	{
		if(header==null || p==1)
		{
			insertbeg(n);
		}
		else
		{
			Node pos=header;
			Node ppos = null;
			Node npos = null;
			for(int i=1;i<p;i++)
			{
				ppos=pos;
				npos=pos.next;
				pos=pos.next;
			}
			
			ppos.next=n;
			n.next=npos;
		}
	}
	void display()
	{
		if(header==null)
		{
			System.out.println("No nodes in the list");
		}
		else
		{
			Node last=header;
			do
			{
				System.out.println(last.data);
				last=last.next;
			}while(last!=null);
		}
	}
}

