// Class for storing calculator operation history

package com.example;

import java.util.ArrayList;
import java.util.List;

public class CalculatorHistory {

    private final List<String> history = new ArrayList<>();

    public void addEntry(String operation) {
        history.add(operation);
    }

    public List<String> getHistory() {
        return history;
    }

    public void clearHistory() {
        history.clear();
    }

    public int getSize() {
        return history.size();
    }

    public void printHistory() {
        if (history.isEmpty()) {
            System.out.println("No calculations yet.");
            return;
        }
        System.out.println("Calculation History:");
        for (int i = 0; i < history.size(); i++) {
            System.out.println((i + 1) + ". " + history.get(i));
        }
    }
}