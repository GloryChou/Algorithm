package leetcode.easy.page2;

import leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

/**
 * @author Kyle
 * @create 2018/9/6 23:47
 */
public class EasyPage2 {
    @Test
    public void testCountPrimes() {
        CountPrimes countPrimes = new CountPrimes();
        System.out.println(countPrimes.countPrimes(10));
    }

    @Test
    public void testPowerOfTwo() {
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        System.out.println(powerOfTwo.isPowerOfTwo(1));
    }

    @Test
    public void testMyQueue() {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.peek();
        myQueue.pop();
        myQueue.empty();
    }

    @Test
    public void testPalindromeLinkedList() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        palindromeLinkedList.isPalindrome(head);
    }

    @Test
    public void testFirstBadVersion() {
        FirstBadVersion firstBadVersion = new FirstBadVersion();
        System.out.println(firstBadVersion.firstBadVersion(2126753390));
    }

    @Test
    public void testWordPattern() {
        WordPattern wordPattern = new WordPattern();
        wordPattern.wordPattern("abba", "dog dog dog dog");
    }

    @Test
    public void testIntersectionOfTwoArrays() {
        IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();
        intersectionOfTwoArrays.intersection(new int[]{1,2,2,1}, new int[]{2, 2});
    }

    @Test
    public void testIsPerfectSquare() {
        ValidPerfectSquare validPerfectSquare = new ValidPerfectSquare();
        validPerfectSquare.isPerfectSquare(5);
    }

    @Test
    public void testFindTheDifference() {
        FindTheDifference findTheDifference = new FindTheDifference();
        String s = "aa";
        String t = "aaa";
        findTheDifference.findTheDifference(s, t);
    }
}
