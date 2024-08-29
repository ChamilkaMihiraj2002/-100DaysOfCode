// Initialize balance and transactions array
let balance = 0;
let transactions = [];

// Load data from local storage when the page loads
window.onload = function() {
    loadFromLocalStorage();
    updateBalance();
    updateTransactionList();
};

// Function to update the balance on the page
function updateBalance() {
    const balanceElement = document.getElementById("balance");
    balanceElement.textContent = `Rs. ${balance.toFixed(2)}`;

    // Apply dynamic classes based on the balance value
    if (balance > 0) {
        balanceElement.className = 'positive';
    } else if (balance < 0) {
        balanceElement.className = 'negative';
    } else {
        balanceElement.className = 'neutral';
    }
}

// Function to add a new transaction (income/expense) to the list
function addTransaction(description, amount) {
    const transaction = {
        description: description,
        amount: parseFloat(amount)
    };

    transactions.push(transaction);

    // Update the balance based on whether it's income or expense
    if (amount > 0) {
        balance += transaction.amount;
    } else {
        balance += transaction.amount;  // Subtracts since amount is negative
    }

    // Save transactions to local storage
    saveToLocalStorage();

    updateTransactionList();
    updateBalance();
}

// Function to update the transaction list on the page
function updateTransactionList() {
    const dataItemElement = document.getElementById("dataItem");
    dataItemElement.innerHTML = ""; // Clear the list before updating

    transactions.forEach(transaction => {
        const transactionItem = document.createElement("p");
        if (transaction.amount > 0) {
            transactionItem.textContent = `${transaction.description}: +Rs. ${transaction.amount.toFixed(2)}`;
            transactionItem.style.color = "green";  // Income in green
        } else {
            transactionItem.textContent = `${transaction.description}: -Rs. ${Math.abs(transaction.amount).toFixed(2)}`;
            transactionItem.style.color = "red";  // Expense in red
        }
        dataItemElement.appendChild(transactionItem);
    });
}

// Function to save transactions and balance to local storage
function saveToLocalStorage() {
    localStorage.setItem("transactions", JSON.stringify(transactions));
    localStorage.setItem("balance", JSON.stringify(balance));
}

// Function to load transactions and balance from local storage
function loadFromLocalStorage() {
    const storedTransactions = localStorage.getItem("transactions");
    const storedBalance = localStorage.getItem("balance");

    if (storedTransactions) {
        transactions = JSON.parse(storedTransactions);
    }

    if (storedBalance) {
        balance = parseFloat(storedBalance);
    }
}

// Form submission event listener
document.getElementById("expenseForm").addEventListener("submit", function(event) {
    event.preventDefault(); // Prevent form submission from refreshing the page

    const description = document.getElementById("datatext").value.trim();
    const amountStr = document.getElementById("dataEntry").value.trim();

    if (description === "" || amountStr === "" || isNaN(amountStr)) {
        alert("Please enter a valid description and amount.");
        return;
    }

    const amount = parseFloat(amountStr);

    // Add the transaction (either income or expense)
    addTransaction(description, amount);

    // Clear the input fields after submitting
    document.getElementById("datatext").value = '';
    document.getElementById("dataEntry").value = '';
});

// Initialize balance display on page load
updateBalance();