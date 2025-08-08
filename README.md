# RPG GAME

Java console applications thats simulates an old school RPG game traversing in a map and fighting monster. 

## Overview

- ** ** — Performs binary multiplication using 2D arrays and grid-based calculation
- **Binary Addition Calculator** — Performs binary addition with custom carry-over logic

Both calculators implement binary arithmetic rules manually without using built-in conversion methods.

## Installation

```bash
# Clone the repository
git clone https://github.com/yourusername/Binary_Exercises.git
cd Binary_Exercises

# Compile and run
javac -d out src/main/java/Binary_Exercise1/*.java
javac -d out src/main/java/Binary_Exercise2/*.java

java -cp out Binary_Exercise1.Binary_Addiction
java -cp out Binary_Exercise2.Binary_Calculator_Multiplication
```

## Features

#### Binary Arithmetic Rules

| **Addition Rules** | **Multiplication Rules** |
|-------------------|-------------------------|
| `0 + 0 = 0`       | `0 × 0 = 0`            |
| `0 + 1 = 1`       | `0 × 1 = 0`            |
| `1 + 0 = 1`       | `1 × 0 = 0`            |
| `1 + 1 = 0 (carry 1)` | `1 × 1 = 1`        |


### Binary Addition
- Manual binary addition with proper carry-over handling
- Processes multi-digit binary numbers
- Example: `101111 + 111 = 110110`

### Binary Multiplication
- Grid-based multiplication using 2D arrays
- Interactive user input
- Visual display of calculation steps
- Example: `111 × 110 = 101010`

## Screenshots
![Start of Gamen](/docs/Start_of_Game.PNG)

![Movement](/docs/Movement.PNG)

![Combat](/docs/Combat.PNG)


## Technologies

- Java
- Scanner for user input
- Maven
- Git for version control and different features

## License

This project is licensed under the MIT License.

