import java.util.*;
import java.io.*;
public class Task1 {
    /*******Задание 1******
     На вход через консоль принимается размер массива,
     вывод: массив, макс и мин число, количество повторений числа 5 */
  static   int check = 0; //счетчик для элементов массива
    static int five = 0; //счетчик для числа 5
    static int arraySize; //размер массива
//    static int max; //максимальный элемент
static int [] newArr;

static void arrayWithSize() {
     System.out.print("Input array size: ");
        //Ввод размера массива
       Scanner scanner = new Scanner(System.in);
    arraySize = scanner.nextInt();
       int[] newArr = new int[arraySize];
    System.out.println("Input numbers: ");


    Scanner sc = new Scanner(System.in);

    while (check < arraySize) {

              newArr[check] = sc.nextInt();
        check++;
    }


    //Вывод массива с учетом заданного размера
    System.out.println("Your array: ");
    System.out.println(Arrays.toString(newArr));


    //Максимальное и минимальное число в массиве
    int min = newArr[0];
    int max = newArr[0];
    for (int i = 0; i < newArr.length; i++) {

        if (min >= newArr[i]) {
            min = newArr[i];
        }
        if (max <= newArr[i]) {
            max = newArr[i];
        }
        //Количество повторений числа 5
        if (newArr[i] == 5) {
            five++;
        }
    }
    System.out.println("Maximum " + max); //Вывод максимального
    System.out.println("Minimum " + min); //Вывод минимального
    System.out.println("5 is return: " + five); //Количество повторений числа 5*/
}

            }




