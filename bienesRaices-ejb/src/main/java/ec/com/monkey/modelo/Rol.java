/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.monkey.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author luisp.araujo
 */
@Entity
@Table(name = "rol")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rol.findAll", query = "SELECT r FROM Rol r")
    , @NamedQuery(name = "Rol.findById", query = "SELECT r FROM Rol r WHERE r.id = :id")
    , @NamedQuery(name = "Rol.findByNombre", query = "SELECT r FROM Rol r WHERE r.nombre = :nombre")
    , @NamedQuery(name = "Rol.findByEstado", query = "SELECT r FROM Rol r WHERE r.estado = :estado")
    , @NamedQuery(name = "Rol.findByFecCreacion", query = "SELECT r FROM Rol r WHERE r.fecCreacion = :fecCreacion")
    , @NamedQuery(name = "Rol.findByNomUsuarioCrc", query = "SELECT r FROM Rol r WHERE r.nomUsuarioCrc = :nomUsuarioCrc")
    , @NamedQuery(name = "Rol.findByFecActualizacion", query = "SELECT r FROM Rol r WHERE r.fecActualizacion = :fecActualizacion")
    , @NamedQuery(name = "Rol.findByNomUsuarioAct", query = "SELECT r FROM Rol r WHERE r.nomUsuarioAct = :nomUsuarioAct")})
public class Rol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre")
    private String nombre;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rol")
    private List<RecursoRol> recursoRolList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rol")
    private List<Usuario> usuarioList;

    public Rol() {
    }

    public Rol(Integer id) {
        this.id = id;
    }

    public Rol(Integer id, String nombre, String estado, Date fecCreacion, int nomUsuarioCrc) {
        this.id = id;
        this.nombre = nombre;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    @XmlTransient
    public List<RecursoRol> getRecursoRolList() {
        return recursoRolList;
    }

    public void setRecursoRolList(List<RecursoRol> recursoRolList) {
        this.recursoRolList = recursoRolList;
    }

    @XmlTransient
    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
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
        if (!(object instanceof Rol)) {
            return false;
        }
        Rol other = (Rol) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.monkey.modelo.Rol[ id=" + id + " ]";
    }
    
}
