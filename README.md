# Mini Splitwise (Java Project)

## Overview

This project is a simple Java-based implementation of an expense sharing system similar to Splitwise. It helps users split expenses and track who owes whom.

## Objective

The main goal of this project is to simplify group expense management by:

- Recording expenses
- Splitting them equally among users
- Displaying balances in a clear format

## Technologies Used

- Java (Core Java)
- VS Code
- Git & GitHub

## Project Structure

- `User.java` → Stores user details
- `Expense.java` → Stores expense information
- `SplitwiseService.java` → Handles logic and balance calculation
- `Main.java` → User interaction and menu system

## Features

- Add multiple users
- Add expenses with payer and participants
- Equal expense splitting
- View balances (who owes whom)
- Menu-driven interface

## How to Run

1. Compile all files:

   ```
   javac *.java
   ```

2. Run the program:

   ```
   java Main
   ```

## Sample Output

```
Enter number of users:
3

Enter name of user 1: A
Enter name of user 2: B
Enter name of user 3: C

B owes A: 100.0
C owes A: 100.0
```

## Future Enhancements

- Unequal expense splitting
- Settle payments feature
- Graphical User Interface (GUI)
- Data storage using files or database

## Author

Vanshika Agrawal
