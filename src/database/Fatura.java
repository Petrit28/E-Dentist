/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author KP Team
 */
@Entity
@Table(name = "Fatura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fatura.findAll", query = "SELECT f FROM Fatura f"),
    @NamedQuery(name = "Fatura.findByFaturaid", query = "SELECT f FROM Fatura f WHERE f.faturaid = :faturaid"),
    @NamedQuery(name = "Fatura.findByNrFaktures", query = "SELECT f FROM Fatura f WHERE f.nrFaktures = :nrFaktures"),
    @NamedQuery(name = "Fatura.findByPagesa", query = "SELECT f FROM Fatura f WHERE f.pagesa = :pagesa"),
    @NamedQuery(name = "Fatura.findByTvsh", query = "SELECT f FROM Fatura f WHERE f.tvsh = :tvsh")})
public class Fatura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Fatura_id")
    private Integer faturaid;
    @Basic(optional = false)
    @Column(name = "Nr_Faktures")
    private int nrFaktures;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "Pagesa")
    private BigDecimal pagesa;
    @Basic(optional = false)
    @Column(name = "TVSH")
    private int tvsh;
    @JoinColumn(name = "KontrollaID", referencedColumnName = "Kontrolla_id")
    @OneToOne
    private Kontrolla kontrollaID;

    public Fatura() {
    }

    public Fatura(Integer faturaid) {
        this.faturaid = faturaid;
    }

    public Fatura(Integer faturaid, int nrFaktures, BigDecimal pagesa, int tvsh) {
        this.faturaid = faturaid;
        this.nrFaktures = nrFaktures;
        this.pagesa = pagesa;
        this.tvsh = tvsh;
    }

    public Integer getFaturaid() {
        return faturaid;
    }

    public void setFaturaid(Integer faturaid) {
        this.faturaid = faturaid;
    }

    public int getNrFaktures() {
        return nrFaktures;
    }

    public void setNrFaktures(int nrFaktures) {
        this.nrFaktures = nrFaktures;
    }

    public BigDecimal getPagesa() {
        return pagesa;
    }

    public void setPagesa(BigDecimal pagesa) {
        this.pagesa = pagesa;
    }

    public int getTvsh() {
        return tvsh;
    }

    public void setTvsh(int tvsh) {
        this.tvsh = tvsh;
    }

    public Kontrolla getKontrollaID() {
        return kontrollaID;
    }

    public void setKontrollaID(Kontrolla kontrollaID) {
        this.kontrollaID = kontrollaID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (faturaid != null ? faturaid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fatura)) {
            return false;
        }
        Fatura other = (Fatura) object;
        if ((this.faturaid == null && other.faturaid != null) || (this.faturaid != null && !this.faturaid.equals(other.faturaid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.Fatura[ faturaid=" + faturaid + " ]";
    }
    
}
