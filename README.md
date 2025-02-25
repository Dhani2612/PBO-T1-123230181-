# Makhluk Hidup - Program OOP Java

## Deskripsi
Program ini merupakan implementasi **Object-Oriented Programming (OOP) dalam Java** dengan konsep **Abstraction, Inheritance, Polymorphism, Interface, dan Exception Handling**. Tema yang digunakan adalah **Makhluk Hidup**, di mana terdapat beberapa kelas yang merepresentasikan manusia, hewan, dan tumbuhan.

## Struktur Kelas

1. **MakhlukHidup (Abstract Class)** : Kelas dasar untuk semua makhluk hidup.
2. **Manusia (Extends MakhlukHidup, Implements Bergerak)** : Merepresentasikan manusia yang bisa bergerak.
3. **Hewan (Extends MakhlukHidup, Implements Bergerak)** : Merepresentasikan hewan yang bisa bergerak.
4. **Tumbuhan (Extends MakhlukHidup)** : Merepresentasikan tumbuhan yang tidak memiliki pergerakan aktif.
5. **Bergerak (Interface)** : Digunakan oleh manusia dan hewan untuk menunjukkan pergerakan mereka.
6. **UsiaTidakValidException (Custom Exception)** : Digunakan untuk menangani input umur yang tidak valid.
7. **MainProgram (Main Class)** : Menjalankan program dan menampilkan output.

## Konsep OOP yang Diterapkan

1. **Abstraction**
   - MakhlukHidu` sebagai kelas abstrak yang mendefinisikan metode umum.
   - Bergerak sebagai interface yang harus diimplementasikan oleh Manusia dan Hewan.

2. **Inheritance** (Pewarisan)
   - Manusia, Hewan, dan Tumbuhan mewarisi MakhlukHidup.

3. **Polymorphism**
   - Manusia dan Hewan mengimplementasikan metode yang sama dari interface Bergerak dengan cara yang berbeda.
   - Override metode bernapas() dan makan() di masing-masing subclass.

4. **Exception Handling**
   - UsiaTidakValidException digunakan untuk menangani kesalahan jika umur yang dimasukkan tidak valid.
