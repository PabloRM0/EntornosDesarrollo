import java.util.Date;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Hola mundo");

        String nombre = "Pablo";
        System.out.println("Mi nombre es " + nombre);

        Date fechaActual = new Date();

        System.out.println("La fecha y hora actual es: " + fechaActual);

        System.out.println("");

        System.out.print("Ingrese un número: ");
        int numero = teclado.nextInt();

        Usuario[] usuarios = crearUsuarios(numero);

        for (int i = 0; i < usuarios.length; i++) {
            System.out.println("Introduce usuario " + (i + 1) + ":");
            System.out.print("Nombre: ");
            usuarios[i].nombre = teclado.next();
            System.out.print("Apellidos: ");
            usuarios[i].apellidos = teclado.next();
            System.out.print("Email: ");
            usuarios[i].email = teclado.next();
        }

        System.out.println("Informacion de los usuarios:");
        for (Usuario usuario : usuarios) {
            System.out.println("Nombre: " + usuario.nombre + ", Apellidos: " + usuario.apellidos + ", Email: " + usuario.email);
        }
    }

    public static Usuario[] crearUsuarios(int numero) {
        return new Usuario[numero];
    }

    }
}
