package com.lesson2;

public class Array {

    public static void main(String[] args) {

        String[][] arrStr = new String[4][4];
        for (int i = 0; i < arrStr.length; i++) {
            for (int j = 0; j < arrStr[i].length; j++) {
                arrStr[i][j] = "Str" + j;
                System.out.print(arrStr[i][j] + " ");
            }
            System.out.println("");
        }

        try {
            try {
                int result =method(arrStr);
                        System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива превышен!");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }
    }

        public static int method(String[][]arrStr) throws MyArraySizeException, MyArrayDataException {
            int count = 0;
            if (arrStr.length != 4) {
                throw new MyArraySizeException();
            }
            for (int i = 0; i < arrStr.length; i++) {
                if (arrStr[i].length != 4) {
                    throw new MyArraySizeException();
                }
                for (int j = 0; j < arrStr[i].length; j++) {
                    try {
                        count = count + Integer.parseInt(arrStr[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j);
                    }
                }

            }
            return count;
        }

    }




