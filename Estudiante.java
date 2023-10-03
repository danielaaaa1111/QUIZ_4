import java.time.LocalDate;
import java.time.Period;
/**
 * clase Estudiante
 */
public class Estudiante {
    /**
     * Atributos
     */
    private String nombre;
    private double notaMateria1;
    private double notaMateria2;
    private double notaMateria3;
    private LocalDate fechaNacimiento;
    private double getPromedio;


    public Estudiante(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.notaMateria1 = 0.0;
        this.notaMateria2 = 0.0;
        this.notaMateria3 = 0.0;
        this.getPromedio = getPromedio;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNotaMateria1(double notaMateria1) {
        this.notaMateria1 = notaMateria1;
    }

    public void setNotaMateria2(double notaMateria2) {
        this.notaMateria2 = notaMateria2;
    }

    public void setNotaMateria3(double notaMateria3) {
        this.notaMateria3 = notaMateria3;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNotaMateria1() {
        return notaMateria1;
    }

    public double getNotaMateria2() {
        return notaMateria2;
    }

    public double getNotaMateria3() {
        return notaMateria3;
    }

    public int getEdad() {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        return periodo.getYears();
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public double getPromedio (){
        return (notaMateria1+notaMateria2+notaMateria3)/3;
    }

    public double getGetPromedio() {
        return getPromedio;
    }
}