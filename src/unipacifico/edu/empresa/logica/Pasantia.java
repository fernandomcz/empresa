
package unipacifico.edu.empresa.logica;

public class Pasantia {
    private int codigo;
    private String nombreEmpresa;
    private date  fechaInicio;
    private date fechaFinalizacion;
    private int numPasantesRequeridos;
    private String descripcion;
    private int numConvenioMacro;
    private String estado;
    public Pasantia(int codigo,String nombreEmpresa,date  fechaInicio,date fechaFinalizacion,int numPasantesRequeridos, String descripcion,int numConvenioMacro,String estado){
       this.codigo=codigo;
       this.nombreEmpresa=nombreEmpresa;
       this.fechaInicio=fechaInicio;
       this.fechaFinalizacion=fechaFinalizacion;
       this.numPasantesRequeridos=numPasantesRequeridos;
       this.descripcion=descripcion;
       this.numConvenioMacro=numConvenioMacro;
       this.estado=estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public int getNumPasantesRequeridos() {
        return numPasantesRequeridos;
    }

    public void setNumPasantesRequeridos(int numPasantesRequeridos) {
        this.numPasantesRequeridos = numPasantesRequeridos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumConvenioMacro() {
        return numConvenioMacro;
    }

    public void setNumConvenioMacro(int numConvenioMacro) {
        this.numConvenioMacro = numConvenioMacro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    

   
    
}
