# Super Mario - LRTA* Pathfinding

A grid-based pathfinding game where an agent navigates to find food while avoiding obstacles using the LRTA* (Learning Real-Time A*) algorithm. (This project is also a part of the [Artificial Intelligence Course](https://github.com/zamirmehdi/Artificial-Intelligence-Course) repository.)

[![Python](https://img.shields.io/badge/Python-3.x-blue.svg)](https://www.python.org/)
[![AI](https://img.shields.io/badge/AI-Heuristic%20Search-green.svg)](#)

<details> <summary><h2>📚 Table of Contents</h2></summary>

- [Project Overview](#-project-overview)
- [LRTA* Algorithm](#-lrta-algorithm)
  - [Algorithm Characteristics](#algorithm-characteristics)
  - [How LRTA* Works](#how-lrta-works)
- [Project Structure](#️-project-structure)
- [Files Description](#-files-description)
- [Requirements](#️-requirements)
- [How to Run](#-how-to-run)
- [Input/Output](#-inputoutput)
- [Key Features](#-key-features)
- [Concepts Demonstrated](#-concepts-demonstrated)
- [Algorithm Complexity](#-algorithm-complexity)
- [Customization](#-customization)
- [Documentation](#-documentation)
- [References](#-references)
- [Project Information](#ℹ️-project-information)
- [Related Projects](#-related-projects)
- [Contact](#-contact)
</details>

## 📋 Project Overview

This project implements a real-time search algorithm to solve a navigation problem in a grid-based environment. The agent (Mario) must find food items while avoiding obstacles, making real-time decisions with limited computational resources.

## 🧠 LRTA* Algorithm

**Learning Real-Time A*** is a heuristic search algorithm that combines:
- **Real-time decision making** - Makes moves without complete path planning
- **Online learning** - Updates heuristic values based on experience
- **Limited lookahead** - Explores only a few steps ahead per move

### Algorithm Characteristics

| Feature | Description |
|---------|-------------|
| **Type** | Real-time heuristic search |
| **Learning** | Updates heuristic values during execution |
| **Completeness** | Yes (eventually finds solution) |
| **Optimality** | Converges to optimal over multiple trials |
| **Use Case** | Dynamic environments, time-constrained decisions |

### How LRTA* Works

1. **Lookahead:** Examine neighboring states within lookahead limit
2. **Heuristic Update:** Update current state's heuristic based on neighbors
3. **Move Selection:** Choose action leading to state with lowest f-value
4. **Learning:** Store updated heuristic for future reference
5. **Repeat:** Continue until goal is reached

## 🗂️ Project Structure

```
Super-Mario-Project/
├── main.py              # LRTA* implementation
├── Mario.txt            # Grid configuration file
└── Instruction.pdf      # Problem specification
```

## 📄 Files Description

### `main.py`
Core implementation containing:
- LRTA* algorithm
- Grid parsing and representation
- Heuristic function (Manhattan distance)
- State management
- Action selection logic
- Visualization/output

### `Mario.txt`
Grid configuration file defining:
- Grid dimensions (m × n)
- Start position (Mario's initial location)
- Goal positions (food locations)
- Obstacles (walls, barriers)
- Empty spaces (traversable cells)

**Example Format:**
```
# - Empty space
M - Mario (start position)
F - Food (goal)
X - Obstacle
```

## ⚙️ Requirements

- Python 3.x
- No external libraries required (uses standard library only)

## 🚀 How to Run

```bash
# Navigate to project directory
cd Super-Mario-Project

# Run the LRTA* solver
python main.py
```

## 📊 Input/Output

### Input (`Mario.txt`)
- Grid layout with start, goals, and obstacles
- Grid dimensions
- Initial state configuration

### Output
- Path taken by the agent
- Number of moves
- Final heuristic values
- Solution visualization (grid display)
- Learning statistics

### Example Output
```
Move 1: (0,0) -> (0,1)
Move 2: (0,1) -> (1,1)
...
Food found at position (3,4)
Total moves: 15
```

## 🎯 Key Features

### Heuristic Function
- **Manhattan Distance:** `h(n) = |x_goal - x_current| + |y_goal - y_current|`
- Admissible and consistent
- Updates based on actual path costs

### Obstacle Avoidance
- Detects blocked paths
- Finds alternative routes
- Handles dead-ends

### Real-Time Performance
- Makes immediate decisions
- Limited computational overhead per move
- Suitable for time-sensitive applications

### Learning Capability
- Improves performance over multiple trials
- Stores learned heuristic values
- Converges toward optimal solution

## 🎓 Concepts Demonstrated

### Heuristic Search
- A* algorithm foundation
- Heuristic function design
- f-value calculation (f = g + h)

### Real-Time AI
- Online search and planning
- Time-bounded decision making
- Interleaving planning and execution

### Machine Learning
- Reinforcement of heuristic values
- Experience-based improvement
- Convergence properties

### Problem Solving
- Grid-based pathfinding
- State space representation
- Action space definition
- Goal recognition

## 📈 Algorithm Complexity

| Aspect | Complexity |
|--------|------------|
| **Time per move** | O(k) where k = lookahead depth |
| **Space** | O(n) where n = number of unique states visited |
| **Convergence** | Polynomial in the worst case |

## 🔧 Customization

You can modify the following in the code:
- Grid size and layout (`Mario.txt`)
- Heuristic function
- Lookahead depth
- Learning rate for heuristic updates

## 📖 Documentation

Detailed problem specification available in:
- `Instruction.pdf` (project requirements and specifications)

## 📚 References

- **Korf, R. E.** (1990). "Real-time heuristic search." *Artificial Intelligence, 42*(2-3), 189-211.
- Russell, S., & Norvig, P. (2020). *Artificial Intelligence: A Modern Approach* (4th ed.).

## ℹ️ Project Information

**Author:** Amirmehdi Zarrinnezhad  
**Course:** Artificial Intelligence  
**University:** Amirkabir University of Technology (Tehran Polytechnic) - Spring 2020  
**GitHub:** [zamirmehdi/AI-Project-Super-Mario](https://github.com/zamirmehdi/AI-Project-Super-Mario)

## 🔗 Related Projects

This project is part of the [Artificial Intelligence Course](https://github.com/zamirmehdi/Artificial-Intelligence-Course) repository.

**Other AI Projects:**
- [Students Lineup](https://github.com/zamirmehdi/Artificial-Intelligence-Course/tree/main/Students-Lineup-Project) - DFS and Bidirectional Search
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
