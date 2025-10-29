<h1 align="center">Artificial Intelligence Course</h1>

<details> <summary><h2>📚 Table of Contents</h2></summary>

- [Overview](#-overview)
- [Projects](#-projects)
  - [1. Students Lineup Problem](#1-students-lineup-problem)
  - [2. Super Mario LRTA*](#2-super-mario-lrta)
  - [3. NLP Trigram Model](#3-nlp-trigram-model)
- [Technologies Used](#%EF%B8%8F-technologies-used)
- [Installation & Setup](#%EF%B8%8F-installation--setup)
- [Learning Outcomes](#-learning-outcomes)
- [Project Information](#%E2%84%B9%EF%B8%8F-project-information)
- [Contact](#-contact)

</details>

## 📘 Overview

A collection of **3 projects** implementing core Artificial Intelligence algorithms and techniques. Projects range from classical search algorithms (DFS, Bidirectional Search) to heuristic search (LRTA*) and Natural Language Processing (Trigram Model).

| Project | Description | Technologies |
|----------|--------------|--------------|
| [Students-Lineup-Search-Project](https://github.com/zamirmehdi/Artificial-Intelligence-Course/tree/main/Students-Lineup-Search-Project) | Solves the student lineup optimization problem using Depth-First Search (DFS) and Bidirectional Search. Demonstrates classical graph-based search and constraint satisfaction in Java. | Java |
| [AI-Super-Mario-LRTAStar-Pathfinding](https://github.com/zamirmehdi/AI-Super-Mario-LRTAStar-Pathfinding) | A grid-based pathfinding simulation where an agent (Mario) navigates toward goals using the LRTA* (Learning Real-Time A*) algorithm. Implements heuristic search and real-time learning. | Python |
| [AI-NLP-NGram](https://github.com/zamirmehdi/AI-NLP-NGram) | A statistical Persian language model based on n-grams (trigrams) for text prediction and sentence completion. Implements text preprocessing, probability estimation, and model evaluation. | Python |


**Key Topics:**
- Search Algorithms (DFS, Bidirectional Search)
- Heuristic Search (LRTA*)
- Natural Language Processing (N-gram Models)
- Problem Solving and Path Planning
- Text Prediction and Generation

[![Python](https://img.shields.io/badge/Python-3.x-blue.svg)](https://www.python.org/) [![Java](https://img.shields.io/badge/Java-8+-orange.svg)](https://www.java.com/) [![License](https://img.shields.io/badge/License-Educational-lightgrey.svg)](#license)

## 🤖 Projects

### 1. Students Lineup Problem
**Description:** Implementation of search algorithms to solve the student lineup problem - arranging students in an optimal order based on specific constraints.

**Algorithms Implemented:**
- **Depth-First Search (DFS)** - Explores paths deeply before backtracking
- **Bidirectional Search** - Searches simultaneously from start and goal states

**Key Concepts:**
- Graph search algorithms
- State space exploration
- Search tree generation
- Optimal solution finding

**Language:** Java

📁 **Path:** `Students-Lineup-Project/`  
📄 **Source Files:**
- `src/Problem 1 - DFS.java`
- `src/Problem 3 - Bidirectional.java`

📋 **Documentation:** `docs/Instruction.pdf` (Persian)

---

### 2. Super Mario LRTA*
**Description:** A game AI that navigates a grid-based environment to find food while avoiding obstacles using the LRTA* (Learning Real-Time A*) algorithm.

**Features:**
- Real-time pathfinding in dynamic environments
- Obstacle avoidance
- Heuristic-based decision making
- Learning from exploration

**Algorithm:** LRTA* (Learning Real-Time A*)
- Combines A* search with online learning
- Makes real-time decisions with limited lookahead
- Updates heuristic values based on experience

**Key Concepts:**
- Heuristic search
- Real-time planning
- Grid-based pathfinding
- Agent-based navigation

**Language:** Python

📁 **Path:** `Super-Mario-Project/`  
🔗 **Detailed Repository:** [AI-Project-Super-Mario](https://github.com/zamirmehdi/AI-Project-Super-Mario)

📄 **Files:**
- `main.py` - LRTA* implementation
- `Mario.txt` - Grid configuration
- `Instruction.pdf` - Problem description

---

### 3. NLP Trigram Model
**Description:** A Natural Language Processing system that predicts and completes sentences using a trigram language model trained on Persian text.

**Features:**
- N-gram language modeling (Trigram)
- Text prediction and completion
- Probability-based word selection
- Persian language support

**Key Concepts:**
- Statistical language modeling
- N-gram probabilities
- Text generation
- Natural language prediction
- Markov assumption

**Implementation Details:**
- Trains on Persian text corpus
- Calculates trigram probabilities
- Predicts next words based on context
- Generates coherent sentence completions

**Language:** Python

📁 **Path:** `NLP-Project/`  
🔗 **Detailed Repository:** [AI_Final_Project-NLP](https://github.com/zamirmehdi/AI_Final_Project-NLP)

📄 **Files:**
- `main.py` - Trigram model implementation
- `Train_data.txt` - Training corpus
- `Test_data.txt` - Test cases
- `labels.txt` - Expected outputs
- `Instruction NLP.pdf` - Project specification

---

## 🛠️ Technologies Used

| Category | Technologies |
|----------|-------------|
| **Languages** | Python 3.x, Java 8+ |
| **AI Techniques** | Search Algorithms, Heuristic Search, NLP |
| **Algorithms** | DFS, Bidirectional Search, LRTA*, N-gram |
| **Data Structures** | Graphs, Trees, Hash Tables |
| **NLP** | Trigram Model, Language Modeling |

## ⚙️ Installation & Setup

### Prerequisites
- Python 3.x
- Java JDK 8+

### Clone Repository

```bash
# Clone with submodules
git clone --recursive https://github.com/zamirmehdi/Artificial-Intelligence-Course.git
cd Artificial-Intelligence-Course

# Or if already cloned, initialize submodules
git submodule update --init --recursive
```

### Running Projects

#### Students Lineup (Java)
```bash
cd Students-Lineup-Project/src
javac "Problem 1 - DFS.java"
java Problem1DFS

javac "Problem 3 - Bidirectional.java"
java Problem3Bidirectional
```

#### Super Mario LRTA* (Python)
```bash
cd Super-Mario-Project
python main.py
```

#### NLP Trigram Model (Python)
```bash
cd NLP-Project
python main.py
```

## 🎓 Learning Outcomes

### **Search Algorithms**
- Understanding uninformed search (DFS)
- Bidirectional search optimization
- State space representation
- Search complexity analysis

### **Heuristic Search**
- Real-time search algorithms
- Heuristic design and evaluation
- LRTA* algorithm implementation
- Online learning in search

### **Natural Language Processing**
- Statistical language modeling
- N-gram probability calculations
- Text generation techniques
- Handling natural language data

### **Problem Solving**
- Algorithm design and analysis
- Performance optimization
- Data structure selection
- Debugging and testing

### **Implementation Skills**
- Multi-language development (Python, Java)
- Working with text data
- Algorithm implementation from theory
- Code organization and documentation

## ℹ️ Project Information

**Author:** Amirmehdi Zarrinnezhad  
**Course:** Artificial Intelligence  
**University:** Amirkabir University of Technology (Tehran Polytechnic) - Spring 2020  
**Repository:** [zamirmehdi/Artificial-Intelligence-Course](https://github.com/zamirmehdi/Artificial-Intelligence-Course)

### Project Repositories

This repository contains Git submodules linking to detailed project repositories:
- **Super Mario LRTA*:** [AI-Project-Super-Mario](https://github.com/zamirmehdi/AI-Project-Super-Mario)
- **NLP Trigram Model:** [AI_Final_Project-NLP](https://github.com/zamirmehdi/AI_Final_Project-NLP)

## 📧 Contact

Questions or collaborations? Feel free to reach out!

**📧 Email:** amzarrinnezhad@gmail.com  
**🌐 GitHub:** [@zamirmehdi](https://github.com/zamirmehdi)

---

<p align="right">(<a href="#top">back to top</a>)</p>

<div align="center">

⭐ **If you found this project helpful, please consider giving it a star!** ⭐

*Amirmehdi Zarrinnezhad*

</div>
