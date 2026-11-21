# Day 10 – Task 2: Palindrome Number

## Project Overview

This Java program checks whether a given number is a palindrome or not. A palindrome number remains the same when its digits are reversed.

For example:
- 121 → Palindrome Number
- 123 → Not a Palindrome Number
-  madam is a word palindrome, while 454 is a number palindrome.

## Technology Used

- **Programming Language:** Java
- **IDE:** Eclipse

## Project Structure

```text
Day10-Tasks/
└── Task2/
    ├── PalindromeNumber.java
    └── Output_Screenshot/
```

## Program Description

The Palindrome Number program takes a number as input and checks whether the original number and its reverse are equal.

### How the Program Works

1. Get a number from the user.
2. Store the original number for comparison.
3. Extract the last digit using the modulus operator.
4. Reverse the number by multiplying the current reverse value by 10 and adding the extracted digit.
5. Remove the last digit using the division operator.
6. Repeat the process until the number becomes zero.
7. Compare the reversed number with the original number.
8. Display whether the given number is a palindrome or not.

## Example Output

**Example 1:**

```text
Enter a number: 121
121 is a Palindrome Number
```

**Example 2:**

```text
Enter a number: 123
123 is not a Palindrome Number
```

## Java Concepts Practiced

- Scanner class for user input
- Variables and data types
- While loop
- If-else condition
- Modulus (%) operator
- Division (/) operator
- Number reversal logic

## Learning Outcome

Through this program, I practiced reversing a number using loops and arithmetic operators. I also learned how to compare the original number with its reversed value to identify a palindrome number.

## Author

**Munera-06**  
[GitHub Profile](https://github.com/Munera-06)
