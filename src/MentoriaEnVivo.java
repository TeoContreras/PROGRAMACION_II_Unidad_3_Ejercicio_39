public class MentoriaEnVivo extends Curso {
    private String enlaceVideollamada;
    private int cupoMaximo, inscriptos;
    public MentoriaEnVivo(String nombre, int horas, double precio, String enlace, int cupo) {
        super(nombre, horas, precio); enlaceVideollamada = enlace; cupoMaximo = cupo; inscriptos = 0;
    }
    @Override
    public boolean inscribirAlumno(String alumno) {
        if (inscriptos < cupoMaximo) { inscriptos++; System.out.println(alumno + " inscripto en la mentoria."); return true; }
        System.out.println("No hay cupos disponibles."); return false;
    }
}