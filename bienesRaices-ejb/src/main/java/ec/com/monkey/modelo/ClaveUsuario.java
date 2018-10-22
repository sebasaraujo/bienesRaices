/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.monkey.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author luisp.araujo
 */
@Entity
@Table(name = "clave_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ClaveUsuario.findAll", query = "SELECT c FROM ClaveUsuario c")
    , @NamedQuery(name = "ClaveUsuario.findById", query = "SELECT c FROM ClaveUsuario c WHERE c.id = :id")
    , @NamedQuery(name = "ClaveUsuario.findByClave", query = "SELECT c FROM ClaveUsuario c WHERE c.clave = :clave")
    , @NamedQuery(name = "ClaveUsuario.findByEstado", query = "SELECT c FROM ClaveUsuario c WHERE c.estado = :estado")
    , @NamedQuery(name = "ClaveUsuario.findByFecCreacion", query = "SELECT c FROM ClaveUsuario c WHERE c.fecCreacion = :fecCreacion")
    , @NamedQuery(name = "ClaveUsuario.findByNomUsuarioCrc", query = "SELECT c FROM ClaveUsuario c WHERE c.nomUsuarioCrc = :nomUsuarioCrc")
    , @NamedQuery(name = "ClaveUsuario.findByFecActualizacion", query = "SELECT c FROM ClaveUsuario c WHERE c.fecActualizacion = :fecActualizacion")
    , @NamedQuery(name = "ClaveUsuario.findByNomUsuarioAct", query = "SELECT c FROM ClaveUsuario c WHERE c.nomUsuarioAct = :nomUsuarioAct")})
public class ClaveUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "clave")
    private String clave;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fec_creacion")
    @Temporal(TemporalType.DATE)
    private Date fecCreacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nom_usuario_crc")
    private int nomUsuarioCrc;
    @Column(name = "fec_actualizacion")
    @Temporal(TemporalType.DATE)
    private Date fecActualizacion;
    @Column(name = "nom_usuario_act")
    private Integer nomUsuarioAct;
    @JoinColumn(name = "usuario", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Usuario usuario;

    public ClaveUsuario() {
    }

    public ClaveUsuario(Integer id) {
        this.id = id;
    }

    public ClaveUsuario(Integer id, String clave, String estado, Date fecCreacion, int nomUsuarioCrc) {
        this.id = id;
        this.clave = clave;
        this.estado = estado;
        this.fecCreacion = fecCreacion;
        this.nomUsuarioCrc = nomUsuarioCrc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFecCreacion() {
        return fecCreacion;
    }

    public void setFecCreacion(Date fecCreacion) {
        this.fecCreacion = fecCreacion;
    }

    public int getNomUsuarioCrc() {
        return nomUsuarioCrc;
    }

    public void setNomUsuarioCrc(int nomUsuarioCrc) {
        this.nomUsuarioCrc = nomUsuarioCrc;
    }

    public Date getFecActualizacion() {
        return fecActualizacion;
    }

    public void setFecActualizacion(Date fecActualizacion) {
        this.fecActualizacion = fecActualizacion;
    }

    public Integer getNomUsuarioAct() {
        return nomUsuarioAct;
    }

    public void setNomUsuarioAct(Integer nomUsuarioAct) {
        this.nomUsuarioAct = nomUsuarioAct;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClaveUsuario)) {
            return false;
        }
        ClaveUsuario other = (ClaveUsuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.monkey.modelo.ClaveUsuario[ id=" + id + " ]";
    }
    
}
