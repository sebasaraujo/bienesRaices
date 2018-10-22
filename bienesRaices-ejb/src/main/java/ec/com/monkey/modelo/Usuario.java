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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
    , @NamedQuery(name = "Usuario.findById", query = "SELECT u FROM Usuario u WHERE u.id = :id")
    , @NamedQuery(name = "Usuario.findByEstado", query = "SELECT u FROM Usuario u WHERE u.estado = :estado")
    , @NamedQuery(name = "Usuario.findByFecCreacion", query = "SELECT u FROM Usuario u WHERE u.fecCreacion = :fecCreacion")
    , @NamedQuery(name = "Usuario.findByNomUsuarioCrc", query = "SELECT u FROM Usuario u WHERE u.nomUsuarioCrc = :nomUsuarioCrc")
    , @NamedQuery(name = "Usuario.findByFecActualizacion", query = "SELECT u FROM Usuario u WHERE u.fecActualizacion = :fecActualizacion")
    , @NamedQuery(name = "Usuario.findByNomUsuarioAct", query = "SELECT u FROM Usuario u WHERE u.nomUsuarioAct = :nomUsuarioAct")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "fec_actualizacion")
    @Temporal(TemporalType.DATE)
    private Date fecActualizacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nom_usuario_act")
    private int nomUsuarioAct;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    private List<ClaveUsuario> claveUsuarioList;
    @JoinColumn(name = "persona", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Persona persona;
    @JoinColumn(name = "rol", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Rol rol;

    public Usuario() {
    }

    public Usuario(Integer id) {
        this.id = id;
    }

    public Usuario(Integer id, String estado, Date fecCreacion, int nomUsuarioCrc, Date fecActualizacion, int nomUsuarioAct) {
        this.id = id;
        this.estado = estado;
        this.fecCreacion = fecCreacion;
        this.nomUsuarioCrc = nomUsuarioCrc;
        this.fecActualizacion = fecActualizacion;
        this.nomUsuarioAct = nomUsuarioAct;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public int getNomUsuarioAct() {
        return nomUsuarioAct;
    }

    public void setNomUsuarioAct(int nomUsuarioAct) {
        this.nomUsuarioAct = nomUsuarioAct;
    }

    @XmlTransient
    public List<ClaveUsuario> getClaveUsuarioList() {
        return claveUsuarioList;
    }

    public void setClaveUsuarioList(List<ClaveUsuario> claveUsuarioList) {
        this.claveUsuarioList = claveUsuarioList;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
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
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.monkey.modelo.Usuario[ id=" + id + " ]";
    }
    
}
