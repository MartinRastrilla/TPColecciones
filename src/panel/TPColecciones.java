package panel;

import java.util.Scanner;

public class TPColecciones {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        DirectorioTelefonico direc = new DirectorioTelefonico();
        Cliente cliente1 = new Cliente(1, "Nico", "Riquelme", "San Luis", "a");
        Cliente cliente2 = new Cliente(2, "Ivan", "Riquelme", "San Luis", "b");
        Cliente cliente3 = new Cliente(3, "Martin", "Lope", "La quiaca", "c");
        direc.agregarCliente("2664123455", cliente1);
        direc.agregarCliente("2664906482", cliente2);
        direc.agregarCliente("2664718256", cliente3);
        System.out.println(direc.buscarCliente("2664906482").getNombre());
        System.out.println(direc.buscarTelefono("Riquelme"));
        
//        boolean exit = false;
//        do {
//            System.out.println("Menu");
//            switch (leer.nextInt()) {
//                case 1:
//                    Cliente cliente1 = new Cliente();
//                    System.out.println("Ingrese número telefono");
//                    direc.agregarCliente(cliente1, leer.nextLong());
//                    System.out.println("Nombre:");
//                    cliente1.setNombre(leer.next());
//                    System.out.println("Apellido:");
//                    cliente1.setApellido(leer.next());
//                    System.out.println("DNI:");
//                    cliente1.setDni(leer.nextInt());
//                    System.out.println("Ciudad:");
//                    cliente1.setCiudad(leer.next());
//                    System.out.println("Direccion:");
//                    cliente1.setDirección(leer.next());
//                    break;
//                default:
//                    throw new AssertionError();
//            }
//        } while (exit);
    }

}
