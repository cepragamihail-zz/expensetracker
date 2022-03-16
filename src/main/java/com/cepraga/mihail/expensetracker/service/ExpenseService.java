package com.cepraga.mihail.expensetracker.service;

import java.util.List;

import com.cepraga.mihail.expensetracker.model.Expense;

public interface ExpenseService {
	
	List<Expense> findAll();

}
