# Binary_Searchs
This laboratory activity focuses on using recursion in Binary Search. The program is based on the instructor's code and was changed to accept user input. It also shows the low, high, and mid values during each recursive call. The program displays the index if the target is found or -1 if it is not.

## Programming Language
Java (JDK 21)

## How to Compile and Run
javac Binary_search.java
java Binary_search

## Sample Input and Output
```
Enter the number of elements: 7
Enter 7 numbers in sorted (ascending) order:
Element 1: 40
Element 2: 10
Element 3: 70
Element 4: 20
Element 5: 50
Element 6: 30
Element 7: 60
Sorted array: 10 20 30 40 50 60 70

Enter a number to search: 50

Trace
bSearch(low=0, high=6) -> mid=3, arr[mid]=40
50 > 40 -> search right half
bSearch(low=4, high=6) -> mid=5, arr[mid]=60
50 < 60 -> search left half
bSearch(low=4, high=4) -> mid=4, arr[mid]=50
arr[4] == 50 -> found!

Target found.
Index: 4
