package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado(1L, 20, "andrés"));
        empleados.add(new Empleado(6L, 18, "Fernando"));
        empleados.add(new Empleado(8L, 17, "Andrey"));

        /*empleados.stream()
                .filter(empleado -> empleado.getNombre().toUpperCase().charAt(0) == 'A')
                .forEach(System.out::println);*/

        //System.out.println(empleadosFiltrados);
        //System.out.println(empleados);

        Optional<Empleado> optionalEmpleado =
                Optional.of(new Empleado(5L, 10, "Alan Brito"))
                        .filter(empleado -> empleado.getEdad() > 18);

        optionalEmpleado.orElseGet(() -> new Empleado(4L, 25, "Sebastian"));

        System.out.println(optionalEmpleado.isPresent());
    }
}
