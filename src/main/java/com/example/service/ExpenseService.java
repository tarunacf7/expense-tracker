package com.example.service;

import java.util.List;

import com.example.dao.ExpenseDAO;
import com.example.model.Expense;

public class ExpenseService {
    private ExpenseDAO expenseDAO = new ExpenseDAO();

    public void addExpense(Expense expense) {
        expenseDAO.addExpense(expense);
    }

    public List<Expense> getAllExpenses() {
        return expenseDAO.getAllExpenses();
    }
}
