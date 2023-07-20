package java_essential.homework9;

/* Задача "Обмен элементов":
Напишите обобщенный метод, который принимает два элемента и меняет их местами.*/

public class ExchangeElements {
    public <T> void ExchangeE(T argument1, T argument2) {
        T temp = argument1;
        argument1 = argument2;
        argument2 = temp;
    }
}
