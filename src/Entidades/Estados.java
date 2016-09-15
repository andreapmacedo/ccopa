package Entidades;

import java.sql.Date;

/**
 *
 * @author Andre
 */
public class Estados {

    private Integer idEstado;
    private String nomeEstado;

    public Estados() {
    }


    public Estados(Integer idEstado, String nomeEstado) {
        this.idEstado = idEstado;
        this.nomeEstado = nomeEstado;
    }
    
    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    public Estados(Integer idEmployer) {
        this.idEstado = idEmployer;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estados other = (Estados) obj;
        if (this.idEstado != other.idEstado && (this.idEstado == null || !this.idEstado.equals(other.idEstado))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + (this.idEstado != null ? this.idEstado.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return getNomeEstado();
    }

}
