package org.example;

import java.util.*;

public class Main {
    public static Map<String, String> filterCriteria() {
        Map<String, String> filter = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("По какому критерию фильтруем :");
        System.out.println("1 - ozu");
        System.out.println("2 - hdd");
        System.out.println("3 - processor");
        System.out.println("4 - manufacture");
        System.out.println("5 - os");
        System.out.println("6 - color");
        System.out.println("7 - exit");

        int criteriaKey = scanner.nextInt();
        scanner.nextLine();

        switch (criteriaKey) {
            case 1: {
                System.out.println("введите минимальное значение ozu (4,8,16) :");
                String criteriaValue = scanner.nextLine();
//                scanner.nextLine();
                filter.put("ozu", criteriaValue);
                scanner.close();
                break;
            }
            case 2: {
                System.out.println("введите минимальное значение hdd (250,500) :");
                String criteriaValue = scanner.nextLine();
//                scanner.nextLine();
                filter.put("hdd", criteriaValue);
                scanner.close();
                break;
            }
            case 3: {
                System.out.println("введите значение processor (Intel,Amd) :");
                String criteriaValue = scanner.nextLine();
//                scanner.nextLine();
                filter.put("processor", criteriaValue);
                scanner.close();
                break;
            }
            case 4: {
                System.out.println("введите значение manufacture (Asus,Aser) :");
                String criteriaValue = scanner.nextLine();
//                scanner.nextLine();
                filter.put("manufacture", criteriaValue);
                scanner.close();
                break;
            }
            case 5: {
                System.out.println("введите значение os (Win,no Os, Linux) :");
                String criteriaValue = scanner.nextLine();
//                scanner.nextLine();
                filter.put("os", criteriaValue);
                scanner.close();
                break;
            }
            case 6: {
                System.out.println("введите значение color (silver,black,white) :");
                String criteriaValue = scanner.nextLine();
//                scanner.nextLine();
                filter.put("color", criteriaValue);
                scanner.close();
                break;
            }
            case 7: {
                scanner.close();
                System.exit(0);
            }

        }

        return filter;
    }

    public static void main(String[] args) {

//        Задание:
//• Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
//  Реализовать в java.
//• Создать множество ноутбуков.
//• Написать метод, который будет запрашивать у пользователя критерий (или критерии)
//  фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно
//  хранить в Map. Например:
//  “Введите цифру, соответствующую необходимому критерию:
//        1 - ОЗУ
//        2 - Объем ЖД
//        3 - Операционная система
//        4 - Цвет …
//• Далее нужно запросить минимальные значения для указанных критериев - сохранить
//  параметры фильтрации можно также в Map.
//• Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
        List<Noutbook> nout = new ArrayList<>();
        List<Noutbook> noutFilter = new ArrayList<>();

        nout.add(new Noutbook(8, 500, "Intel", "Asus", "Win", "silver"));
        nout.add(new Noutbook(4, 250, "Intel", "Asus", "no Os", "silver"));
        nout.add(new Noutbook(16, 250, "Amd", "Aser", "Linux", "black"));
        nout.add(new Noutbook(8, 500, "Amd", "Aser", "Linux", "white"));


//        while (true) {

        Map<String, String> filtr = filterCriteria();

        for (Noutbook item : nout) {
            for (Map.Entry<String, String> entry : filtr.entrySet()) {
                switch (entry.getKey()) {

                    case "ozu": {
                        if (item.getOzu() >= Integer.parseInt(entry.getValue()))
                            noutFilter.add(item);
                        break;
                    }
                    case "hdd": {
                        if (item.getHdd() >= Integer.parseInt(entry.getValue()))
                            noutFilter.add(item);
                        break;
                    }
                    case "processor": {
                        if (item.getProcessor().equals(entry.getValue()))
                            noutFilter.add(item);
                        break;
                    }
                    case "manufacture": {
                        if (item.getManufacture().equals(entry.getValue()))
                            noutFilter.add(item);
                        break;
                    }
                    case "os": {
                        if (item.getOs().equals(entry.getValue()))
                            noutFilter.add(item);
                        break;
                    }
                    case "color": {
                        if (item.getColorBook().equals(entry.getValue()))
                            noutFilter.add(item);
                        break;
                    }

                }
            }
        }
//        }
        for (Noutbook item : noutFilter) {
            System.out.println(item);
//          filterCriteria().clear();

        }
//        }
    }

}
