class Account:
    def __init__(self, _name, _nic, _accNo):
        
        # Personal Details
        self.name = _name
        self.nic = _nic
        self.accountNo = _accNo
        
        # Account Details
        self.Balance = 0
        self.Deposit = 0
        self.Withdrawal = 0
        
        print("User Account create Successfully !!!")
    
    def display_balance(self):
        print(f"Updated account balance : Rs.{self.Balance}")
        return 0
    
    def update_balance(self):
        self.Balance = (self.Deposit - self.Withdrawal)
        self.display_balance()
        return 0
    
    def deposit(self, value):
        self.Deposit += value
        print(f"Deposit : Rs. {self.Deposit}")
        self.update_balance()
        return 0
        
    def withdrawal(self, value):
        self.Withdrawal += value
        print(f"Withdrawal : Rs. {self.Withdrawal}")
        self.update_balance()
        return 0
    
    def get_details(self):
        print(f" Account No : {self.accountNo}  Balance Rs. {self.Balance}  Deposit Rs. {self.Deposit} Withdrawal Rs. {self.Withdrawal}")


person1 = Account("Chamilka", 200218703760, '225081H')
person1.deposit(10000)
person1.withdrawal(3000)
person1.get_details()