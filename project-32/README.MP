# Truth Table Generator

## About

Truth Table Generator is a simple beginner-level Java project for ECE students.

It generates truth tables for basic digital logic gates.

## Supported Gates

1. AND
2. OR
3. XOR
4. NAND
5. NOR

## How It Works

The user selects a logic gate.

The program generates all four possible combinations of two inputs:

A = 0, B = 0
A = 0, B = 1
A = 1, B = 0
A = 1, B = 1

The output is calculated according to the selected logic gate.

## Example

For AND:

A B | Y
0 0 | 0
0 1 | 0
1 0 | 0
1 1 | 1

## How to Run

Compile:

javac TruthTable.java

Run:

java TruthTable

## Concepts Used

- Java
- Scanner
- for loops
- if-else
- Bitwise operators
- Logic gates
- Truth tables

## Project Structure

Truth-Table-Generator/
├── TruthTable.java
├── README.md
└── output.txt

## Future Improvements

- Add NOT gate
- Add XNOR gate
- Add 3-input gates
- Add custom Boolean expressions
- Add graphical interface

## Author

Beginner ECE Java Project