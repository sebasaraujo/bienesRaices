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
@Table(name = "plan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Plan.findAll", query = "SELECT p FROM Plan p")
    , @NamedQuery(name = "Plan.findById", query = "SELECT p FROM Plan p WHERE p.id = :id")
    , @NamedQuery(name = "Plan.findByValorInicial", query = "SELECT p FROM Plan p WHERE p.valorInicial = :valorInicial")
    , @NamedQuery(name = "Plan.findByValorFinal", query = "SELECT p FROM Plan p WHERE p.valorFinal = :valorFinal")
    , @NamedQuery(name = "Plan.findByCostoTrimestral", query = "SELECT p FROM Plan p WHERE p.costoTrimestral = :costoTrimestral")
    , @NamedQuery(name = "Plan.findByCostoAnual", query = "SELECT p FROM Plan p WHERE p.costoAnual = :costoAnual")
    , @NamedQuery(name = "Plan.findByEstado", query = "SELECT p FROM Plan p WHERE p.estado = :estado")
    , @NamedQuery(name = "Plan.findByFecCreacion", query = "SELECT p FROM Plan p WHERE p.fecCreacion = :fecCreacion")
    , @NamedQuery(name = "Plan.findByNomUsuarioCrc", query = "SELECT p FROM Plan p WHERE p.nomUsuarioCrc = :nomUsuarioCrc")
    , @NamedQuery(name = "Plan.findByFecActualizacion", query = "SELECT p FROM Plan p WHERE p.fecActualizacion = :fecActualizacion")
    , @NamedQuery(name = "Plan.findByNomUsuarioAct", query = "SELECT p FROM Plan p WHERE p.nomUsuarioAct = :nomUsuarioAct")})
public class Plan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor_inicial")
    private int valorInicial;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor_final")
    private int valorFinal;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "costo_trimestral")
    private Double costoTrimestral;
    @Basic(optional = false)
    @NotNull
    @Column(name = "costo_anual")
    private double costoAnual;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "plan")
    private List<Publicacion> publicacionList;

    public Plan() {
    }

    public Plan(Integer id) {
        this.id = id;
    }

    public Plan(Integer id, int valorInicial, int valorFinal, double costoAnual, String estado, Date fecCreacion, int nomUsuarioCrc) {
        this.id = id;
        this.valorInicial = valorInicial;
        this.valorFinal = valorFinal;
        this.costoAnual = costoAnual;
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

    public int getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(int valorInicial) {
        this.valorInicial = valorInicial;
    }

    public int getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(int valorFinal) {
        this.valorFinal = valorFinal;
    }

    public Double getCostoTrimestral() {
        return costoTrimestral;
    }

    public void setCostoTrimestral(Double costoTrimestral) {
        this.costoTrimestral = costoTrimestral;
    }

    public double getCostoAnual() {
        return costoAnual;
    }

    public void setCostoAnual(double costoAnual) {
        this.costoAnual = costoAnual;
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
    public List<Publicacion> getPublicacionList() {
        return publicacionList;
    }

    public void setPublicacionList(List<Publicacion> publicacionList) {
        this.publicacionList = publicacionList;
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
        if (!(object instanceof Plan)) {
            return false;
        }
        Plan other = (Plan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.monkey.modelo.Plan[ id=" + id + " ]";
    }
    
}
