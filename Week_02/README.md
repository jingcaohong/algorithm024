学习笔记

### 第5课|哈希表、映射、集合
#### 1.哈希表、映射、集合的实现与特性
- 哈希表
1. 哈希表（Hash table），也叫散列表，映射函数也叫做散列函数（Hash Function），存放记录的数组叫作哈希表（或散列表）
2. 哈希碰撞 Hash Collisions  有冲突的话用一个链表存储
3. 查询添加删除复杂度都为O(1)
4. Java Code
    - **Map：key-value对，key不重复**
        - new HashMap()/ new TreeMap()
        - map.set(key,value)
        - map.get(key)
        - map.has(key)
        - map.size()
        - map.clear() 清理
        - Map.Entry<K,V>
        - map.containsKey(Object key)
        - map.containsValue(Object value)
        - map.isEmpty()
        - map.put(key,value)
        - map.remove(key)
    - **Set:不重复元素的集合**
        -  new HashSet()/ new TreeSet()
        -  set.add(value)
        -  set.delete(value)
        -  set.has(value)
        -  set.clear()
        -  set.contains(Object o)
        -  set.isEmpty()
        -  set.size()

#### 1.实战题目解析：有效的字母异位词等问题
1. ==面试步骤==  
- clarification 和面试官讨论清楚  比如大小写，概念，边界
- possible solutions  --> optimal（time & space） 列举所有方法，并且选出最优解
- code 开始编码
- test cases 开始测试


```
一些tips：
1.数组sort 时间复杂度 nlogn
2.char[] str1 = s.toCharArray()
  Arrays.sort(str1)
3.暴力解法也是要掌握
4.国际站一定要看，最有效的方式，欲速则不达
5.用石墨弄一个精选代码总结，合集
```


  
  
todo：  
1. java 10 hashtable 去看
2. hashset 源代码
3. hashmap源代码 put getVal看明白就好
4. 
- 1 - - - - - 1


### 树
1. Linked List是特殊化的Tree  Tree是特殊化的Graph
2. 示例代码（重要）

```java
public class TreeNode{
    public int val;
    public TreeNode left,right;
    public TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
    
}
```
### 二叉树  
1. 二叉树的遍历 pre-order/in-order/post-order
- 前序 Pre-order：根左右
- 中序 In-order：左根右
- 后序 Post-order：左右根
2. 递归的代码
```python
// 前序遍历
def preorder(self,root):
    if root:
        self.traverse_path.append(root.val)
        self.preorder(root.left)
        self.preorder(root.right)
        
// 中序遍历       
def inorder(self,root):
    if root:
        self.inorder(root.left)
        self.traverse_path.append(root.val)
        self.inorder(root.right)
     
// 后序遍历
def postorder(self,root)
    if root:
        self.inorder(root.left)
        self.inorder(root.right)
        self.traverse_path.append(root.val)
```

### 二叉搜索树
1. 二叉搜索树Binary Search Tree，也称为二叉排序树、有序二叉树（Sorted Binary Tree）
- 可以是空树
- 左子树上所有结点的值均小于它的根节点的值
- 右子树上所有结点的值均大于它的根结点的值
- 左右子树也分别为二叉搜索树
- 中序遍历：升序排列  

2. 二叉搜索树常见操作
- 查询 O(logn)
- 插入新结点 O(logn)
- 删除 如果不是叶子结点取紧邻且大于的结点
- 递归和循环时间复杂度差不多
3. 代码

```
// 结点定义
public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
```
4.遍历
- 中序遍历

```Java
// 递归
public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<Integer>();
        inorder(root, res);
        return res;
    }

    public void inorder(TreeNode root, List<Integer> res) {
        if (root == null){
            return;
        }
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right,res);
    }
    
// 迭代
public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<Integer>();
    Deque<TreeNode> stk = new LinkedList<TreeNode>();
    while (root != null || !stk.isEmpty()) {
        while (root != null) {
            stk.push(root);
            root  = root.left;
        }
        root = stk.pop();
        res.add(root.val);
        root = root.right;
    }
    return res;
}

// 莫里斯morris遍历

```






todo  
- [x] 遍历的写法  
- [x] 思考题
树的面试题解法一般都是递归，为什么？  
答: 
1. 没有一个后继或者便于循环的结构  
2. 递归的三大特点：问题可分解成若干个重复子问题、问题与子问题可用相同算法解决、明确终止条件。树的每个非叶子结点的子节点也都是一棵树，所以可由用相同算法解决，树没有环，所有天然具有终止条件。
3. 树是非线性数据结构，循环遍历比较不容易

### 堆 Heap
Heap: 可以迅速找到一堆数中的最大或者最小值的数据结构

将根节点最大的堆叫做大顶堆或大根堆，根节点最小的堆叫做小顶堆或小根堆，常见的堆有二叉堆、斐波那契堆。

二叉堆：常用  
斐波那契堆：基于树实现，不用知道具体实现，

大顶堆：
find-max: O(1)
delete-max: O(logN)
insert(create): O(logN) or O(1)(斐波那契堆)  

了解一下堆定义
堆的实现有很多种，二叉堆实现比较容易。知道有严格的斐波那契堆这些东西。

##### 二叉堆性质
通过完全二叉树来实现，不是二叉搜索树
二叉堆满足以下性质：
1.是一棵完全树
2.书中任意节点的值总是 >= 子节点的值，根节点最大结点

二叉堆  
0.根节点(顶堆元素)是：a[0]  
1.索引为i的左孩子索引为(2i+1);  
2.索引为i的右孩子索引为(2i+2);
3.索引为i的父结点的索引为floor((i-1)/2) 取整

##### Insert 插入操作 O(logN)
1. 新元素一律先插到堆的尾部
2. 依次向上调整整个堆的结构(一直到根即可) HeapifyUp

##### Delete Max 删除堆顶操作O(logN)  
1. 将堆尾元素替换到顶部(堆顶被替代删除掉)
2. 依次从根部向下调整整个堆的结构(一直到堆尾即可) 
HeapifyDown  

3. ==二叉堆是堆(优先队列priority_queue)的一种常见且简单的实现，但是并不是最优的实现==
4. 工程里使用直接用队列priority_queue就可以
5. ==sort的时间复杂度为nlogn==
6. 大顶堆的定义

```
PriorityQueue<Integer> maxPQ = new PriorityQueue<>((o1, o2) -> (o2 - o1))
```

7. 


  
    
    todo：取整怎么四舍五入，包括说
    
