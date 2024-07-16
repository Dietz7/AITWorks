package homework_49.dao;

import homework_49.model.Currency;

import java.util.*;

public interface CurrencyConverter {
    List<Currency> readCurrenciesFromFile(String filePath);
    void buyCurrency(String currencyCode, double amount);
    void sellCurrency(String currencyCode, double amount);
    void saveTransactionsToFile(String filePath);

}
