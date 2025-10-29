# Students Lineup Problem - Search Algorithms

Implementation of classical search algorithms to solve the student lineup optimization problem. (This project is also a part of the [Artificial Intelligence Course](https://github.com/zamirmehdi/Artificial-Intelligence-Course) repository.)

[![Java](https://img.shields.io/badge/Java-8+-orange.svg)](https://www.java.com/)
[![AI](https://img.shields.io/badge/AI-Search%20Algorithms-blue.svg)](#)

## 📋 Problem Description

The goal is to arrange students in an optimal lineup order based on specific constraints and relationships. This problem demonstrates the application of graph search algorithms to solve constraint satisfaction problems.

## 🔍 Implemented Algorithms

### 1. Depth-First Search (DFS)
**File:** `Problem 1 - DFS.java`

**Description:**
- Explores the search space by going as deep as possible before backtracking
- Uses a stack-based approach (implicit through recursion)
- Guarantees finding a solution if one exists

**Characteristics:**
- **Completeness:** Yes (for finite state spaces)
- **Optimality:** No (may not find the shortest path)
- **Time Complexity:** O(b^m) where b is branching factor, m is maximum depth
- **Space Complexity:** O(bm)

**Implementation Features:**
- State space representation
- Visited state tracking
- Path reconstruction
- Solution validation

---

### 2. Bidirectional Search
**File:** `Problem 3 - Bidirectional.java`

**Description:**
- Searches simultaneously from both the initial state and goal state
- Meets in the middle to find the solution
- More efficient than unidirectional search for many problems

**Characteristics:**
- **Completeness:** Yes
- **Optimality:** Yes (if both searches are breadth-first)
- **Time Complexity:** O(b^(d/2)) - significantly better than DFS
- **Space Complexity:** O(b^(d/2))

**Advantages:**
- Reduced search depth
- Faster solution finding
- Lower memory requirements compared to single-direction BFS

## 🗂️ Project Structure

```
Students-Lineup-Project/
├── docs/
│   └── Instruction.pdf          # Problem specification (Persian)
└── src/
    ├── Problem 1 - DFS.java     # DFS implementation
    └── Problem 3 - Bidirectional.java  # Bidirectional search
```

## ⚙️ Requirements

- Java JDK 8 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code) or command line

## 🚀 How to Run

### Using Command Line

```bash
# Navigate to source directory
cd src

# Compile DFS solution
javac "Problem 1 - DFS.java"
java Problem1DFS

# Compile Bidirectional Search solution
javac "Problem 3 - Bidirectional.java"
java Problem3Bidirectional
```

### Using IDE

1. Open the project in your Java IDE
2. Navigate to the desired Java file
3. Run the main method

## 📊 Input/Output

**Input:**
- Student constraints and relationships
- Initial state configuration
- Goal state specification

**Output:**
- Optimal or feasible lineup arrangement
- Number of states explored
- Solution path (if found)
- Search statistics

## 🎓 Key Concepts Demonstrated

### Graph Search
- State space representation
- Node expansion and exploration
- Visited state management
- Path tracking and reconstruction

### Algorithm Design
- Stack-based depth-first exploration
- Bidirectional search strategy
- Meeting point detection
- Solution validation

### Problem Solving
- Constraint satisfaction
- Search space pruning
- Performance optimization
- Complexity analysis

## 📖 Documentation

Detailed problem specification and requirements are available in:
- `docs/Instruction.pdf` (in Persian)

## ℹ️ Project Information

**Author:** Amirmehdi Zarrinnezhad  
**Course:** Artificial Intelligence  
**University:** Amirkabir University of Technology (Tehran Polytechnic) - Spring 2020  
**GitHub:** [Students-Lineup-Project](https://github.com/zamirmehdi/Artificial-Intelligence-Course/tree/main/Students-Lineup-Project)

## 🔗 Related Projects

This project is part of the [Artificial Intelligence Course](https://github.com/zamirmehdi/Artificial-Intelligence-Course) repository.

**Other AI Projects:**
- [Super Mario LRTA*](https://github.com/zamirmehdi/AI-Project-Super-Mario) - Heuristic pathfinding
- [NLP Trigram Model](https://github.com/zamirmehdi/AI_Final_Project-NLP) - Natural language processing

## 📧 Contact  
Questions or collaborations? Feel free to reach out!

**📧 Email:** amzarrinnezhad@gmail.com  
**🌐 GitHub:** [@zamirmehdi](https://github.com/zamirmehdi)

---

<div align="center">

[⬆ Back to Main Repository](https://github.com/zamirmehdi/Artificial-Intelligence-Course)

<p align="right">(<a href="#top">back to top</a>)</p>
</div>

<div align="center">

⭐ **If you found this project helpful, please consider giving it a star!** ⭐

*Amirmehdi Zarrinnezhad*

</div>
