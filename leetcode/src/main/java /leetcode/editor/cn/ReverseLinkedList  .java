package leetcode.editor.cn;//给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
// 
// 
// 
//
// 示例 1： 
//
// 
//输入：head = [1,2,3,4,5]
//输出：[5,4,3,2,1]
// 
//
// 示例 2： 
//
// 
//输入：head = [1,2]
//输出：[2,1]
// 
//
// 示例 3： 
//
// 
//输入：head = []
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点的数目范围是 [0, 5000] 
// -5000 <= Node.val <= 5000 
// 
//
// 
//
// 进阶：链表可以选用迭代或递归方式完成反转。你能否用两种方法解决这道题？ 
// 
// 
// Related Topics 链表 
// 👍 1776 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

/**
 * 反转列表
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;

        while (cur != null) {
            //记录cur.next
            ListNode temp = cur.next;
            //反转指向
            cur.next = prev;
            //后移prev(也就是prev指向cur的值)
            prev = cur;
            //后移 cur
            cur = temp;
        }

        return prev;//反转后prev为调整后连表的头指针


    }

}
//leetcode submit region end(Prohibit modification and deletion)
