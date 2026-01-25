# Day 03 – Move Zeroes (DSA Challenge)

## 📌 Problem
Given an integer array `nums`, move all `0`s to the end of the array while maintaining the relative order of the non-zero elements.

🔗 LeetCode Problem: Move Zeroes (283)

---

## 🧠 Approach
- Traverse the array and copy all non-zero elements to the front.
- Keep track of the index where the next non-zero element should be placed.
- After traversal, fill the remaining positions with zeroes.

This approach modifies the array **in-place** and preserves order.

---

## ⏱️ Complexity
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

---

## 💻 Java Solution

```java
public class MoveZeroes {

    static void moveZeroes(int[] nums){
        int n = nums.length;
        int count = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                nums[count++] = nums[i];
            }
        }

        while(count < n){
            nums[count++] = 0;
        }

        for(int arr : nums){
            System.out.print(arr + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
    }
}
