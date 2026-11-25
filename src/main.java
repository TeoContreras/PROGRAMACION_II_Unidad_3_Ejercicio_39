public class main {
    public static void main(String[] args) {
        CursoGrabado grabado = new CursoGrabado("Java inicial", 30, 50000, "Plataforma", "31/12/2026");
        MentoriaEnVivo mentoria = new MentoriaEnVivo("Programacion", 10, 80000, "meet.google.com", 2);
        TallerPresencial taller = new TallerPresencial("Bases de datos", 8, 60000, "Aula 4", "Mendoza");
        grabado.mostrarCurso(); mentoria.mostrarCurso(); taller.mostrarCurso();
        grabado.inscribirAlumno("Ana");
        mentoria.inscribirAlumno("Luis"); mentoria.inscribirAlumno("Sofia"); mentoria.inscribirAlumno("Juan");
        taller.inscribirAlumno("Pedro");
    }
}