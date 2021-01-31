学习笔记


[不是用md写的，直接复制过来了，记录在自己的网易云笔记里的]  
数组、链表、跳表  
一.数组、链表、跳表的基本实现和特性
数组、链表、跳表：
Array 增加/删除  O(n)，需要移动数组
Linked List  查找 O(n)
skip List 跳表  插入删除搜索 O（logn）  取代平衡树二分查找
跳表元素始终有序
时间复杂度  O(logn)   第k级索引节点个数 假设索引h级，最高级有2节点 n/(2^h) = 2,          也就是h=log2(n)-1
空间复杂度O(n)
todo：课后参考文章解读
二.实战题目解析：移动零
题目一定要背诵默写，至少训练营里的题目要会背诵默写
先写思路下来
有些操作形成固定的操作，变成小操作
记录下来，在leetcode里面记录 和在表格里面记录
刷题不能只刷一遍
核心思想：1 升维   2 空间换时间
看完以后  去掉cn去国际站+五毒神掌+主体思想+高级算法模板
三.实战题目解析：3数之和、环形链表
Arrays.sort 的 时间复杂度为nlogn
先和面试官讨论的很好，暴力破解法，哈希表，双指针都先概述一下各种方法都写出来并且分析复杂度，并把最牛逼的解法一气呵成写下来，一定能拿到最高的package
栈、队列、优先队列、双端队列
一.队列和栈的实现和特性
栈 Stack Last in-First out，push加进去，pop取出来  添加删除 O(1) 查询 O(N)
boolean  empty() 看是否为空栈
E peek() 查栈顶元素，不动
E pop()  取出元素并且返回
E push(E item)  添加元素
int search(Object o)  
队列  Queue First in First Out   添加删除 O(1) 查询O(N)
 Throws exception Returns specialvalue
Insert add(e) offer(e)
Remove remove poll()
Examine elememt() peek()
双端队列：Deque： Double-End Queue 添加删除 O(1) 查询O(N)
   【Vector实际上就是一个ArrayList，只不过是线程安全的】
优先队列 Priority Queue
插入操作 O(1)
取出操作 O(logN) 按照元素的优先级取出
底层具体实现的数据结构较为多样和复杂：heap、bst，treap可以有多种不同的实现
看一下 stack和queue的源代码
二.实战题目解析：有效的括号、最小栈等问题
作业  
Queue和Priority Queue的源码分析
一个题目如果具有最近相关性 就用栈来解决
要栈实现队列 和 要 队列实现栈的 就用两个
i 和 j 从中间向两边扩散和i和j从两边向中间合，需要很熟练