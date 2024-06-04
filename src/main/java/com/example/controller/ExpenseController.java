package com.example.controller;

import java.util.List;

import com.example.model.Expense;
import com.example.service.ExpenseService;
import com.opensymphony.xwork2.ActionSupport;

public class ExpenseController extends ActionSupport {
    private ExpenseService expenseService = new ExpenseService();
    private List<Expense> expenses;
    private String description;
    private double amount;

    public String addExpense() {
        Expense expense = new Expense();
        expense.setDescription(description);
        expense.setAmount(amount);
        expenseService.addExpense(expense);
        return SUCCESS;
    }

    public String listExpenses() {
        expenses = expenseService.getAllExpenses();
        return SUCCESS;
    }

    // Getters and setters
    public List<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
