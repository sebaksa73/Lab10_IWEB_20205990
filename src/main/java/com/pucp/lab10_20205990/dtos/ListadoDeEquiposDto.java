package com.pucp.lab10_20205990.dtos;

public class ListadoDeEquiposDto {

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIpGestion() {
        return ipGestion;
    }

    public void setIpGestion(String ipGestion) {
        this.ipGestion = ipGestion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSedeNombre() {
        return sedeNombre;
    }

    public void setSedeNombre(String sedeNombre) {
        this.sedeNombre = sedeNombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getMesesOperativos() {
        return mesesOperativos;
    }

    public void setMesesOperativos(int mesesOperativos) {
        this.mesesOperativos = mesesOperativos;
    }

    private int idEquipo;
    private String hostname;
    private String tipo;
    private String ipGestion;
    private String estado;
    private String sedeNombre;
    private String ciudad;
    private int mesesOperativos;



}

