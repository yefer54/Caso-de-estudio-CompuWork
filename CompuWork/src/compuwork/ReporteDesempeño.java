
package compuwork;


public class ReporteDesempeño {
    
    private String nombreEmpleado;
    private int idEmpleado;
    private String departamentoEmpleado;
    private String reporteDesempeño;

    public ReporteDesempeño(String nombreEmpleado, int idEmpleado, String departamentoEmpleado, String reporteDesempeño) {
        this.nombreEmpleado = nombreEmpleado;
        this.idEmpleado = idEmpleado;
        this.departamentoEmpleado = departamentoEmpleado;
        this.reporteDesempeño = reporteDesempeño;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getDepartamentoEmpleado() {
        return departamentoEmpleado;
    }

    public void setDepartamentoEmpleado(String departamentoEmpleado) {
        this.departamentoEmpleado = departamentoEmpleado;
    }

    public String getReporteDesempeño() {
        return reporteDesempeño;
    }

    public void setReporteDesempeño(String reporteDesempeño) {
        this.reporteDesempeño = reporteDesempeño;
    }

}
