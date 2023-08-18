Certainly! Here's a README to accompany your ATMINTERFACE Java program:

# ATMINTERFACE

**ATMINTERFACE** is a simple Java program that simulates an ATM (Automated Teller Machine) interface. Users can interact with the ATM to perform various banking operations, such as depositing money, withdrawing money, checking the balance, transferring funds to another account, viewing transaction history, and exiting the ATM interface.

## Features

- **Deposit:** Users can deposit a specified amount of money into their account.
- **Withdraw:** Users can withdraw a specified amount of money from their account if they have sufficient funds.
- **Check Balance:** Users can check the current balance in their account.
- **Transfer:** Users can transfer a specified amount of money to another account, provided they have sufficient funds. Users need to enter the recipient's User ID.
- **Transaction History:** Users can view a history of their transactions.
- **Exit:** Users can exit the ATM interface.

## Usage

1. Run the `ATMINTERFACE` Java program.
2. You will be prompted to enter the client's User ID and their initial balance.
3. The program will display a menu with options to perform various operations.
4. Choose an option by entering the corresponding number (1-6).
5. Follow the prompts to input the necessary information for the chosen operation.
6. After completing an operation, the program will display relevant information (e.g., new balance, success/failure messages).
7. You can perform multiple operations in succession or choose to exit the ATM interface.

## Example Usage

```
Enter client User ID: john_doe
Enter initial balance: $1000

CHERRY-ATM Menu:
1. Deposit
2. Withdraw
3. Check Balance
4. Transfer
5. Transaction History
6. Exit
Enter your choice from (1-6): 1
Enter deposit quantum: $500
Deposit successful. New balance: $1500

CHERRY-ATM Menu:
1. Deposit
2. Withdraw
3. Check Balance
4. Transfer
5. Transaction History
6. Exit
Enter your choice from (1-6): 2
Enter withdrawal amount: $200
Withdrawal successful. New balance: $1300

CHERRY-ATM Menu:
1. Deposit
2. Withdraw
3. Check Balance
4. Transfer
5. Transaction History
6. Exit
Enter your choice from (1-6): 3
Current balance: $1300

CHERRY-ATM Menu:
1. Deposit
2. Withdraw
3. Check Balance
4. Transfer
5. Transaction History
6. Exit
Enter your choice from (1-6): 4
Enter transfer quantum: $300
Enter client's User ID: sarah_smith
Transfer successful. New balance: $1000

CHERRY-ATM Menu:
1. Deposit
2. Withdraw
3. Check Balance
4. Transfer
5. Transaction History
6. Exit
Enter your choice from (1-6): 5
Transaction History for client User ID: john_doe
2023-08-18 Hours:12:18:00: Deposit of $500
2023-08-18 Hours:12:19:27: Withdrawal of $200
2023-08-18 Hours:12:20:25: Transfer to sarah_smith of $300

CHERRY-ATM Menu:
1. Deposit
2. Withdraw
3. Check Balance
4. Transfer
5. Transaction History
6. Exit
Enter your choice from (1-6): 6
Exiting the CHERRY-ATM.
```

## Notes

- The program simulates basic banking operations and should be treated as a learning exercise or a simple reference implementation.
- Input validation and error handling are not extensively implemented in this example and could be enhanced for a more robust application.
- Feel free to customize and expand upon the code to add more features, error handling, or other enhancements.

Enjoy experimenting with the code and exploring the different banking operations provided by the ATMINTERFACE program!
# Demo
