# [Leaders in an Array](https://takeuforward.org/practice/dsa/leaders-in-an-array?source=planly&planly_plan=striving-sde&planly_task_id=6118923&planly_day_id=718867&planly_session_id=62789&tab=solution&solution=optimal)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given an integer array **nums** , return a list of all the leaders in the array.

A leader in an array is an element whose value is **strictly** greater than all elements to its right in the given array. The rightmost element is always a leader. The elements in the leader array must appear in the **order they appear** in the nums array.

### Example 1:

**Input:** nums = [1, 2, 5, 3, 1, 2]

**Output:** [5, 3, 2]

**Explanation:**

2 is the rightmost element, 3 is the largest element in the index range [3, 5], 5 is the largest element in the index range [2, 5]

### Example 2:

**Input:** nums = [-3, 4, 5, 1, -4, -5]

**Output:** [5, 1, -4, -5]

**Explanation:**

-5 is the rightmost element, -4 is the largest element in the index range [4, 5], 1 is the largest element in the index range [3, 5] and 5 is the largest element in the range [2, 5]

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= nums.length <= 10^5
- -10^4 <= nums[i] <= 10^4

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
