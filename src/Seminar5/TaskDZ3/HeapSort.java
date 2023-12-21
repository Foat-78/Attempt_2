package Seminar5.TaskDZ3;

import java.util.Arrays;

//���������� ����������� ��������� ��� ���������� ������� ����� ����� � �������������� ���������� ����� (Heap Sort). ��������� ������ �������� ��������� �������:
//��������� �� ���� ������ ����� ����� ��� ����������. ���� ������ �� ������������, ��������� ���������� ������ �� ���������.
//������� �������� �������� ������ �� �����.
//����� ��������� ���������� ����� (Heap Sort) ��� ���������� ��������� ������� � ������� �����������.
//�������� ��������������� ������ �� �����.
//���� ������� ������ ��������� ��� �������� ������: buildTree, ������� ������ ����������� ������ �� ������ �������, � heapSort, ������� ��������� ���������� ���������� �����.
//��������� ������ ���� ��������� ����������� ������, ���� ���� �� ������� �� ������������� ����� � ����� ���������.
//
//�� �����:
//'5 8 12 3 6 9'
//
//�� ������:
//Initial array:
//[5, 8, 12, 3, 6, 9]
//Sorted array:
//[3, 5, 6, 8, 9, 12]
public class HeapSort {

    static void buildTree(int tree[], int sortLength) {
        for (int i = 1; i < sortLength; i++) {

            if (tree[i] > tree[(i - 1) / 2]) {
                int j = i;


                while (tree[j] > tree[(j - 1) / 2]) {
                    swap(tree, j, (j - 1) / 2);
                    j = (j - 1) / 2;
                }
            }
        }
    }

    static void heapSort(int sortArray[], int sortLength) {
        buildTree(sortArray, sortLength);

        for (int i = sortLength - 1; i > 0; i--) {

            swap(sortArray, 0, i);

            int j = 0, index;

            do {
                index = (2 * j + 1);

                if (index < (i - 1) && sortArray[index] < sortArray[index + 1])
                    index++;

                if (index < i && sortArray[j] < sortArray[index])
                    swap(sortArray, j, index);

                j = index;

            } while (index < i);
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


//    static void printArray(int arr[]) {
//        int n = arr.length;
//        for (int i = 0; i < n; i++)
//            System.out.print(arr[i] + " ");
//        System.out.println();
//    }


    public static void main(String args[]) {
        int arr[] = {10, 20, 15, 17, 9, 21};
        int n = arr.length;

        System.out.print("Initial array: \n");

        System.out.println(Arrays.toString(arr));

        heapSort(arr, n);

        System.out.print("Sorted array: \n");

        System.out.println(Arrays.toString(arr));
    }


}
