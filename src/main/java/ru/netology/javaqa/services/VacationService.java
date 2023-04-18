package ru.netology.javaqa.services;

public class VacationService {
    public int calculete(int income, int expense, int threshold) {
        int count = 0;
        int money = 0;
        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) {
                money = (money - expense) / 3;
                count++;
                System.out.println("Месяц" + month + " ,Денег" + money + " ,Буду отдыхать" + " ,Траты" + expense + " ,На отпуск" + (money - expense) / 3);
            } else {
                money = money +  (income - expense);
                System.out.println("Месяц" + month + " ,Денег" + money + " ,Заработал" + income + " ,Траты" + expense);
            }
        }
        return count;
    }
}

