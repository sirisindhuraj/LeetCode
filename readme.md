# Valid Anagram Checker

## Problem Description
Given two strings `s` and `t`, determine whether `t` is an anagram of `s`.

An anagram is formed by rearranging the letters of a word using all the original characters exactly once.

## Approach
- First, check if both strings have the same length. If not, they cannot be anagrams.
- Convert both strings to lowercase to ensure case-insensitive comparison.
- Use a frequency counting technique to track the occurrence of each character.
- Increment the count for characters in the first string.
- Decrement the count for characters in the second string.
- If all counts return to zero, the strings are anagrams.

---

## Technologies Used
- Java
- Core Java standard library

---

## Libraries Used
- `java.lang` (default Java package)
- `java.util` (for basic utilities)

---

## Methods Used
- `length()` to compare string lengths
- `toCharArray()` to iterate through characters
- `toLowerCase()` to handle case insensitivity
- Frequency array technique for character counting

---

## Complexity Analysis
- Time Complexity:** O(n), where n is the length of the string
- Space Complexity:** O(1), since a fixed-size array is used

---

## Example
Input: 
`s = "listen"`  
`t = "silent"`

Output:  
`true`
