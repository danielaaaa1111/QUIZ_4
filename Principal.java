import java.time.LocalDate;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        Date day = new Date();
        System.out.printf("Fecha Actual: %td/%tm/%tY %n", day, day, day);

        LocalDate fechaNacimientoSantiago = LocalDate.of(2003, 5, 9);
        Estudiante Santiago = new Estudiante("Santiago", fechaNacimientoSantiago);
        Santiago.setNotaMateria1(3.1);
        Santiago.setNotaMateria2(2.7);
        Santiago.setNotaMateria3(4.3);

        System.out.println("Nombre: " + Santiago.getNombre() + "\n" + "Fecha de nacimiento: " + Santiago.getFechaNacimiento());
        System.out.println("Nota 1: " + Santiago.getNotaMateria1() + "\n" + "Nota 2: " + Santiago.getNotaMateria2() + "\n" + "Nota 3: " + Santiago.getNotaMateria3() );
        System.out.println("Promedio: " + Santiago.getPromedio());
        System.out.println("Tiene " + Santiago.getEdad() + " años. \n" );

        LocalDate fechaNacimientoDaniel = LocalDate.of(2010, 4, 5);
        Estudiante Daniel = new Estudiante("Daniel", fechaNacimientoDaniel);
        Daniel.setNotaMateria1(1.7);
        Daniel.setNotaMateria2(4.5);
        Daniel.setNotaMateria3(2.5);

        System.out.println("Nombre: " + Daniel.getNombre() + "\n" + "Fecha de nacimiento: " + Daniel.getFechaNacimiento());
        System.out.println("Nota 1: " + Daniel.getNotaMateria1() + "\n" + "Nota 2: " + Daniel.getNotaMateria2() + "\n" + "Nota 3: " + Daniel.getNotaMateria3() );
        System.out.println("Promedio: " + Daniel.getPromedio());
        System.out.println("Tiene " + Daniel.getEdad() + " años.");
    }
}
