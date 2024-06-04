import React, { useState } from "react";
import axios from "axios";

const AddExpense = () => {
  const [description, setDescription] = useState("");
  const [amount, setAmount] = useState("");

  const handleAddExpense = async (e) => {
    e.preventDefault();
    try {
      const response = await axios.post("/api/expenses", {
        description,
        amount,
      });
      // Handle successful expense addition
    } catch (error) {
      console.error("Failed to add expense", error);
    }
  };

  return (
    <form onSubmit={handleAddExpense}>
      <input
        type="text"
        value={description}
        onChange={(e) => setDescription(e.target.value)}
        placeholder="Description"
        required
      />
      <input
        type="number"
        value={amount}
        onChange={(e) => setAmount(e.target.value)}
        placeholder="Amount"
        required
      />
      <button type="submit">Add Expense</button>
    </form>
  );
};

export default AddExpense;
