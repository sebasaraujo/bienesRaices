/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.monkey.modelo;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author luisp.araujo
 */
@Entity
@Table(name = "publicacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Publicacion.findAll", query = "SELECT p FROM Publicacion p")
    , @NamedQuery(name = "Publicacion.findById", query = "SELECT p FROM Publicacion p WHERE p.id = :id")
    , @NamedQuery(name = "Publicacion.findBySector", query = "SELECT p FROM Publicacion p WHERE p.sector = :sector")
    , @NamedQuery(name = "Publicacion.findByDireccion", query = "SELECT p FROM Publicacion p WHERE p.direccion = :direccion")
    , @NamedQuery(name = "Publicacion.findByValor", query = "SELECT p FROM Publicacion p WHERE p.valor = :valor")
    , @NamedQuery(name = "Publicacion.findByAreaConstruccion", query = "SELECT p FROM Publicacion p WHERE p.areaConstruccion = :areaConstruccion")
    , @NamedQuery(name = "Publicacion.findByAreaParqueaderos", query = "SELECT p FROM Publicacion p WHERE p.areaParqueaderos = :areaParqueaderos")
    , @NamedQuery(name = "Publicacion.findByAreaBodega", query = "SELECT p FROM Publicacion p WHERE p.areaBodega = :areaBodega")
    , @NamedQuery(name = "Publicacion.findByAreaServicios", query = "SELECT p FROM Publicacion p WHERE p.areaServicios = :areaServicios")
    , @NamedQuery(name = "Publicacion.findByOtrasAreas", query = "SELECT p FROM Publicacion p WHERE p.otrasAreas = :otrasAreas")
    , @NamedQuery(name = "Publicacion.findByParqueadero", query = "SELECT p FROM Publicacion p WHERE p.parqueadero = :parqueadero")
    , @NamedQuery(name = "Publicacion.findByParqueaderoVisita", query = "SELECT p FROM Publicacion p WHERE p.parqueaderoVisita = :parqueaderoVisita")
    , @NamedQuery(name = "Publicacion.findByNumeroDormitorios", query = "SELECT p FROM Publicacion p WHERE p.numeroDormitorios = :numeroDormitorios")
    , @NamedQuery(name = "Publicacion.findByDormitorioServicio", query = "SELECT p FROM Publicacion p WHERE p.dormitorioServicio = :dormitorioServicio")
    , @NamedQuery(name = "Publicacion.findByNumeroBanos", query = "SELECT p FROM Publicacion p WHERE p.numeroBanos = :numeroBanos")
    , @NamedQuery(name = "Publicacion.findByEquipamiento", query = "SELECT p FROM Publicacion p WHERE p.equipamiento = :equipamiento")
    , @NamedQuery(name = "Publicacion.findByTipoConstruccion", query = "SELECT p FROM Publicacion p WHERE p.tipoConstruccion = :tipoConstruccion")
    , @NamedQuery(name = "Publicacion.findByCisterna", query = "SELECT p FROM Publicacion p WHERE p.cisterna = :cisterna")
    , @NamedQuery(name = "Publicacion.findByGasCentralizado", query = "SELECT p FROM Publicacion p WHERE p.gasCentralizado = :gasCentralizado")
    , @NamedQuery(name = "Publicacion.findByGenerador", query = "SELECT p FROM Publicacion p WHERE p.generador = :generador")
    , @NamedQuery(name = "Publicacion.findByConexionesInternet", query = "SELECT p FROM Publicacion p WHERE p.conexionesInternet = :conexionesInternet")
    , @NamedQuery(name = "Publicacion.findByConexionesCable", query = "SELECT p FROM Publicacion p WHERE p.conexionesCable = :conexionesCable")
    , @NamedQuery(name = "Publicacion.findByLineaTelefonica", query = "SELECT p FROM Publicacion p WHERE p.lineaTelefonica = :lineaTelefonica")
    , @NamedQuery(name = "Publicacion.findByAlarma", query = "SELECT p FROM Publicacion p WHERE p.alarma = :alarma")
    , @NamedQuery(name = "Publicacion.findBySistemaLuces", query = "SELECT p FROM Publicacion p WHERE p.sistemaLuces = :sistemaLuces")
    , @NamedQuery(name = "Publicacion.findBySistemaSonido", query = "SELECT p FROM Publicacion p WHERE p.sistemaSonido = :sistemaSonido")
    , @NamedQuery(name = "Publicacion.findByCondominio", query = "SELECT p FROM Publicacion p WHERE p.condominio = :condominio")
    , @NamedQuery(name = "Publicacion.findByGuardia", query = "SELECT p FROM Publicacion p WHERE p.guardia = :guardia")
    , @NamedQuery(name = "Publicacion.findByAnioConstruccion", query = "SELECT p FROM Publicacion p WHERE p.anioConstruccion = :anioConstruccion")
    , @NamedQuery(name = "Publicacion.findByZonaBbq", query = "SELECT p FROM Publicacion p WHERE p.zonaBbq = :zonaBbq")
    , @NamedQuery(name = "Publicacion.findByGimnasio", query = "SELECT p FROM Publicacion p WHERE p.gimnasio = :gimnasio")
    , @NamedQuery(name = "Publicacion.findByPiscina", query = "SELECT p FROM Publicacion p WHERE p.piscina = :piscina")
    , @NamedQuery(name = "Publicacion.findByOtros", query = "SELECT p FROM Publicacion p WHERE p.otros = :otros")})
