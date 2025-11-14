# Rabin–Karp String Search (Java, Maven Project)

This project contains an implementation of the Rabin–Karp substring search algorithm using a polynomial rolling hash.  
The goal was to pick one string-processing algorithm, implement it, and test how it behaves on inputs of different lengths.

The project is built with Maven and includes example input files, source code, and a summary of the results.

# Why I chose that algorithm?
- The idea behind the rolling hash is easy to understand.
- The code is shorter compared to Aho–Corasick or Suffix Array.
- It’s simple to test with different files.
- Good balance between clarity and performance.

# How algorithm works?
Rabin–Karp compares substrings by using integer hashes instead of checking characters one by one.
1. Compute the hash of the pattern.
2. Compute the hash of the first window of text with the same length.
3. Slide the window across the text:
   - update the hash in O(1),
   - compare hashes,
   - if equal → verify by comparing the substring.

# Testing
Three files are used in project: 

### **Short input**  
Length: ~20–30 characters  
Result: pattern found quickly at a small index.

### **Medium input**  
Length: a few hundred characters  
The search time was still instant.

### **Long input**  
Length: several thousand characters  
Rabin–Karp handled it without noticeable delay. 

## Time and Space Complexity

**Time complexity**  
- Average & best case: **O(n)**  
- Worst case: **O(n · m)** (only if all hashes collide, which is rare with a good modulus)

**Space complexity**  
- Extra memory: **O(1)**  
- Input strings depend on file size.

