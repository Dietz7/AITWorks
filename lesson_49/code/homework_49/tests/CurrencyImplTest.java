package homework_49.tests;

import homework_49.dao.CurrencyImpl;
import homework_49.model.Currency;
import homework_49.model.Transaction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyImplTest {

    private CurrencyImpl currencyImpl;

    @BeforeEach
    void setUp() {
        currencyImpl = new CurrencyImpl();
        currencyImpl.readCurrenciesFromFile("C:/Users/User/Desktop/Java Kurs 2024/lesson_49/code/homework_49/resources/exchange_rates.txt");
    }

    @Test
    void readCurrenciesFromFile() {
        List<Currency> currencies = currencyImpl.readCurrenciesFromFile("C:/Users/User/Desktop/Java Kurs 2024/lesson_49/code/homework_49/resources/exchange_rates.txt");

        // Assert that currencies are loaded correctly
        assertEquals(12, currencies.size()); // Adjust the number based on your test file
        assertEquals(0.91, currencies.get(0).getBuyRate());
        assertEquals(0.92, currencies.get(0).getSellRate());

    }

    @Test
    void buyCurrency() {
        currencyImpl.buyCurrency("USD", 100.0);
        List<Transaction> transactions = currencyImpl.getTransactions();

        assertEquals(1, transactions.size());
        assertEquals("USD", transactions.get(0).getCurrencyCode());
        assertEquals(100.0, transactions.get(0).getAmount());
        // Add more assertions based on your expected behavior
    }

    @Test
    void sellCurrency() {
        currencyImpl.sellCurrency("USD", 100.0);
        List<Transaction> transactions = currencyImpl.getTransactions();

        assertEquals(1, transactions.size());
        assertEquals("USD", transactions.get(0).getCurrencyCode());
        assertEquals(100.0, transactions.get(0).getAmount());
        // Add more assertions based on your expected behavior
    }

    @Test
    void getTransactions() {
        currencyImpl.buyCurrency("USD", 100.0);
        currencyImpl.sellCurrency("EUR", 200.0);

        List<Transaction> transactions = currencyImpl.getTransactions();

        assertEquals(2, transactions.size());
        assertEquals("USD", transactions.get(0).getCurrencyCode());
        assertEquals("EUR", transactions.get(1).getCurrencyCode());
    }

    @Test
    void saveTransactionsToFile() {
        currencyImpl.buyCurrency("USD", 100.0);
        currencyImpl.sellCurrency("EUR", 200.0);

        currencyImpl.saveTransactionsToFile("C:/Users/User/Desktop/Java Kurs 2024/lesson_49/code/homework_49/resources/transactions.txt");

        // Implement assertions to check if the file has been saved correctly
        // You can also read the file back and verify its contents if necessary
    }
    }
