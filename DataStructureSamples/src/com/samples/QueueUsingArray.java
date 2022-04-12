package com.samples;

public class QueueUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Queue q=new Queue(4);
		q.enqueue(100);
		q.enqueue(101);
		q.enqueue(102);
		q.enqueue(103);
		q.display();
		System.out.println("***************************");
		q.enqueue(104);
		System.out.println("***************************");
		int x=q.dequeue();
		System.out.println("Dequeued: "+x);
		q.display();
		System.out.println("***************************");
		q.enqueue(104);
		q.display();
		
		q.enqueue(105);

	}

}

class Queue
{
	int arr[];
	int front=0;
	int rear=-1;
	int size;
	int count=0;
	
	Queue(int size)
	{
		
		arr=new int[size];
		this.size=size;
	}
	
	void enqueue(int e)
	{
		if(count==size)
		{
			System.out.println(e+" cannot be inserted as Queue is full");
		}
		else
		{
			rear++;
			int index=rear%size;
			arr[index]=e;
			count=count+1;
			
		}
		
	}
	
	int dequeue()
	{
		if(count==0)
		{
			System.out.println("Queue is empty");
			return -1;
		}
		else
		{
			int e=arr[front];
			front++;
			count--;
			return e;
		}
	}
	
	void display()
	{
		int start=front;
		for(int i=0;i<count;i++)
		{
			int index=start%size;
			System.out.println(arr[index]);
			start++;
		}
	}
}

 

