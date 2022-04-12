package com.samples;

public class AdditionLinkedListNumbersSolution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode l3=new ListNode(9,null);
		ListNode l2=new ListNode(9,l3);
		ListNode l1=new ListNode(9,l2);
		
		
		ListNode m3=new ListNode(9,null);
		ListNode m2=new ListNode(9,m3);
		ListNode m1=new ListNode(9,m2);
		
		Solution s=new Solution();
		ListNode r=s.addTwoNumbers(l1, m1);
		
		s.display(r);

	}

}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
	 
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	
    	int carry=0;
		ListNode temp=null;
		ListNode l=null;
		ListNode head=null;
		int end1=0;
		int end2=0;
    
	do {
		
		if(l==null)
		{
			if(l1.val+l2.val+carry>9)
    		{
    			
    			temp=new ListNode((l1.val+l2.val+carry)%10,null);
    			carry=1;
    		}
    		
    		else
    		{
    			temp=new ListNode(l1.val+l2.val+carry,null);
    			carry=0;
    		}
    	
    		l=temp;
    		head=temp;
		}
		else
		{
			if(end1==1 && end2==0)
			{
				if(0+l2.val+carry>9)
        		{
        			
        			temp=new ListNode((0+l2.val+carry)%10,null);
        			l.next=temp;
        			carry=1;
        		}
        		
        		else
        		{
        			temp=new ListNode(0+l2.val+carry,null);
        			l.next=temp;
        			carry=0;
        		}
        	
			}
			else if(end1==0 && end2==1)
			{
				if(l1.val+0+carry>9)
        		{
        			
        			temp=new ListNode((l1.val+0+carry)%10,null);
        			l.next=temp;
        			carry=1;
        		}
        		
        		else
        		{
        			temp=new ListNode(l1.val+0+carry,null);
        			l.next=temp;
        			carry=0;
        		}
        	
			}
			
			else
			{
				if(l1.val+l2.val+carry>9)
        		{
        			
        			temp=new ListNode((l1.val+l2.val+carry)%10,null);
        			l.next=temp;
        			carry=1;
        		}
        		
        		else
        		{
        			temp=new ListNode(l1.val+l2.val+carry,null);
        			l.next=temp;
        			carry=0;
        		}
        	
			}
			
			
			l=temp;
		}
		
		if(l1!=null)
		{
			l1=l1.next;
		}
		if(l2!=null)
		{
			l2=l2.next;
		}
		if(l1==null)
		{
			end1=1;
		}
		
		if(l2==null)
		{
			end2=1;
		}
		
		
	}
	while(l1!=null || l2!=null);
	
	if(carry==1)
	{
		temp=new ListNode(1,null);
		l.next=temp;
	}
	
    return head;
        
    }
    
    public void display(ListNode n)
    {
    	ListNode last=n;
    	do {
    		System.out.println(last.val);
    		last=last.next;
    	}while(last!=null);
    }
}


