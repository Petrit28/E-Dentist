/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author KP Team
 */
@Entity
@Table(name = "Tretmani")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tretmani.findAll", query = "SELECT t FROM Tretmani t"),
    @NamedQuery(name = "Tretmani.findByTretmaniid", query = "SELECT t FROM Tretmani t WHERE t.tretmaniPK.tretmaniid = :tretmaniid"),
    @NamedQuery(name = "Tretmani.findByKontrollaID", query = "SELECT t FROM Tretmani t WHERE t.tretmaniPK.kontrollaID = :kontrollaID"),
    @NamedQuery(name = "Tretmani.findByLlojitretmanit", query = "SELECT t FROM Tretmani t WHERE t.llojitretmanit = :llojitretmanit"),
    @NamedQuery(name = "Tretmani.findByKohezgjatja", query = "SELECT t FROM Tretmani t WHERE t.kohezgjatja = :kohezgjatja")})
public class Tretmani implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TretmaniPK tretmaniPK;
    @Basic(optional = false)
    @Column(name = "Lloji_tretmanit")
    private String llojitretmanit;
    @Column(name = "Kohezgjatja")
    private String kohezgjatja;
    @JoinColumn(name = "KontrollaID", referencedColumnName = "Kontrolla_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Kontrolla kontrolla;

    public Tretmani() {
    }

    public Tretmani(TretmaniPK tretmaniPK) {
        this.tretmaniPK = tretmaniPK;
    }

    public Tretmani(TretmaniPK tretmaniPK, String llojitretmanit) {
        this.tretmaniPK = tretmaniPK;
        this.llojitretmanit = llojitretmanit;
    }

    public Tretmani(int tretmaniid, int kontrollaID) {
        this.tretmaniPK = new TretmaniPK(tretmaniid, kontrollaID);
    }

    public TretmaniPK getTretmaniPK() {
        return tretmaniPK;
    }

    public void setTretmaniPK(TretmaniPK tretmaniPK) {
        this.tretmaniPK = tretmaniPK;
    }

    public String getLlojitretmanit() {
        return llojitretmanit;
    }

    public void setLlojitretmanit(String llojitretmanit) {
        this.llojitretmanit = llojitretmanit;
    }

    public String getKohezgjatja() {
        return kohezgjatja;
    }

    public void setKohezgjatja(String kohezgjatja) {
        this.kohezgjatja = kohezgjatja;
    }

    public Kontrolla getKontrolla() {
        return kontrolla;
    }

    public void setKontrolla(Kontrolla kontrolla) {
        this.kontrolla = kontrolla;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tretmaniPK != null ? tretmaniPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tretmani)) {
            return false;
        }
        Tretmani other = (Tretmani) object;
        if ((this.tretmaniPK == null && other.tretmaniPK != null) || (this.tretmaniPK != null && !this.tretmaniPK.equals(other.tretmaniPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.Tretmani[ tretmaniPK=" + tretmaniPK + " ]";
    }
    
}
