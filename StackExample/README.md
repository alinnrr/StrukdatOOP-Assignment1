# OOP - Object Oriented Programming

## Mata Kuliah
Struktur Data dan Pemrograman Berorientasi Objek

- **Nama**: Ferlin Erdin
- **NRP**: (Isi NRP kamu)
- **Kelas**: (Isi kelas kamu)

---

# Class & Object

## 1. Class
Pada program ini terdapat class utama `Car` yang dibuat sebagai **abstract class**.  
Class ini menyimpan atribut umum dari sebuah mobil seperti:

- brand
- color
- type
- speed

Class `Car` kemudian diturunkan menjadi dua class turunan yaitu:

- `ElectricCar`
- `GasCar`

Contoh class pada source code:

```java
abstract class Car {

    private String brand;
    private String color;
    private String type;
    private int speed;

    public Car(String brand, String color, String type, int speed) {
        this.brand = brand;
        this.color = color;
        this.type = type;
        this.speed = speed;
    }

    public abstract void engineType();
}
```

---

## 2. Object
Object dibuat dari class turunan `ElectricCar` dan `GasCar` di dalam method `main`.

Contoh pembuatan object:

```java
Car myTesla = new ElectricCar("Tesla", "White", "Model 3", 250);
Car myToyota = new GasCar("Toyota", "Black", "Supra", 220);
```

Object `myTesla` dibuat dari class `ElectricCar`, sedangkan object `myToyota` dibuat dari class `GasCar`.

---

# Constructor

## Constructor
Constructor digunakan untuk **memberikan nilai awal pada object saat object dibuat**.

Contoh constructor pada parent class `Car`:

```java
public Car(String brand, String color, String type, int speed) {
    this.brand = brand;
    this.color = color;
    this.type = type;
    this.speed = speed;
}
```

Constructor ini dipanggil oleh class turunan menggunakan keyword `super`.

Contoh constructor pada class turunan:

```java
public ElectricCar(String brand, String color, String type, int speed) {
    super(brand, color, type, speed);
}

public GasCar(String brand, String color, String type, int speed) {
    super(brand, color, type, speed);
}
```

Keyword `super()` digunakan untuk memanggil constructor dari parent class.

---

# 4 Pilar OOP

## 1. Encapsulation
Encapsulation adalah konsep **menyembunyikan data penting di dalam class menggunakan `private`**, lalu menyediakan akses melalui method seperti getter.

Contoh pada class `Car`:

```java
private String brand;
private String color;
private String type;
private int speed;

public String getBrand() {
    return brand;
}
```

Dengan cara ini, atribut tidak bisa diakses langsung dari luar class sehingga data menjadi lebih aman.

---

## 2. Abstraction
Abstraction adalah konsep **menyederhanakan kompleksitas program dengan hanya menampilkan bagian yang penting saja**.

Pada program ini, class `Car` dibuat sebagai **abstract class** dan memiliki **abstract method** `engineType()`.

```java
abstract class Car {
    public abstract void engineType();
}
```

Method ini tidak memiliki isi sehingga harus diimplementasikan oleh class turunannya.

---

## 3. Inheritance
Inheritance adalah konsep **pewarisan class**, dimana class turunan mewarisi atribut dan method dari class induknya.

Pada program ini:

```java
class ElectricCar extends Car
class GasCar extends Car
```

Artinya:

- `ElectricCar` mewarisi class `Car`
- `GasCar` juga mewarisi class `Car`

Sehingga kedua class tersebut dapat menggunakan atribut dan method dari class `Car`.

---

## 4. Polymorphism
Polymorphism adalah konsep dimana **method yang sama dapat memiliki perilaku yang berbeda tergantung object yang memanggilnya**.

Method `engineType()` dioverride di masing-masing class turunan.

Contoh pada `ElectricCar`:

```java
@Override
public void engineType() {
    System.out.println("Engine Type : Electric Motor");
}
```

Contoh pada `GasCar`:

```java
@Override
public void engineType() {
    System.out.println("Engine Type : Gasoline Engine");
}
```

Method tersebut kemudian dipanggil melalui object:

```java
myTesla.engineType();
myToyota.engineType();
```

Hasilnya akan berbeda tergantung jenis object yang dibuat.

---

# Ringkasan 4 Pilar OOP pada Program

1. **Abstraction** → `abstract class Car`
2. **Encapsulation** → atribut `private` + getter
3. **Inheritance** → `ElectricCar` dan `GasCar` mewarisi `Car`
4. **Polymorphism** → method `engineType()` dioverride di class turunan
