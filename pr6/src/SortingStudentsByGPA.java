import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import java.text.ParseException;


import static java.lang.System.exit;

public class SortingStudentsByGPA  {

        Students[] idNumber;

        Students[] getIdNumber()
        {
            return idNumber;
        }

        public void setArray(int a) throws ParseException
        {
            idNumber = new Students[a];

            SimpleDateFormat dateFormatter = new SimpleDateFormat("dd.MM.YYYY");
            String d0 = "01.01.2000";
            Date d1 = dateFormatter.parse(d0);
            d0 = "01.01.2005";
            Date d2 = dateFormatter.parse(d0);
            Date randomDate = new Date(ThreadLocalRandom.current().nextLong(d1.getTime(), d2.getTime()));

            for (int i =0; i<a; i++)
            {
                Random rand = new Random();
                idNumber[i] = new Students("name", "surname", rand.nextInt(6)+1, rand.nextInt(5)+1, rand.nextInt(60)+1, randomDate);
            }
        }
        public int partition(Comparator[] array, int begin, int end, int n) {
            int pivot = end; // опорный элемент

            int counter = begin;
            for (int i = begin; i < end; i++) {
                if (array[i].compareTo(array[i], array[pivot], n)) {
                    Comparator temp = array[counter];
                    array[counter] = array[i];
                    array[i] = temp;
                    counter++;
                }
            }
            Comparator temp = array[pivot]; // меняем местами
            array[pivot] = array[counter];
            array[counter] = temp;

            return counter;
        }

        public void quickSort(Comparator[] array, int begin, int end, int n) {
            if (end <= begin) return;
            int pivot = partition(array, begin, end, n); // раскидывание меньшее влево, большее вправо
            quickSort(array, begin, pivot-1, n); // слева и справа рекурсивно
            quickSort(array, pivot+1, end, n);
        }

        public void outArray()
        {

            for (int i =0 ; i < idNumber.length; i++)
            {
                System.out.println(idNumber[i].grade + " "+ idNumber[i].name + " "+idNumber[i].Surname+" group - "+idNumber[i].group + " year - "+idNumber[i].year);
            }
        }

    public static void mergeSort(Comparator[] a, int n, int o) {
        long startTime = System.currentTimeMillis();
// измерение выполнения кода
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Comparator[] l = new Comparator[mid];
        Comparator[] r = new Comparator[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid, o);
        mergeSort(r, n - mid, o); // сортируем и потом сливаем вместе
        // System.out.println(mid);

        // System.out.println(n-mid);

        merge(a, l, r, mid, n - mid, o);

    }

    public static void merge(
            Comparator[] a, Comparator[] l, Comparator[] r, int left, int right, int o) {
        // сливаем в один массив, возвращаем в a
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (!(l[i].compareTo(l[i], r[j], o))) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

        public static void main  (String args[]) throws ParseException
        {
            long startTime = System.currentTimeMillis();
            SortingStudentsByGPA list = new SortingStudentsByGPA();
            list.setArray(100);

            System.out.println("Введите 1 для сортировки по оценкам \n2 - для сортировки по группе \n3 - по году");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            list.quickSort(list.getIdNumber(), 0, 99, n);
            long estimatedTime = System.currentTimeMillis() - startTime;
            System.out.println(estimatedTime);

            list.outArray();

            System.out.println("\nОбъединение двух массивов студентов в отсортированный массив ");
            SortingStudentsByGPA list1 = new SortingStudentsByGPA();
            list1.setArray(100);

            SortingStudentsByGPA list3 = new SortingStudentsByGPA();
            list3.setArray(200);

            System.out.println("Введите 1 для сортировки по оценкам \n2 - для сортировки по группе \n3 - по году");
            n = in.nextInt();
            startTime = System.currentTimeMillis();
            list.merge(list3.idNumber, list1.idNumber, list.idNumber, 100, 100, n);
            list.mergeSort(list3.idNumber, 200, n);
            estimatedTime = System.currentTimeMillis() - startTime;
            System.out.println(estimatedTime);
            list3.outArray();

            System.out.println(list3.idNumber[0].toString());
        }

    }

