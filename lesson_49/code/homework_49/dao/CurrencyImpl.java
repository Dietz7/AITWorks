package homework_49.dao;

import homework_49.model.Currency;
import homework_49.model.Transaction;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CurrencyImpl implements CurrencyConverter {
    private static final String TRANSACTION_FILE = "resources/transactions.txt";
    private List<Transaction> transactions = new ArrayList<>();
    private Map<String, Currency> currencyMap = new HashMap<>();

    @Override
    public List<Currency> readCurrenciesFromFile(String filePath) {
        List<Currency> currencies = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String currencyCode = parts[0].toUpperCase();
                double buyRate = Double.parseDouble(parts[1]);
                double sellRate = Double.parseDouble(parts[2]);
                Currency currency = new Currency(currencyCode, buyRate, sellRate);
                currencies.add(currency);
                currencyMap.put(currencyCode, currency);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return currencies;
    }

    @Override
    public void buyCurrency(String currencyCode, double amount) {
        Currency currency = currencyMap.get(currencyCode);
        if (currency != null) {
            double exchangedAmount = amount * currency.getBuyRate();
            transactions.add(new Transaction(currencyCode, amount, exchangedAmount, true));
            System.out.printf("You bought %.2f %s%n", exchangedAmount, currencyCode);
        } else {
            System.out.println("Invalid currency code!");
        }
    }

    @Override
    public void sellCurrency(String currencyCode, double amount) {
        Currency currency = currencyMap.get(currencyCode);
        if (currency != null) {
            double exchangedAmount = amount / currency.getSellRate();
            transactions.add(new Transaction(currencyCode, amount, exchangedAmount, false));
            System.out.printf("You sold %.2f %s%n", exchangedAmount, currencyCode);
        } else {
            System.out.println("Invalid currency code!");
        }
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
    @Override
    public void saveTransactionsToFile(String filePath) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (Transaction transaction : transactions) {
                bw.write(transaction.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
