package Task3;

import java.util.Arrays;

public class MethodsAdvancedPractice {

    // Static variable untuk demonstrasi
    private static int counter = 0;

    // Instance variable untuk demonstrasi
    private String instanceName;

    // Constructor
    public MethodsAdvancedPractice(String name) {
        this.instanceName = name;
        counter++;
    }

    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Methods Advanced
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * method signature, overloading, pass by value/reference, static vs instance methods.
         */

        // ===== METHOD SIGNATURE DAN DECLARATION =====
        System.out.println("=== METHOD SIGNATURE DAN DECLARATION ===");

        // Latihan 1: Memahami komponen method signature
        // - Panggil method dengan signature berbeda untuk melihat perbedaannya
        // - Gunakan method overloading untuk mendemonstrasikan signature
        System.out.println("calculate(int, int) = " + calculate(5, 3));
        System.out.println("calculate(double, double) = " + calculate(5.5, 3.5));
        System.out.println("calculate(int, int, int) = " + calculate(1, 2, 3));

        // Contoh pemanggilan method calculate dengan signature berbeda
        System.out.println("calculate(String, String) = " + calculate("Hello", "World"));

        // ===== METHOD OVERLOADING =====
        System.out.println("\\n=== METHOD OVERLOADING ===");

        // Latihan 2: Implementasi dan penggunaan method overloading
        // - Panggil semua variasi method calculate yang di-overload
        print(10);
        print(3.14);

        // - Panggil semua variasi method print yang di-overload
        print("Java is fun!");

        // - Demonstrasikan bagaimana compiler memilih method yang tepat
        print(new int[]{1, 2, 3, 4});

        // ===== STATIC VS INSTANCE METHODS =====
        System.out.println("\\n=== STATIC VS INSTANCE METHODS ===");

        // Latihan 3: Perbedaan static dan instance methods
        // - Panggil static method tanpa membuat object
        System.out.println("Counter awal: " + getCounter());
        incrementCounter();

        // - Buat instance object dan panggil instance method
        System.out.println("Counter setelah increment: " + getCounter());

        // - Demonstrasikan akses ke static vs instance variables
        MethodsAdvancedPractice obj = new MethodsAdvancedPractice("Objek1");

        // - Coba akses instance method dari static context (akan error)
        obj.displayInfo();

        // ===== PASS BY VALUE - PRIMITIVES =====
        System.out.println("\\n=== PASS BY VALUE - PRIMITIVES ===");

        // Latihan 4: Demonstrasi pass by value untuk primitive types
        int originalNumber = 10;

        // - Panggil method modifyPrimitive dengan originalNumber
        modifyPrimitive(originalNumber);

        // - Print originalNumber sebelum dan sesudah method call
        System.out.println("Sebelum: " + originalNumber);
        System.out.println("Sesudah: " + originalNumber);

        // - Jelaskan mengapa nilai tidak berubah
        // Karena primitive types (int, double, char, dll.) di Java disimpan sebagai
        // nilai langsung (by value). Jadi, ketika dipassing ke method, yang dikirim
        // adalah copy dari nilai tersebut, bukan variabel aslinya.

        // ===== PASS BY VALUE OF REFERENCE - OBJECTS =====
        System.out.println("\\n=== PASS BY VALUE OF REFERENCE - OBJECTS ===");

        // Latihan 5: Demonstrasi pass by value of reference untuk objects
        int[] originalArray = {1, 2, 3, 4, 5};

        // - Print array sebelum modification
        System.out.println("Sebelum: " + Arrays.toString(originalArray));

        // - Panggil method modifyArray dengan originalArray
        modifyArray(originalArray);

        // - Print array setelah modification
        System.out.println("Sesudah: " + Arrays.toString(originalArray));


        // - Jelaskan mengapa isi array berubah tetapi reference tidak
        // Karena Java tetap pass by value. Yang dipassing adalah salinan reference.

        // Latihan 6: Reference reassignment dalam method
        int[] anotherArray = {10, 20, 30};

        // - Print array sebelum reassignment
        System.out.println("Sebelum reassignment: " + Arrays.toString(anotherArray));

        // - Panggil method reassignArray dengan anotherArray
        reassignArray(anotherArray);

        // - Print array setelah method call
        System.out.println("Sesudah reassignment: " + Arrays.toString(anotherArray));

        // - Jelaskan mengapa reference asli tidak berubah
        // Isi array bisa berubah karena parameter method menerima salinan reference,
        // dan reference itu menunjuk ke array yang sama di memory.
        //Reference asli tidak berubah karena saat kita assign reference baru di dalam method

