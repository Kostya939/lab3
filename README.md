# Онлайн Магазин

Цей проект є прикладом простого онлайн магазину, що дозволяє додавати продукти до кошика, видаляти їх із кошика, та оформляти замовлення. Проект також включає можливість перегляду статусу замовлення.

## Структура проекту

Проект складається з наступних класів:

- **Product** - представляє продукт з атрибутами id, name та price.
- **Cart** - клас, що управляє кошиком, дозволяючи додавати та видаляти продукти, а також оформлювати замовлення.
- **Order** - клас, що представляє замовлення з інформацією про продукти, ідентифікатор замовлення та статус.
- **CartTest** - клас для тестування функціональності кошика за допомогою JUnit та Mockito.

## Використання

У класі `Main` демонструється базовий сценарій використання онлайн магазину, включаючи створення об'єктів продуктів та взаємодію з кошиком.

## Тестування

Для перевірки функціональності магазину було створено тестовий клас `CartTest`, в якому визначені різні тести для функцій кошика. Ви можете запустити ці тести, використовуючи JUnit та Mockito, для перевірки правильності роботи магазину.

## Вимоги до середовища

Для роботи з цим проектом вам потрібно мати наступне:

- Java Development Kit (JDK)
- Компілятор Java (javac)
- Система управління залежностями, наприклад Maven або Gradle (для управління залежностями JUnit та Mockito)

## Автор

Автор: [Козачок Костянтин]
