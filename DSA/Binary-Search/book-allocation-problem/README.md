# [Book Allocation Problem](https://takeuforward.org/practice/dsa/book-allocation-problem?category=faqs&source=strivers-a2z-dsa-sheet&solution=binary-search)

![Difficulty: Pro](https://img.shields.io/badge/Difficulty-Pro-ef4444?style=for-the-badge)

---

## 📝 Problem Statement

Given an array nums of n integers, where nums[i] represents the number of pages in the i-th book, and an integer m representing the number of students, allocate all the books to the students so that each student gets at least one book, each book is allocated to only one student, and the allocation is contiguous.

Allocate the books to m students in such a way that the **maximum number of pages** assigned to a student is minimized. If the allocation of books is not possible, return -1.

### Example 1:

Input: nums = [12, 34, 67, 90], m=2

Output: 113

Explanation: The allocation of books will be 12, 34, 67 | 90. One student will get the first 3 books and the other will get the last one.

### Example 2:

Input:&nbsp;nums = [25, 46, 28, 49, 24], m=4

Output: 71

Explanation: The allocation of books will be 25, 46 | 28 | 49 | 24.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- &nbsp;&nbsp;1 <= n, m <= 10^4
- &nbsp;&nbsp;1 <= nums[i] <= 10^5

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