        // ===== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE =====
        System.out.println("\\n=== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE ===");

        // Latihan 7: Method yang menerima dan mengembalikan array
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        // - Panggil method yang mengembalikan copy array yang diurutkan
        System.out.println("Sorted copy: " + Arrays.toString(sortArrayCopy(numbers)));

        // - Panggil method yang mengembalikan statistik array (min, max, avg)
        System.out.println("Stats (min,max,avg): " + Arrays.toString(getArrayStats(numbers)));

        // - Panggil method yang merge dua array
        System.out.println("Merge arrays: " + Arrays.toString(mergeArrays(new int[]{1, 2}, new int[]{3, 4, 5})));

        // ===== VARIABLE ARGUMENTS (VARARGS) =====
        System.out.println("\\n=== VARIABLE ARGUMENTS (VARARGS) ===");

        // Latihan 8: Implementasi dan penggunaan varargs
        // - Panggil method sum dengan jumlah parameter berbeda-beda
        System.out.println("Sum(1,2,3,4,5) = " + sum(1, 2, 3, 4, 5));

        // - Panggil method printInfo dengan berbagai kombinasi parameter
        printInfo("Angka", 5, 10, 15);

        // ===== METHOD CHAINING =====
        System.out.println("\\n=== METHOD CHAINING ===");

        // Latihan 9: Implementasi method chaining
        // - Gunakan Calculator dengan method chaining untuk operasi berurutan
        Calculator calc = new Calculator(10);
        double result = calc.add(5).multiply(2).subtract(3).getResult();
        System.out.println("Hasil chaining: " + result);

        // ===== RECURSIVE METHODS =====
        System.out.println("\\n=== RECURSIVE METHODS ===");

        // Latihan 10: Implementasi dan penggunaan recursive methods
        // - Hitung faktorial menggunakan recursion
        System.out.println("Factorial(5) = " + factorial(5));

        // - Hitung fibonacci menggunakan recursion
        System.out.println("Fibonacci(6) = " + fibonacci(6));

        // - Implementasikan binary search recursive
        int[] sorted = {1, 3, 5, 7, 9};
        System.out.println("BinarySearch 7 = index " + binarySearchRecursive(sorted, 7, 0, sorted.length - 1));

        // ===== UTILITY STATIC METHODS =====
        System.out.println("\\n=== UTILITY STATIC METHODS ===");

        // Latihan 11: Membuat utility class dengan static methods
        // - Gunakan MathUtils untuk berbagai operasi matematika
        System.out.println("Power(2,5) = " + MathUtils.power(2, 5));
        System.out.println("isPrime(17) = " + MathUtils.isPrime(17));
        System.out.println("GCD(48,18) = " + MathUtils.gcd(48, 18));

        // - Gunakan StringUtils untuk manipulasi string
        System.out.println("Reverse('level') = " + StringUtils.reverse("level"));
        System.out.println("Palindrome('level') = " + StringUtils.isPalindrome("level"));
        System.out.println("CountWords('Java is fun') = " + StringUtils.countWords("Java is fun"));

        // - Gunakan ArrayUtils untuk operasi array
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Matrix:");
        ArrayUtils.printMatrix(matrix);

        int[] withDuplicates = {1, 2, 3, 2, 4, 5, 3, 1};
        System.out.println("Array: " + Arrays.toString(withDuplicates));
        System.out.println("Duplikat: " + Arrays.toString(ArrayUtils.findDuplicates(withDuplicates)));

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {3, 2, 1};
        System.out.println("arr1 == arr2 ? " + ArrayUtils.areEqual(arr1, arr2));
        System.out.println("arr1 == arr3 ? " + ArrayUtils.areEqual(arr1, arr3));


        // ===== SKENARIO APLIKASI NYATA =====
        System.out.println("\\n=== SKENARIO APLIKASI NYATA ===");

        // Latihan 12: Sistem kalkulator dengan method overloading
        // - Implementasikan calculator yang bisa handle berbagai tipe data dan operasi
        // Kalkulator sederhana dengan method overloading