public class Publicacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "sector")
    private String sector;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor")
    private double valor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "area_construccion")
    private double areaConstruccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "area_parqueaderos")
    private double areaParqueaderos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "area_bodega")
    private double areaBodega;
    @Basic(optional = false)
    @NotNull
    @Column(name = "area_servicios")
    private double areaServicios;
    @Basic(optional = false)
    @NotNull
    @Column(name = "otras_areas")
    private double otrasAreas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "parqueadero")
    private String parqueadero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "parqueadero_visita")
    private String parqueaderoVisita;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero_dormitorios")
    private int numeroDormitorios;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "dormitorio_servicio")
    private String dormitorioServicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero_banos")
    private int numeroBanos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "equipamiento")
    private String equipamiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "tipo_construccion")
    private String tipoConstruccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "cisterna")
    private String cisterna;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "gas_centralizado")
    private String gasCentralizado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "generador")
    private String generador;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "conexiones_internet")
    private String conexionesInternet;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "conexiones_cable")
    private String conexionesCable;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "linea_telefonica")
    private String lineaTelefonica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "alarma")
    private String alarma;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "sistema_luces")
    private String sistemaLuces;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "sistema_sonido")
    private String sistemaSonido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "condominio")
    private String condominio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "guardia")
    private String guardia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "anio_construccion")
    private int anioConstruccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "zona_bbq")
    private String zonaBbq;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "gimnasio")
    private String gimnasio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "piscina")
    private String piscina;
    @Size(max = 200)
    @Column(name = "otros")
    private String otros;
    @JoinColumn(name = "parroquia", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Parroquia parroquia;
    @JoinColumn(name = "persona", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Persona persona;
    @JoinColumn(name = "plan", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Plan plan;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "publicacion")
    private List<Fotos> fotosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "publicacion")
    private List<Likes> likesList;

    public Publicacion() {
    }

    public Publicacion(Integer id) {
        this.id = id;
    }

    public Publicacion(Integer id, String sector, String direccion, double valor, double areaConstruccion, double areaParqueaderos, double areaBodega, double areaServicios, double otrasAreas, String parqueadero, String parqueaderoVisita, int numeroDormitorios, String dormitorioServicio, int numeroBanos, String equipamiento, String tipoConstruccion, String cisterna, String gasCentralizado, String generador, String conexionesInternet, String conexionesCable, String lineaTelefonica, String alarma, String sistemaLuces, String sistemaSonido, String condominio, String guardia, int anioConstruccion, String zonaBbq, String gimnasio, String piscina) {
        this.id = id;
        this.sector = sector;
        this.direccion = direccion;
        this.valor = valor;
        this.areaConstruccion = areaConstruccion;
        this.areaParqueaderos = areaParqueaderos;
        this.areaBodega = areaBodega;
        this.areaServicios = areaServicios;
        this.otrasAreas = otrasAreas;
        this.parqueadero = parqueadero;
        this.parqueaderoVisita = parqueaderoVisita;
        this.numeroDormitorios = numeroDormitorios;
        this.dormitorioServicio = dormitorioServicio;
        this.numeroBanos = numeroBanos;
        this.equipamiento = equipamiento;
        this.tipoConstruccion = tipoConstruccion;
        this.cisterna = cisterna;
        this.gasCentralizado = gasCentralizado;
        this.generador = generador;
        this.conexionesInternet = conexionesInternet;
        this.conexionesCable = conexionesCable;
        this.lineaTelefonica = lineaTelefonica;
        this.alarma = alarma;
        this.sistemaLuces = sistemaLuces;
        this.sistemaSonido = sistemaSonido;
        this.condominio = condominio;
        this.guardia = guardia;
        this.anioConstruccion = anioConstruccion;
        this.zonaBbq = zonaBbq;
        this.gimnasio = gimnasio;
        this.piscina = piscina;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getAreaConstruccion() {
        return areaConstruccion;
    }

    public void setAreaConstruccion(double areaConstruccion) {
        this.areaConstruccion = areaConstruccion;
    }

    public double getAreaParqueaderos() {
        return areaParqueaderos;
    }

    public void setAreaParqueaderos(double areaParqueaderos) {
        this.areaParqueaderos = areaParqueaderos;
    }

    public double getAreaBodega() {
        return areaBodega;
    }

    public void setAreaBodega(double areaBodega) {
        this.areaBodega = areaBodega;
    }

    public double getAreaServicios() {
        return areaServicios;
    }

    public void setAreaServicios(double areaServicios) {
        this.areaServicios = areaServicios;
    }

    public double getOtrasAreas() {
        return otrasAreas;
    }

    public void setOtrasAreas(double otrasAreas) {
        this.otrasAreas = otrasAreas;
    }

    public String getParqueadero() {
        return parqueadero;
    }

    public void setParqueadero(String parqueadero) {
        this.parqueadero = parqueadero;
    }

    public String getParqueaderoVisita() {
        return parqueaderoVisita;
    }

    public void setParqueaderoVisita(String parqueaderoVisita) {
        this.parqueaderoVisita = parqueaderoVisita;
    }

    public int getNumeroDormitorios() {
        return numeroDormitorios;
    }

    public void setNumeroDormitorios(int numeroDormitorios) {
        this.numeroDormitorios = numeroDormitorios;
    }

    public String getDormitorioServicio() {
        return dormitorioServicio;
    }

    public void setDormitorioServicio(String dormitorioServicio) {
        this.dormitorioServicio = dormitorioServicio;
    }

    public int getNumeroBanos() {
        return numeroBanos;
    }

    public void setNumeroBanos(int numeroBanos) {
        this.numeroBanos = numeroBanos;
    }

    public String getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(String equipamiento) {
        this.equipamiento = equipamiento;
    }

    public String getTipoConstruccion() {
        return tipoConstruccion;
    }

    public void setTipoConstruccion(String tipoConstruccion) {
        this.tipoConstruccion = tipoConstruccion;
    }

    public String getCisterna() {
        return cisterna;
    }

    public void setCisterna(String cisterna) {
        this.cisterna = cisterna;
    }

    public String getGasCentralizado() {
        return gasCentralizado;
    }

    public void setGasCentralizado(String gasCentralizado) {
        this.gasCentralizado = gasCentralizado;
    }

    public String getGenerador() {
        return generador;
    }

    public void setGenerador(String generador) {
        this.generador = generador;
    }

    public String getConexionesInternet() {
        return conexionesInternet;
    }

    public void setConexionesInternet(String conexionesInternet) {
        this.conexionesInternet = conexionesInternet;
    }

    public String getConexionesCable() {
        return conexionesCable;
    }

    public void setConexionesCable(String conexionesCable) {
        this.conexionesCable = conexionesCable;
    }

    public String getLineaTelefonica() {
        return lineaTelefonica;
    }

    public void setLineaTelefonica(String lineaTelefonica) {
        this.lineaTelefonica = lineaTelefonica;
    }

    public String getAlarma() {
        return alarma;
    }

    public void setAlarma(String alarma) {
        this.alarma = alarma;
    }

    public String getSistemaLuces() {
        return sistemaLuces;
    }

    public void setSistemaLuces(String sistemaLuces) {
        this.sistemaLuces = sistemaLuces;
    }

    public String getSistemaSonido() {
        return sistemaSonido;
    }

    public void setSistemaSonido(String sistemaSonido) {
        this.sistemaSonido = sistemaSonido;
    }

    public String getCondominio() {
        return condominio;
    }

    public void setCondominio(String condominio) {
        this.condominio = condominio;
    }

    public String getGuardia() {
        return guardia;
    }

    public void setGuardia(String guardia) {
        this.guardia = guardia;
    }

    public int getAnioConstruccion() {
        return anioConstruccion;
    }

    public void setAnioConstruccion(int anioConstruccion) {
        this.anioConstruccion = anioConstruccion;
    }

    public String getZonaBbq() {
        return zonaBbq;
    }

    public void setZonaBbq(String zonaBbq) {
        this.zonaBbq = zonaBbq;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getPiscina() {
        return piscina;
    }

    public void setPiscina(String piscina) {
        this.piscina = piscina;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

    public Parroquia getParroquia() {
        return parroquia;
    }

    public void setParroquia(Parroquia parroquia) {
        this.parroquia = parroquia;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    @XmlTransient
    public List<Fotos> getFotosList() {
        return fotosList;
    }

    public void setFotosList(List<Fotos> fotosList) {
        this.fotosList = fotosList;
    }

    @XmlTransient
    public List<Likes> getLikesList() {
        return likesList;
    }

    public void setLikesList(List<Likes> likesList) {
        this.likesList = likesList;
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
        if (!(object instanceof Publicacion)) {
            return false;
        }
        Publicacion other = (Publicacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.monkey.modelo.Publicacion[ id=" + id + " ]";
    }
    
}
