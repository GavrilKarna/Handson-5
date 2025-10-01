package Task1;

import java.util.Arrays;
import java.util.Random;

public class ArraysDeepDivePractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Arrays Deep Dive
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * array multidimensi, operasi lanjutan, parameter/return value, dan utility methods.
         */

        // ===== ARRAY MULTIDIMENSI DASAR =====
        System.out.println("=== ARRAY MULTIDIMENSI DASAR ===");

        // Latihan 1: Membuat dan mengisi array 2D (matriks)
        // - Buat array 2D integer dengan ukuran 3x4 (3 baris, 4 kolom)
        int[][] matrix = new int[3][4];
        int value = 1;

        // - Isi array dengan nilai: baris 0: [1,2,3,4], baris 1: [5,6,7,8], baris 2: [9,10,11,12]
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = value++;
            }
        }

        // - Print seluruh matriks menggunakan nested loop dengan format yang rapi
        displayMatrix(matrix);

        // Latihan 2: Array 2D dengan inisialisasi langsung
        String[][] board = new String[3][3];
        // - Buat array 2D string yang merepresentasikan papan catur 3x3 dengan nilai awal "."
        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], ".");
        }

        // - Tempatkan "X" di posisi [0][0], [1][1], dan [2][2] (diagonal)
        // - Tempatkan "O" di posisi [0][2], [1][0], dan [2][1]
        board[0][0] = "X"; board[1][1] = "X"; board[2][2] = "X";
        board[0][2] = "O"; board[1][0] = "O"; board[2][1] = "O";


        // - Print papan dengan format grid yang rapi
        System.out.println("\n=== Papan Catur 3x3 ===");
        for (String[] row : board) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }


        // ===== ARRAY JAGGED (IRREGULAR) =====
        System.out.println("\\n=== ARRAY JAGGED (IRREGULAR) ===");

        // Latihan 3: Array dengan panjang baris yang berbeda
        // - Buat array 2D integer dengan 4 baris: baris 0 panjang 2, baris 1 panjang 4, baris 2 panjang 3, baris 3 panjang 5
        int[][] jagged = new int[4][];
        jagged[0] = new int[2];
        jagged[1] = new int[4];
        jagged[2] = new int[3];
        jagged[3] = new int[5];

        // - Isi setiap baris dengan angka berurutan dimulai dari 1
        // - Print array jagged dengan menampilkan panjang setiap baris
        value = 1;
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = value++;
            }
            System.out.println("Row " + i + " (" + jagged[i].length + "): " + Arrays.toString(jagged[i]));
        }

        // ===== OPERASI LANJUTAN PADA ARRAY =====
        System.out.println("\\n=== OPERASI LANJUTAN PADA ARRAY ===");

        // Latihan 4: Operasi matematika pada array 2D
        // - Buat dua matriks 2x3 dengan nilai bebas
        int[][] m1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] m2 = {{6, 5, 4}, {3, 2, 1}};
        System.out.println("Matrix 1:");
        displayMatrix(m1);
        System.out.println("Matrix 2:");
        displayMatrix(m2);

        // - Implementasikan penjumlahan matriks (buat method addMatrices)
        int[][] sum = addMatrices(m1, m2);

        // - Implementasikan perkalian setiap elemen dengan scalar 2 (buat method multiplyByScalar)
        int[][] multiplied = multiplyByScalar(m1, 2);

        // - Print hasil operasi
        System.out.println("Hasil Penjumlahan:");
        displayMatrix(sum);
        System.out.println("Hasil Perkalian Scalar:");
        displayMatrix(multiplied);

        // ===== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE =====
        System.out.println("\\n=== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE ===");

        // Latihan 5: Method yang menerima dan mengembalikan array
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        // - Panggil method sortArray untuk mengurutkan array
        // (implementasikan method sortArray yang menerima array dan mengembalikan array yang sudah diurutkan)
        System.out.println("Asli: " + Arrays.toString(numbers));

        // - Panggil method reverseArray untuk membalik array
        // (implementasikan method reverseArray)
        System.out.println("Sorted: " + Arrays.toString(sortArray(numbers)));

        // - Panggil method findMinMax untuk mencari nilai minimum dan maksimum
        // (implementasikan method yang mengembalikan array int dengan 2 elemen: [min, max])
        System.out.println("Reversed: " + Arrays.toString(reverseArray(numbers)));
        System.out.println("Min & Max: " + Arrays.toString(findMinMax(numbers)));

        // ===== UTILITY METHODS JAVA.UTIL.ARRAYS =====
        System.out.println("\\n=== UTILITY METHODS JAVA.UTIL.ARRAYS ===");

        // Latihan 6: Eksplorasi utility methods Arrays
        int[] data = {5, 2, 8, 1, 9, 3};

        // - Gunakan Arrays.toString() untuk print array

        // - Gunakan Arrays.sort() untuk mengurutkan array


        // - Gunakan Arrays.binarySearch() untuk mencari elemen (array harus sudah diurutkan)

        // - Gunakan Arrays.fill() untuk mengisi array dengan nilai tertentu

        // - Gunakan Arrays.equals() untuk membandingkan dua array

        // - Gunakan Arrays.copyOf() untuk membuat copy array dengan ukuran berbeda
        System.out.println("Asli: " + Arrays.toString(data));
        Arrays.sort(data);
        System.out.println("Sorted: " + Arrays.toString(data));
        System.out.println("Binary search 8 -> " + Arrays.binarySearch(data, 8));
        int[] copy = Arrays.copyOf(data, 10);
        System.out.println("Copy dengan ukuran lebih besar: " + Arrays.toString(copy));
        Arrays.fill(copy, 7);
        System.out.println("Setelah fill 7: " + Arrays.toString(copy));



        // ===== ARRAY 3D DAN KOMPLEKS =====
        System.out.println("\\n=== ARRAY 3D DAN KOMPLEKS ===");

        // Latihan 7: Array 3 dimensi
        // - Buat array 3D integer ukuran 2x3x4 (seperti 2 buah matriks 3x4)

        // - Isi dengan nilai berurutan dari 1

        // - Print menggunakan triple nested loop dengan format yang jelas
        int[][][] cube = new int[2][3][4];
        value = 1;
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    cube[i][j][k] = value++;
                }
            }
        }
        for (int i = 0; i < cube.length; i++) {
            System.out.println("Layer " + i + ":");
            displayMatrix(cube[i]);
        }

        // ===== SKENARIO APLIKASI NYATA =====
        System.out.println("\\n=== SKENARIO APLIKASI NYATA ===");

        // Latihan 8: Sistem nilai mahasiswa
        // - Buat array 2D untuk menyimpan nilai 5 mahasiswa, 4 mata kuliah
        String[] namaMahasiswa = {"Alice", "Bob", "Charlie", "Diana", "Eva"};
        String[] mataKuliah = {"Math", "Physics", "Chemistry", "Biology"};

        // - Isi dengan nilai random antara 60-100

        // - Hitung rata-rata per mahasiswa

        // - Hitung rata-rata per mata kuliah

        // - Tentukan mahasiswa dengan nilai tertinggi

        // - Print dalam format tabel yang rapi

        // Latihan 9: Game Tic-Tac-Toe sederhana
        // - Buat array 2D char 3x3 untuk papan permainan

        // - Implementasikan method untuk menampilkan papan

        // - Implementasikan method untuk mengecek apakah ada pemenang

        // - Simulasikan beberapa langkah permainan
        int[][] grades = new int[namaMahasiswa.length][mataKuliah.length];
        fillRandomGrades(grades, 60, 100);

        System.out.printf("%-10s", "Nama");
        for (String mk : mataKuliah) {
            System.out.printf("%10s", mk);
        }
        System.out.printf("%10s\n", "Rata2");

        double[] avgMK = new double[mataKuliah.length];
        double maxAvg = -1;
        String topStudent = "";

        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.printf("%-10s", namaMahasiswa[i]);
            double avg = calculateAverage(grades[i]);
            if (avg > maxAvg) {
                maxAvg = avg;
                topStudent = namaMahasiswa[i];
            }
            for (int j = 0; j < grades[i].length; j++) {
                System.out.printf("%10d", grades[i][j]);
                avgMK[j] += grades[i][j];
            }
            System.out.printf("%10.2f\n", avg);
        }

        System.out.printf("%-10s", "AvgMK");
        for (int j = 0; j < avgMK.length; j++) {
            System.out.printf("%10.2f", avgMK[j] / namaMahasiswa.length);
        }
        System.out.println("\nMahasiswa terbaik: " + topStudent + " dengan rata-rata " + maxAvg);

    }

    // ===== IMPLEMENTASI METHODS =====
    // TODO: Implementasikan method-method yang diperlukan di sini

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyByScalar(int[][] matrix, int scalar) {
        int[][] result = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[i][j] = matrix[i][j] * scalar;
            }
        }
        return result;
    }

    public static int[] sortArray(int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        return copy;
    }

    public static int[] reverseArray(int[] arr) {
        int[] result = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < result.length / 2; i++) {
            int temp = result[i];
            result[i] = result[result.length - 1 - i];
            result[result.length - 1 - i] = temp;
        }
        return result;
    }

    public static int[] findMinMax(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int val : arr) {
            if (val < min) min = val;
            if (val > max) max = val;
        }
        return new int[]{min, max};
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
    }

    public static void fillRandomGrades(int[][] grades, int min, int max) {
        Random rand = new Random();
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                grades[i][j] = rand.nextInt(max - min + 1) + min;
            }
        }
    }

    public static double calculateAverage(int[] values) {
        int sum = 0;
        for (int v : values) sum += v;
        return (double) sum / values.length;
    }
}