/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        List<Integer>list=new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }

        //list=[5 4 2  1]
        int i=0,j=list.size()-1;
        int max=Integer.MIN_VALUE;
        while(i<j){
            int myval=list.get(i)+list.get(j);
            max=Math.max(myval,max);
            i++;
            j--;

        }
        return max;
    }
}