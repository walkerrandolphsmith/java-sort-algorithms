Quick Sort
---------- 
Best O(n log n) : Worst O(n^2)

Determine pivot by arbitrarily chose an element from the list. 

Partition the set by adding elements with values less than the pivot to S1 and elements with values greater than the pivot to s2. All elements of s1 preceed the pivot and all elements of s2 come after the pivot.

Recursively sort partitions containing lesser elements and greater elements. 

