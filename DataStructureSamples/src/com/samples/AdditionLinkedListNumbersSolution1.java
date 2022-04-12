package com.samples;

public class AdditionLinkedListNumbersSolution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode l3=new ListNode(3,null);
		ListNode l2=new ListNode(4,l3);
		ListNode l1=new ListNode(2,l2);
		
		
		ListNode m3=new ListNode(4,null);
		ListNode m2=new ListNode(6,m3);
		ListNode m1=new ListNode(5,m2);
		
		Solution s=new Solution();
		ListNode r=s.addTwoNumbers(l1, m1);
		
		s.display(r);

	}

}

/*

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
 
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String num1=Integer.toString(l1.val);
        while(l1.next!=null)
        {
            l1=l1.next;
            num1=Integer.toString(l1.val)+num1;
        }
        
        int n1=Integer.parseInt(num1);
        System.out.println(n1);
        
        String num2=Integer.toString(l2.val);
        while(l2.next!=null)
        {
            l2=l2.next;
            num2=Integer.toString(l2.val)+num2;
        }
        
        int n2=Integer.parseInt(num2);
        System.out.println(n2);
        int sum=n1+n2;
        
        String sums=Integer.toString(sum);
        int l=sums.length();
        ListNode arr[]=new ListNode[l];
        int v;
        for(int i=0;i<l;i++)
        {
            
            v=Integer.parseInt(String.valueOf(sums.charAt(i)));
            if(i==0)
            {
                arr[i]=new ListNode(v,null);
            }
            else
            {
                arr[i]=new ListNode(v,arr[i-1]);
            }
            
        }
        
        return arr[l-1];
        
        
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

*/