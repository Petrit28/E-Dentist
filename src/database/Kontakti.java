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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "Kontakti")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kontakti.findAll", query = "SELECT k FROM Kontakti k"),
    @NamedQuery(name = "Kontakti.findByKontaktiid", query = "SELECT k FROM Kontakti k WHERE k.kontaktiid = :kontaktiid"),
    @NamedQuery(name = "Kontakti.findByNrtel1", query = "SELECT k FROM Kontakti k WHERE k.nrtel1 = :nrtel1"),
    @NamedQuery(name = "Kontakti.findByNrtel2", query = "SELECT k FROM Kontakti k WHERE k.nrtel2 = :nrtel2"),
    @NamedQuery(name = "Kontakti.findByEmail", query = "SELECT k FROM Kontakti k WHERE k.email = :email")})
public class Kontakti implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "Kontakti_id")
    private Integer kontaktiid;
    @Basic(optional = false)
    @Column(name = "Nr_tel1")
    private String nrtel1;
    @Basic(optional = false)
    @Column(name = "Nr_tel2")
    private String nrtel2;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @JoinColumn(name = "PacientiID", referencedColumnName = "Nr_personal")
    @OneToOne
    private Pacienti pacientiID;

    public Kontakti() {
    }

    public Kontakti(Integer kontaktiid) {
        this.kontaktiid = kontaktiid;
    }

    public Kontakti(Integer kontaktiid, String nrtel1, String nrtel2, String email) {
        this.kontaktiid = kontaktiid;
        this.nrtel1 = nrtel1;
        this.nrtel2 = nrtel2;
        this.email = email;
    }

    public Integer getKontaktiid() {
        return kontaktiid;
    }

    public void setKontaktiid(Integer kontaktiid) {
        this.kontaktiid = kontaktiid;
    }

    public String getNrtel1() {
        return nrtel1;
    }

    public void setNrtel1(String nrtel1) {
        this.nrtel1 = nrtel1;
    }

    public String getNrtel2() {
        return nrtel2;
    }

    public void setNrtel2(String nrtel2) {
        this.nrtel2 = nrtel2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Pacienti getPacientiID() {
        return pacientiID;
    }

    public void setPacientiID(Pacienti pacientiID) {
        this.pacientiID = pacientiID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kontaktiid != null ? kontaktiid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kontakti)) {
            return false;
        }
        Kontakti other = (Kontakti) object;
        if ((this.kontaktiid == null && other.kontaktiid != null) || (this.kontaktiid != null && !this.kontaktiid.equals(other.kontaktiid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.Kontakti[ kontaktiid=" + kontaktiid + " ]";
    }
    
}
