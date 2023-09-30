import java.util.Date;

public class Estudiante {
    private String nombre;
    private Date FechaNacimiento;
    private double notamateria1;
    private double notamateria2;
    private double notamateria3;

    public Estudiante(String nombre, Date fechaNacimiento, double notamateria1, double notamateria2, double notamateria3) {
        this.nombre = nombre;
        this.FechaNacimiento = fechaNacimiento;
        this.notamateria1 = notamateria1;
        this.notamateria2 = notamateria2;
        this.notamateria3 = notamateria3;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechadenacimiento() {
        return FechaNacimiento;
    }

    public void setFechadenacimiento(Date fechadenacimiento) {
        FechaNacimiento = fechadenacimiento;
    }

    public double getNotamateria1() {
        return notamateria1;
    }

    public void setNotamateria1(float notamateria1) {
        this.notamateria1 = notamateria1;
    }

    public double getNotamateria2() {
        return notamateria2;
    }

    public void setNotamateria2(float notamateria2) {
        this.notamateria2 = notamateria2;
    }

    public double getNotamateria3() {
        return notamateria3;
    }

    public void setNotamateria3(float notamateria3) {
        this.notamateria3 = notamateria3;
    }

    public int getEdad() {
        Date fechaActual = new Date();
        int edad = fechaActual.getYear() - FechaNacimiento.getYear();
        if (FechaNacimiento.getMonth() > fechaActual.getMonth() ||
                (FechaNacimiento.getMonth() == fechaActual.getMonth() &&
                        FechaNacimiento.getDate() > fechaActual.getDate())) {
            edad--;
        }
        return edad;
    }

    public double getPromedio() {
        return (notamateria1 + notamateria2 + notamateria3) / 3.0;
    }

    public static void main(String[] args) {
        Date fechaNacimiento = new Date(2000 - 1900, 5, 15); //edad ejemplo
        Estudiante estudiante = new Estudiante("Juan", fechaNacimiento, 8.5, 9.0, 7.5);

        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad() + " años");
        System.out.println("Promedio de notas: " + estudiante.getPromedio());
    }
}
