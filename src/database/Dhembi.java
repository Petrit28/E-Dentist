/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
@Table(name = "Dhembi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dhembi.findAll", query = "SELECT d FROM Dhembi d"),
    @NamedQuery(name = "Dhembi.findByDhembiid", query = "SELECT d FROM Dhembi d WHERE d.dhembiid = :dhembiid"),
    @NamedQuery(name = "Dhembi.findByLlojisemundjes", query = "SELECT d FROM Dhembi d WHERE d.llojisemundjes = :llojisemundjes")})
public class Dhembi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Dhembi_id")
    private Integer dhembiid;
    @Basic(optional = false)
    @Lob
    @Column(name = "Koment")
    private String koment;
    @Column(name = "Lloji_semundjes")
    private String llojisemundjes;
    @JoinColumn(name = "Kontrollaid", referencedColumnName = "Kontrolla_id")
    @ManyToOne(optional = false)
    private Kontrolla kontrollaid;

    public Dhembi() {
    }

    public Dhembi(Integer dhembiid) {
        this.dhembiid = dhembiid;
    }

    public Dhembi(Integer dhembiid, String koment) {
        this.dhembiid = dhembiid;
        this.koment = koment;
    }

    public Integer getDhembiid() {
        return dhembiid;
    }

    public void setDhembiid(Integer dhembiid) {
        this.dhembiid = dhembiid;
    }

    public String getKoment() {
        return koment;
    }

    public void setKoment(String koment) {
        this.koment = koment;
    }

    public String getLlojisemundjes() {
        return llojisemundjes;
    }

    public void setLlojisemundjes(String llojisemundjes) {
        this.llojisemundjes = llojisemundjes;
    }

    public Kontrolla getKontrollaid() {
        return kontrollaid;
    }

    public void setKontrollaid(Kontrolla kontrollaid) {
        this.kontrollaid = kontrollaid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dhembiid != null ? dhembiid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dhembi)) {
            return false;
        }
        Dhembi other = (Dhembi) object;
        if ((this.dhembiid == null && other.dhembiid != null) || (this.dhembiid != null && !this.dhembiid.equals(other.dhembiid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.Dhembi[ dhembiid=" + dhembiid + " ]";
    }
    
}
