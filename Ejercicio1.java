import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        //Constructores para los ejercicios 1, 2 y 3, con datos establecidos por mí.
        Libro miLibro = new Libro("1000 años de programacion", "Jhon Arrieta Arrieta", "1000");
        System.out.println(miLibro);
        System.out.println("\n");
        CuentaBancaria cuenta = new CuentaBancaria("0002011933", "Cuenta de ahorros", 2000000); 
        System.out.println(cuenta);
        System.out.println("\n");
        Estudiante estudiante = new Estudiante("Jhon ", "1000", "X");
        System.out.println(estudiante);
        System.out.println("\n");

        //Constructores para el ejercicio final
        // Instanciamos la clase Scanner para ingresar los datos por consola
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del autor:");
        String nomreAutor = scanner.nextLine();
        System.out.println("Ingrese el nombre del libro:");
        String titulo = scanner.nextLine();
        System.out.println("Ingrese la cantidad de paginas:");
        String numeroPaginas = scanner.nextLine();

        //Constructor vacio para la clase libro
        Libro libro = new Libro();
        libro.autor = nomreAutor;
        libro.numeroPaginas =  titulo;
        libro.numeroPaginas = numeroPaginas;

        //Constructor con valores establecidos por el usuario
        Libro lb = new Libro(titulo, nomreAutor, numeroPaginas);
        System.out.println(lb);
        
        System.out.println("\n");
        //Capturamos valores por consola para asiganrlos al objeto
        System.out.println("Ingrese el numero de cuenta:");
        String numeroCuenta = scanner.next(); 
        System.out.println("Ingrese el saldo:");
        float saldo = scanner.nextFloat();
        System.out.println("Ingrese el tipo de cuenta:");
        String tipoCuenta = scanner.next();

        //Instanciamos los valores obtenidos para establecerlos como valores del objeto de tipo Cuenta Bancaria
        CuentaBancaria cBancaria = new CuentaBancaria();
        cBancaria.numeroCuenta = numeroCuenta;
        cBancaria.saldo = saldo;
        cBancaria.tipoCuenta = tipoCuenta;

        //Constructor con valores establecidos por el usuario
        CuentaBancaria cb = new CuentaBancaria(numeroCuenta, tipoCuenta, saldo);
        
        System.out.println(cb);
        
        System.out.println("\n");

        //Capturamos valores por consola para asiganrlos al objeto
        System.out.println("Ingrese el nombre del estudiante:");
        String nombreEstudiante = scanner.next();
        System.out.println("Ingrese la edad del estudiante:");
        String edadEstudiante = scanner.next();
        System.out.println("Ingrese el curso del estudiante:");
        String curso = scanner.next();
    
        //Instanciamos los valores obtenidos para establecerlos como valores del objeto de tipo Estudiante
        Estudiante student = new Estudiante();
        student.nombre = nombreEstudiante;
        student.edad = edadEstudiante;
        student.curso = curso;

         //Constructor con valores establecidos por el usuario
        Estudiante est = new Estudiante(nombreEstudiante, edadEstudiante, curso);
        System.out.println(est);
        scanner.close();
}
}