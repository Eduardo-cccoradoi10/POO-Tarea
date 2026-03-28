package Encapsulacion;

public class Main {
    public static void main(String[] args) {

        System.out.println("===== 1. PERSONAS =====");
        Persona p1 = new Persona("Carlos", "Ramírez", 25);
        Persona p2 = new Persona("Ana", "López", 30);
        Persona p3 = new Persona("Luis", "Martínez", 20);
        p1.mostrar();
        p2.mostrar();
        p3.mostrar();

        System.out.println("\n===== 2. RECTÁNGULOS =====");
        Rectangulo r1 = new Rectangulo(10, 5);
        Rectangulo r2 = new Rectangulo(8, 12);
        System.out.println("Área R1: " + r1.getArea());
        System.out.println("Área R2: " + r2.getArea());
        System.out.println("Rectángulo con mayor área: " + 
            (r1.getArea() > r2.getArea() ? "R1" : "R2"));

        System.out.println("\n===== 3. PRODUCTOS =====");
        Producto prod1 = new Producto("A01", "Laptop", 5000);
        Producto prod2 = new Producto("B02", "Mouse", 150);
        prod1.aplicarDescuento(10);
        prod2.aplicarDescuento(20);
        prod1.mostrar();
        prod2.mostrar();

        System.out.println("\n===== 4. CUENTA =====");
        Cuenta cuenta = new Cuenta("Carlos", 1000);
        cuenta.depositar(500);
        cuenta.retirar(300);
        cuenta.retirar(2000);
        cuenta.mostrarSaldo();

        System.out.println("\n===== 5. LIBROS =====");
        Libro l1 = new Libro("El Quijote", "Cervantes", 863);
        Libro l2 = new Libro("El Principito", "Saint-Exupéry", 120);
        Libro l3 = new Libro("IT", "Stephen King", 1138);
        Libro[] libros = {l1, l2, l3};
        for (Libro libro : libros) {
            libro.mostrar();
            System.out.println("¿Es largo? " + libro.esLargo());
        }

        System.out.println("\n===== 6. CALCULADORA =====");
        Calculadora calc = new Calculadora();
        System.out.println("Suma: " + calc.sumar(10, 5));
        System.out.println("Resta: " + calc.restar(10, 5));
        System.out.println("Multiplicación: " + calc.multiplicar(10, 5));
        System.out.println("División: " + calc.dividir(10, 0));

        System.out.println("\n===== 7. FECHAS =====");
        Fecha f1 = new Fecha(15, 8, 2024);
        Fecha f2 = new Fecha(32, 5, 2023);
        Fecha f3 = new Fecha(10, 13, 2022);
        Fecha[] fechas = {f1, f2, f3};
        for (Fecha fecha : fechas) {
            fecha.mostrar();
            System.out.println("¿Es válida? " + fecha.esValida());
        }
    }
}

