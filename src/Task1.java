import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
//Первое задание
    static void arrayWithSize() {       //Метод, принимающий размер массива и строку на вход
        int check = 0;
        int max = 0;
        int min = 0;
        int five = 0;
        int arrSize;
        System.out.print("Размер массива ");
        Scanner sc = new Scanner(System.in);
        //ввод размера массива
        arrSize = sc.nextInt();
        int[] newArr = new int[arrSize];

        System.out.println("Введите числа через пробел");
        do {
        newArr[check] = sc.nextInt();
            check++;
        }
        while (check < arrSize) ;
        //Вывод массива с учетом заданного размера
        System.out.println("Ваш массив");
        System.out.println(Arrays.toString(newArr));

        //максимальное и минимальное число в массиве

        for (int i = 0; i < newArr.length-1; i++){

            if (newArr[i] < newArr[i+1]){
                min = newArr[i];
            }
            else {
                min = newArr[i + 1];
            }
            if (newArr[i] > newArr[i+1]){
                max = newArr[i];
            }
            else {
                max = newArr[i + 1];
            }
            if (newArr[i] == 5){
                five++;
            }
        }
        System.out.println("Максимальное: " + max); //Вывод максимального
        System.out.println("Минимальное: "+ min); //Вывод минимального
        System.out.println("Количество повторений числа 5: "+ five); //Количество повторений числа 5


    }
}

