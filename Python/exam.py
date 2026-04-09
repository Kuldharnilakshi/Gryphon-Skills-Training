import random
import logging
from datetime import datetime


logging.basicConfig(
    level=logging.INFO,
    format="%(asctime)s - %(levelname)s - %(message)s",
    filename="transaction.log"
)


class TransactionFileManager:
    def __init__(self, filename, mode):
        self.filename = filename
        self.mode = mode
        self.file = None

    def __enter__(self):
        logging.info(f"Opening file: {self.filename}")
        self.file = open(self.filename, self.mode)
        return self.file

    def __exit__(self, exc_type, exc_value, traceback):
        self.file.close()
        logging.info(f"Closing file: {self.filename}")
        return False  # Do not suppress exceptions


class TransactionManager:
    def __init__(self, filename, initial_balance=1000.0):
        self.filename = filename
        self.balance = initial_balance
        self.transaction_count = 0

    # transaction Generation
    def generate_transactions(self, count=50):
        with TransactionFileManager(self.filename, "w") as file:
            for _ in range(count):
                txn_id = f"TXN{self.transaction_count + 1:05d}"
                txn_type = random.choice(["CREDIT", "DEBIT"])

                if txn_type == "DEBIT" and self.balance <= 0:
                    txn_type = "CREDIT"

                if txn_type == "CREDIT":
                    amount = round(random.uniform(100, 1000), 2)
                    self.balance += amount
                else:
                    amount = round(random.uniform(1, self.balance), 2)
                    self.balance -= amount

                self.transaction_count += 1

                record = f"{txn_id},{txn_type},{amount},{self.balance}\n"
                file.write(record)


    def transaction_generator(self):
        with TransactionFileManager(self.filename, "r") as file:
            for line in file:
                try:
                    txn_id, txn_type, amount, balance = line.strip().split(",")
                    yield {
                        "id": txn_id,
                        "type": txn_type,
                        "amount": float(amount),
                        "balance": float(balance)
                    }
                except ValueError as e:
                    logging.error(f"Invalid record skipped: {line.strip()} | Error: {e}")
                    continue
    def process_transactions(self):
        total_transactions = 0
        total_credit = 0.0
        total_debit = 0.0
        final_balance = 0.0

        for txn in self.transaction_generator():
            total_transactions += 1

            if txn["type"] == "CREDIT":
                total_credit += txn["amount"]
            elif txn["type"] == "DEBIT":
                total_debit += txn["amount"]

            final_balance = txn["balance"]

        return {
            "total_transactions": total_transactions,
            "total_credit": total_credit,
            "total_debit": total_debit,
            "final_balance": final_balance
        }


if __name__ == "__main__":
    manager = TransactionManager("transactions.csv", initial_balance=1000.0)

    manager.generate_transactions(count=1000)

    summary = manager.process_transactions()

    print("\n--- Transaction Summary ---")
    print(f"Total Transactions : {summary['total_transactions']}")
    print(f"Total Credit       : ₹{summary['total_credit']:.2f}")
    print(f"Total Debit        : ₹{summary['total_debit']:.2f}")
    print(f"Final Balance      : ₹{summary['final_balance']:.2f}")
