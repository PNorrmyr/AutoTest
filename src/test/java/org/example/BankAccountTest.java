package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void getBalance() {
        //Given
        BankAccount ba = new BankAccount(100);

        //When
        ba.deposit(1.0);

        //Then
       assertEquals(101.0, ba.getBalance());

       ba.withdraw(50.0);

       assertEquals(51.0, ba.getBalance());

    }

    @Test
    void depositValidAmount() {
        //Given
        BankAccount ba = new BankAccount(100);

        //When
        ba.deposit(1.0);

        //Then
        assertAll(
                () -> assertEquals(101.0, ba.getBalance())

        );
    }

    @Test
    void depositZeroAmount(){
        //Given
        BankAccount ba = new BankAccount(100);

        //Then
        assertThrows(IllegalArgumentException.class, () -> {
                    //When
                    ba.deposit(0.0);
                }

        );

    }

    @Test
    void depositNegativeAmount(){
        //Given
        BankAccount ba = new BankAccount(100);

        //Then
        assertThrows(IllegalArgumentException.class, () -> {
            //When
            ba.deposit(-1.0);
                }

        );

    }

    @Test
    void withdrawValidAmount() {
        //Given
        BankAccount ba = new BankAccount(100.0);

        //When
        ba.withdraw(50.0);

        //Then
        assertEquals(50.0, ba.getBalance());

    }

    @Test
    void withdrawMoreThanBalance() {
        //Given
        BankAccount ba = new BankAccount(100.0);

        //Then
        assertThrows(IllegalArgumentException.class, () -> {
            //When
            ba.withdraw(150.0);
        });

    }


}