        // Latihan 13: Sistem processing data dengan static utilities
        // - Implementasikan data processor dengan berbagai method utility
        // Data Processor sederhana dengan static method

    }

    // ===== METHOD OVERLOADING EXAMPLES =====

    // TODO: Implementasikan method calculate yang di-overload
    public static int calculate(int a, int b) {
        // Penjumlahan dua integer
        return 0; // Ganti dengan implementasi
    }

    public static double calculate(double a, double b) {
        // Penjumlahan dua double
        return 0.0; // Ganti dengan implementasi
    }

    public static int calculate(int a, int b, int c) {
        // Penjumlahan tiga integer
        return 0; // Ganti dengan implementasi
    }

    public static String calculate(String a, String b) {
        // Concatenation dua string
        return null; // Ganti dengan implementasi
    }

    // TODO: Implementasikan method print yang di-overload
    public static void print(int value) {
        // Print integer dengan format khusus
    }

    public static void print(double value) {
        // Print double dengan format khusus
    }

    public static void print(String value) {
        // Print string dengan format khusus
    }

    public static void print(int[] array) {
        // Print array dengan format khusus
    }

    // ===== STATIC VS INSTANCE METHODS =====

    public static int getCounter() {
        // TODO: Return nilai counter static
        return 0;
    }

    public static void incrementCounter() {
        // TODO: Increment counter static
    }

    public String getInstanceName() {
        // TODO: Return instance name
        return null;
    }

    public void setInstanceName(String name) {
        // TODO: Set instance name
    }

    public void displayInfo() {
        // TODO: Display instance dan static information
    }

    // ===== PASS BY VALUE DEMONSTRATIONS =====

    public static void modifyPrimitive(int number) {
        // TODO: Modify parameter dan print perubahan
    }

    public static void modifyArray(int[] array) {
        // TODO: Modify isi array
    }

    public static void reassignArray(int[] array) {
        // TODO: Reassign reference array
    }

    // ===== ARRAY METHODS =====

    public static int[] sortArrayCopy(int[] original) {
        // TODO: Return sorted copy tanpa mengubah original
        return null; // Ganti dengan implementasi
    }

    public static double[] getArrayStats(int[] array) {
        // TODO: Return array [min, max, average]
        return null; // Ganti dengan implementasi
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        // TODO: Merge dua array dan return hasil
        return null; // Ganti dengan implementasi
    }

    // ===== VARIABLE ARGUMENTS (VARARGS) =====

    public static int sum(int... numbers) {
        // TODO: Hitung sum dari varargs
        return 0; // Ganti dengan implementasi
    }

    public static void printInfo(String title, int... values) {
        // TODO: Print title dan semua values
    }

    // ===== RECURSIVE METHODS =====

    public static long factorial(int n) {
        // TODO: Implementasi factorial recursive
        return 1; // Ganti dengan implementasi
    }

    public static int fibonacci(int n) {
        // TODO: Implementasi fibonacci recursive
        return 0; // Ganti dengan implementasi
    }

    public static int binarySearchRecursive(int[] array, int target, int left, int right) {
        // TODO: Implementasi binary search recursive
        return -1; // Ganti dengan implementasi
    }

    // ===== UTILITY CLASSES (INNER STATIC CLASSES) =====

    public static class MathUtils {
        public static double power(double base, int exponent) {
            // TODO: Implementasi power function
            return 0.0;
        }

        public static boolean isPrime(int number) {
            // TODO: Check apakah number adalah prime
            return false;
        }

        public static int gcd(int a, int b) {
            // TODO: Greatest Common Divisor
            return 0;
        }
    }

    public static class StringUtils {
        public static String reverse(String str) {
            // TODO: Reverse string
            return null;
        }

        public static boolean isPalindrome(String str) {
            // TODO: Check palindrome
            return false;
        }

        public static int countWords(String str) {
            // TODO: Count words in string
            return 0;
        }
    }

    public static class ArrayUtils {
        public static void printMatrix(int[][] matrix) {
            // TODO: Print 2D array dengan format rapi
        }

        public static int[] findDuplicates(int[] array) {
            // TODO: Find duplicate elements
            return null;
        }

        public static boolean areEqual(int[] array1, int[] array2) {
            // TODO: Compare dua array
            return false;
        }
    }

    // ===== METHOD CHAINING EXAMPLE =====

    public static class Calculator {
        private double value;

        public Calculator(double initial) {
            this.value = initial;
        }

        public Calculator add(double n) {
            // TODO: Add dan return this untuk chaining
            return this;
        }

        public Calculator multiply(double n) {
            // TODO: Multiply dan return this untuk chaining
            return this;
        }

        public Calculator subtract(double n) {
            // TODO: Subtract dan return this untuk chaining
            return this;
        }

        public double getResult() {
            return value;
        }
    }
}

