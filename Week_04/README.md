学习笔记
## 第9课 深度优先搜索、广度优先搜索
深度优先搜索DFS代码模板

```
    public List<List<Integer>> levelOrder(TreeNode root) {        List<List<Integer>> allResults = new ArrayList<>();        if(root==null){            return allResults;        }        travel(root,0,allResults);        return allResults;    }    private void travel(TreeNode root,int level,List<List<Integer>> results){        if(results.size()==level){            results.add(new ArrayList<>());        }        results.get(level).add(root.val);        if(root.left!=null){            travel(root.left,level+1,results);        }        if(root.right!=null){            travel(root.right,level+1,results);        }    }
```

## 第10课 贪心的实现、特性及实战题目解析
### 贪心算法Greedy
贪心算法是一种在每一步选择中都采取在当前状态下最好或最优的选择，从而希望导致结果是全局最好的算法  

贪心算法和动态规划的不同在于贪心算法对每个子问题的解决方案都做出选择，不能回退。动态规划则会保存以前的运算结果，并根据以前的结果对当前进行选择，有回退功能。  

贪心：当下做局部最优判断  
回溯：能够回退  
动态规划： 最优判断+回退


想清楚局部最优，想清楚全局最优，感觉局部最优是可以推出全局最优，并想不出反例，那么就试一试贪心


## 第11课 二分查找
二分查找的前提
1. 目标函数单调性(单调递增或递减)
2. 存在上下界(bounded)
3. 能够通过索引访问(index accessible)

```

```



---
递归模板
动态规划模板
分治回溯模板
二分查找模板