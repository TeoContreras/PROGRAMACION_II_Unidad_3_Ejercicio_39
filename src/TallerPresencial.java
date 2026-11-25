public class TallerPresencial extends Curso {
    private String numeroAula, direccion;
    public TallerPresencial(String nombre, int horas, double precio, String aula, String direccion) {
        super(nombre, horas, precio); numeroAula = aula; this.direccion = direccion;
    }
    @Override
    public boolean inscribirAlumno(String alumno) {
        System.out.println(alumno + " inscripto al taller presencial en aula " + numeroAula);
        return true;
    }
}