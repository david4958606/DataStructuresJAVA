package top.kirinou.list;

public class LeetCode002 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null; // 答案的头和尾
        int carry = 0; // 进位
        while (l1 != null || l2 != null) { // 只要有一个链表不为空
            int n1 = l1 != null ? l1.val : 0; // 取出l1的值
            int n2 = l2 != null ? l2.val : 0; // 取出l2的值
            int sum = n1 + n2 + carry; // 加上进位
            if (head == null) { // 如果是第一次循环
                head = tail = new ListNode(sum % 10); // 创建新节点
            } else { // 如果不是第一次循环
                tail.next = new ListNode(sum % 10); // 创建新节点
                tail = tail.next; // 更新tail
            }
            carry = sum / 10; // 更新进位
            if (l1 != null) { // 如果l1不为空
                l1 = l1.next; // 更新l1
            }
            if (l2 != null) { // 如果l2不为空
                l2 = l2.next; // 更新l2
            }
        }
        if (carry > 0) { // 如果还有进位
            tail.next = new ListNode(carry); // 创建新节点
        }
        return head;
    }
}
