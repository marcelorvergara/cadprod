/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cad_prod;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Marcelo
 */
@Entity
@Table(name = "produtos")
@NamedQueries({
    @NamedQuery(name = "Produtos.findAll", query = "SELECT p FROM Produtos p")
    , @NamedQuery(name = "Produtos.findById", query = "SELECT p FROM Produtos p WHERE p.id = :id")
    , @NamedQuery(name = "Produtos.findByCodProd", query = "SELECT p FROM Produtos p WHERE p.codProd = :codProd")
    , @NamedQuery(name = "Produtos.findByDescProd", query = "SELECT p FROM Produtos p WHERE p.descProd = :descProd")
    , @NamedQuery(name = "Produtos.findByQtdProd", query = "SELECT p FROM Produtos p WHERE p.qtdProd = :qtdProd")
    , @NamedQuery(name = "Produtos.findByPrecoProd", query = "SELECT p FROM Produtos p WHERE p.precoProd = :precoProd")})
public class Produtos implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false, updatable = false)
    //@Type(type = "pg-uuid")
    private Integer id;
    @Column(name = "cod_prod")
    private String codProd;
    @Column(name = "desc_prod")
    private String descProd;
    @Column(name = "qtd_prod")
    private Integer qtdProd;
    @Column(name = "preco_prod")
    private BigDecimal precoProd;

    public Produtos() {
    }

    public Produtos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getCodProd() {
        return codProd;
    }

    public void setCodProd(String codProd) {
        String oldCodProd = this.codProd;
        this.codProd = codProd;
        changeSupport.firePropertyChange("codProd", oldCodProd, codProd);
    }

    public String getDescProd() {
        return descProd;
    }

    public void setDescProd(String descProd) {
        String oldDescProd = this.descProd;
        this.descProd = descProd;
        changeSupport.firePropertyChange("descProd", oldDescProd, descProd);
    }

    public Integer getQtdProd() {
        return qtdProd;
    }

    public void setQtdProd(Integer qtdProd) {
        Integer oldQtdProd = this.qtdProd;
        this.qtdProd = qtdProd;
        changeSupport.firePropertyChange("qtdProd", oldQtdProd, qtdProd);
    }

    public BigDecimal getPrecoProd() {
        return precoProd;
    }

    public void setPrecoProd(BigDecimal precoProd) {
        BigDecimal oldPrecoProd = this.precoProd;
        this.precoProd = precoProd;
        changeSupport.firePropertyChange("precoProd", oldPrecoProd, precoProd);
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
        if (!(object instanceof Produtos)) {
            return false;
        }
        Produtos other = (Produtos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cad_prod.Produtos[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
