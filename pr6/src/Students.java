import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.lang.System.exit;

public class Students implements Comparator {
        int grade;
        String name;
        String Surname;
        int year;
        int group;
        String Speciality;
        Date date;

        public String toString()
        {
            System.out.println("Введите 1 для вывода дня и месяца\n Введите 2 для вывода дня, месяца, года ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            SimpleDateFormat dateFormatter1 = new SimpleDateFormat("dd.MM");
            SimpleDateFormat dateFormatter2 = new SimpleDateFormat("dd.MM.YYYY");
            switch(n)
            {
                case 1:
                    return (dateFormatter1.format(date));

                case 2:
                    return (dateFormatter2.format(date));

            }
            return null;
        }

        String getName() {
             return name;
        }
        void setName(String name) {
            this.name=name;
        }

        String getSurname() {
            return Surname;
        }
        void setSurname(String Surname) {
            this.Surname=Surname;
        }

    int getYear() {
        return year;
    }
    void setYear(int year) {
        this.year=year;
    }

    int getGroup() {
        return group;
    }
    void setGroup(int group) {
        this.group=group;
    }

    String getSpeciality() {
        return Speciality;
    }
    void setSpeciality(String name) {
        this.Speciality=Speciality;
    }

    Students(String name, String surname, int grade, int year, int group, Date date)
        {
            this.grade=grade;
            this.name=name;
            this.Surname = surname;
            this.year = year;
            this.group = group;
            this.date = date;
        }

        /* public void insertionSort(Students[] array) {
            for (int i = 1; i < array.length; i++) {
                Students current = array[i];
                int j = i - 1;
                while(j >= 0 && current.idNumber < array[j].idNumber) { // слева ищем ближайщий меньший
                    array[j+1] = array[j];
                    j--;
                }
                array[j+1] = current;
            }
        } */
        public boolean compareTo(Comparator s1, Comparator s2, int n)
        {
            switch (n) {
                case 1:
                    return ((Students) s1).grade < ((Students) s2).grade;
                case 2:
                    return ((Students) s1).group < ((Students) s2).group;
                case 3:
                    return ((Students) s1).year < ((Students) s2).year;
                default:
                    return ((Students) s1).Surname.charAt(0) < ((Students) s2).Surname.charAt(0);
            }
        }
    }


