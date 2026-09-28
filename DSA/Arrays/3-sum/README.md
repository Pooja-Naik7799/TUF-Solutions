# [3 Sum](https://takeuforward.org/practice/dsa/3-sum?source=planly&planly_plan=striving-sde&planly_task_id=6118951&planly_day_id=718869&planly_session_id=135694&subject=array&solution=optimal)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given an integer array **nums** . Return all triplets such that:

- i != j, i != k, and j != k

- nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets. One element can be a part of multiple triplets. The output and the triplets can be returned in any order.

### Example 1:

**Input:** nums = [2, -2, 0, 3, -3, 5]

**Output:** [[-2, 0, 2], [-3, -2, 5], [-3, 0, 3]]

**Explanation:**

nums[1] + nums[2] + nums[0] = 0

nums[4] + nums[1] + nums[5] = 0

nums[4] + nums[2] + nums[3] = 0

### Example 2:

**Input:** nums = [2, -1,&nbsp;-1, 3, -1]

**Output:** [[-1, -1, 2]]

**Explanation:**

nums[1] + nums[2] + nums[0] = 0

Note that we have used two -1s as they are separate elements with different indexes

But we have not used the -1 at index 4 as that would create a duplicate triplet

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= nums.length <= 3000
- -10^4 <= nums[i] <= 10^4

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
