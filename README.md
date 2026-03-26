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

Enter name of user 1: Alice
Enter name of user 2: Bob
Enter name of user 3: Charlie

--- MENU ---

1. Add Expense
2. Show Balances
3. Exit

Enter choice: 1
Who paid? Alice
Enter amount: 300
Enter participants (space separated names):
Alice Bob Charlie

Expense added successfully!

--- MENU ---

1. Add Expense
2. Show Balances
3. Exit

Enter choice: 2

Bob owes Alice: 100.0
Charlie owes Alice: 100.0

--- MENU ---

1. Add Expense
2. Show Balances
3. Exit

Enter choice: 3
Exiting...

```

## Future Enhancements

- Unequal expense splitting
- Settle payments feature
- Graphical User Interface (GUI)
- Data storage using files or database

## Author

Vanshika Agrawal
