package com.satyam.problem.leetcode.easy;

/**

 LC #21
 Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together
 the nodes of the first two lists.

 Idea:
    Iterate and merge

 Submission Detail
    Link: https://leetcode.com/submissions/detail/277096761/
    Runtime: 0 ms
    Memory: 39.6 MB

 */

public class LC21Merge2SortedListsUsingRecursion {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }


    // Leetcode - given class
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
  }
}
