/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author KP Team
 */
@Entity
@Table(name = "Punetori")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Punetori.findAll", query = "SELECT p FROM Punetori p"),
    @NamedQuery(name = "Punetori.findByPunetoriid", query = "SELECT p FROM Punetori p WHERE p.punetoriid = :punetoriid"),
    @NamedQuery(name = "Punetori.findByNrpersonal", query = "SELECT p FROM Punetori p WHERE p.nrpersonal = :nrpersonal"),
    @NamedQuery(name = "Punetori.findByEmri", query = "SELECT p FROM Punetori p WHERE p.emri = :emri"),
    @NamedQuery(name = "Punetori.findByMbiemri", query = "SELECT p FROM Punetori p WHERE p.mbiemri = :mbiemri"),
    @NamedQuery(name = "Punetori.findByPozite", query = "SELECT p FROM Punetori p WHERE p.pozite = :pozite"),
    @NamedQuery(name = "Punetori.findByGjinia", query = "SELECT p FROM Punetori p WHERE p.gjinia = :gjinia")})
public class Punetori implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Punetori_id")
    private Integer punetoriid;
    @Basic(optional = false)
    @Column(name = "Nr_personal")
    private int nrpersonal;
    @Basic(optional = false)
    @Column(name = "Emri")
    private String emri;
    @Basic(optional = false)
    @Column(name = "Mbiemri")
    private String mbiemri;
    @Basic(optional = false)
    @Column(name = "Pozite")
    private String pozite;
    @Basic(optional = false)
    @Column(name = "Gjinia")
    private Character gjinia;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "punetoriid")
    private Collection<Kontrolla> kontrollaCollection;

    public Punetori() {
    }

    public Punetori(Integer punetoriid) {
        this.punetoriid = punetoriid;
    }

    public Punetori(Integer punetoriid, int nrpersonal, String emri, String mbiemri, String pozite, Character gjinia) {
        this.punetoriid = punetoriid;
        this.nrpersonal = nrpersonal;
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.pozite = pozite;
        this.gjinia = gjinia;
    }

    public Integer getPunetoriid() {
        return punetoriid;
    }

    public void setPunetoriid(Integer punetoriid) {
        this.punetoriid = punetoriid;
    }

    public int getNrpersonal() {
        return nrpersonal;
    }

    public void setNrpersonal(int nrpersonal) {
        this.nrpersonal = nrpersonal;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public String getPozite() {
        return pozite;
    }

    public void setPozite(String pozite) {
        this.pozite = pozite;
    }

    public Character getGjinia() {
        return gjinia;
    }

    public void setGjinia(Character gjinia) {
        this.gjinia = gjinia;
    }

    @XmlTransient
    public Collection<Kontrolla> getKontrollaCollection() {
        return kontrollaCollection;
    }

    public void setKontrollaCollection(Collection<Kontrolla> kontrollaCollection) {
        this.kontrollaCollection = kontrollaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (punetoriid != null ? punetoriid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Punetori)) {
            return false;
        }
        Punetori other = (Punetori) object;
        if ((this.punetoriid == null && other.punetoriid != null) || (this.punetoriid != null && !this.punetoriid.equals(other.punetoriid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.Punetori[ punetoriid=" + punetoriid + " ]";
    }
    
}
