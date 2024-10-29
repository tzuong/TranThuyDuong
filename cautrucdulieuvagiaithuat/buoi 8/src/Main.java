import searchAlgorithm.BinarySearch;
import searchAlgorithm.LinearSearch;
import sortAlgorithm.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử của mảng
        System.out.print("Nhap so luong phan tu cua mang: ");
        int arrayLength = scanner.nextInt();

        // Khởi tạo mảng
        int[] arrayInput = new int[arrayLength];

        // Nhập các phần tử của mảng từ bàn phím
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Phan tu thu " + i + ": ");
            arrayInput[i] = scanner.nextInt();
        }

        System.out.print("Nhap gia tri can tim: ");
        int key = scanner.nextInt();
        callMeForLinearSearch(arrayInput, key);
        scanner.close();
    }

    static void callMeForBinarySearch(int[] arrayInput, int key) {
        System.out.print(BinarySearch.binarySearch(arrayInput, key));
    }

    static void callMeForLinearSearch(int[] arrayInput, int key) {
        LinearSearch linearSearchInstance = new LinearSearch();
        System.out.println("Vi tri cua phan tu can tim la: " + linearSearchInstance.linearSearch(arrayInput, key));
    }

    static void callMeForSelectionSort(int[] arrayInput) {
        SelectionSort selectionSortInstance = new SelectionSort();
        System.out.println("Mang truoc khi sap xep la:");
        selectionSortInstance.selectionSort(arrayInput);
        printArray(arrayInput);
    }

    static void callMeForInsertionSort(int[] arrayInput) {
        InsertionSort insertionSortInstance = new InsertionSort();
        printArray(arrayInput);
        insertionSortInstance.insertionSort(arrayInput);
        System.out.println("Mang sau khi sap xep tu be den lon:");
        printArray(arrayInput);

        // Sắp xếp từ lớn đến bé
        insertionSortInstance.insertionSort(arrayInput);
        System.out.println("Mang sau khi sap xep tu lon den be:");
        printArray(arrayInput);
    }

    static void printArray(int[] arrayInput) {
        for (int i : arrayInput) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
