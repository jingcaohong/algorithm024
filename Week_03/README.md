学习笔记

#### 递归 Recursion
递归代码模板

```
// Java
public void recur(int level, int param) { 
  // terminator 递归终止点
  if (level > MAX_LEVEL) { 
    // process result 
    return; 
  }
  // process current logic 
  process(level, param); 
  // drill down 
  recur( level: level + 1, newParam); 
  // restore current status 
}
```
递归：
1. 本质是循环
2. 通过函数体来进行的循环

注意点：
1. 抵制人肉递归
2. 找最近重复性
3. 数学归纳法







---
树的面试题解法一般都是递归  
BST的中序遍历是有序递增的  
char[] chars = s.toCharArray();  
f (chars[i] == ' ')




分治和回溯其实就是特殊的递归  
的

重复性

分治代码模板

```python
def divide_conquer(problem, p1, p2, ...):
    # recursion terminator
    if problem is None:
        print_result
        return
    # prepare data
    data = prepare_data(problem)
    subproblems = split_problem(problem, data)
    # conquer subproblems
    subresult1 = self.divide_conquer(subproblems[0], p1, ...)
    subresult2 = self.divide_conquer(subproblems[1], p1, ...)
    ...
    # process and generate the final result
    result = process_result(subresult1, subresult2, ...)
    
```

数组是引用传递的，注意分支污染
