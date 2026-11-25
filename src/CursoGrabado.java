public class CursoGrabado extends Curso {
    private String plataforma, fechaLimiteAcceso;
    public CursoGrabado(String nombre, int horas, double precio, String plataforma, String fecha) {
        super(nombre, horas, precio); this.plataforma = plataforma; fechaLimiteAcceso = fecha;
    }
    @Override
    public double calcularCostoFinal() { return precioBase * 0.85; }
}