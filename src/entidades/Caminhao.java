/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Tainá Fiegenbaum
 */
@Entity
@Table(name = "caminhao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Caminhao.findAll", query = "SELECT c FROM Caminhao c"),
    @NamedQuery(name = "Caminhao.findById", query = "SELECT c FROM Caminhao c WHERE c.id = :id"),
    @NamedQuery(name = "Caminhao.findByMarca", query = "SELECT c FROM Caminhao c WHERE c.marca = :marca"),
    @NamedQuery(name = "Caminhao.findByAno", query = "SELECT c FROM Caminhao c WHERE c.ano = :ano"),
    @NamedQuery(name = "Caminhao.findByCarga", query = "SELECT c FROM Caminhao c WHERE c.carga = :carga"),
    @NamedQuery(name = "Caminhao.findByPlaca", query = "SELECT c FROM Caminhao c WHERE c.placa = :placa"),
    @NamedQuery(name = "Caminhao.findByCapacidade", query = "SELECT c FROM Caminhao c WHERE c.capacidade = :capacidade"),
    @NamedQuery(name = "Caminhao.findBySituacao", query = "SELECT c FROM Caminhao c WHERE c.situacao = :situacao")})
public class Caminhao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "marca")
    private String marca;
    @Basic(optional = false)
    @Column(name = "ano")
    private String ano;
    @Basic(optional = false)
    @Column(name = "carga")
    private double carga;
    @Basic(optional = false)
    @Column(name = "placa")
    private String placa;
    @Basic(optional = false)
    @Column(name = "capacidade")
    private double capacidade;
    @Basic(optional = false)
    @Column(name = "situacao")
    private String situacao;

    public Caminhao() {
    }

    public Caminhao(Integer id) {
        this.id = id;
    }

    public Caminhao(Integer id, String marca, String ano, double carga, String placa, double capacidade, String situacao) {
        this.id = id;
        this.marca = marca;
        this.ano = ano;
        this.carga = carga;
        this.placa = placa;
        this.capacidade = capacidade;
        this.situacao = situacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
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
        if (!(object instanceof Caminhao)) {
            return false;
        }
        Caminhao other = (Caminhao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Caminhao[ id=" + id + " ]";
    }
    
}
