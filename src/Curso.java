public class Curso {
    protected String nombreCurso;
    protected int horasTotales;
    protected double precioBase;
    public Curso(String nombre, int horas, double precio) {
        nombreCurso = nombre; horasTotales = horas; precioBase = precio;
    }
    public double calcularCostoFinal() { return precioBase; }
    public boolean inscribirAlumno(String alumno) { System.out.println(alumno + " inscripto en " + nombreCurso); return true; }
    public void mostrarCurso() { System.out.println(nombreCurso + " - " + horasTotales + " horas - Precio: $" + calcularCostoFinal()); }
}