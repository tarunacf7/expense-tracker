import React from "react";
import AddExpense from "./Expense/AddExpense";
import ExpenseList from "./Expense/ExpenseList";

const Dashboard = () => {
  return (
    <div>
      <h1>Dashboard</h1>
      <AddExpense />
      <ExpenseList />
    </div>
  );
};

export default Dashboard;
