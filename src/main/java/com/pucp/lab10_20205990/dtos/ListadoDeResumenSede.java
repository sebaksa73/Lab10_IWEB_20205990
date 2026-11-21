package com.pucp.lab10_20205990.dtos;

public class ListadoDeResumenSede {

    public String getSedeNombre() {
        return sedeNombre;
    }

    public void setSedeNombre(String sedeNombre) {
        this.sedeNombre = sedeNombre;
    }

    public int getTotalEquipos() {
        return totalEquipos;
    }

    public void setTotalEquipos(int totalEquipos) {
        this.totalEquipos = totalEquipos;
    }

    public String getOperativos() {
        return operativos;
    }

    public void setOperativos(String operativos) {
        this.operativos = operativos;
    }

    public String getCaidos() {
        return caidos;
    }

    public void setCaidos(String caidos) {
        this.caidos = caidos;
    }

    private String sedeNombre;
    private int totalEquipos;
    private String operativos;
    private String caidos;


}
