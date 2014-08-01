/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pichanga;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author junior
 */
@Entity
@Table(name = "clients")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clients.findAll", query = "SELECT c FROM Clients c"),
    @NamedQuery(name = "Clients.findByClId", query = "SELECT c FROM Clients c WHERE c.clId = :clId"),
    @NamedQuery(name = "Clients.findByClName", query = "SELECT c FROM Clients c WHERE c.clName = :clName"),
    @NamedQuery(name = "Clients.findByClLastname", query = "SELECT c FROM Clients c WHERE c.clLastname = :clLastname"),
    @NamedQuery(name = "Clients.findByClEmail", query = "SELECT c FROM Clients c WHERE c.clEmail = :clEmail"),
    @NamedQuery(name = "Clients.findByClPassword", query = "SELECT c FROM Clients c WHERE c.clPassword = :clPassword"),
    @NamedQuery(name = "Clients.findByClSex", query = "SELECT c FROM Clients c WHERE c.clSex = :clSex"),
    @NamedQuery(name = "Clients.findByClBirthday", query = "SELECT c FROM Clients c WHERE c.clBirthday = :clBirthday"),
    @NamedQuery(name = "Clients.findByClPosition", query = "SELECT c FROM Clients c WHERE c.clPosition = :clPosition"),
    @NamedQuery(name = "Clients.findByClScore", query = "SELECT c FROM Clients c WHERE c.clScore = :clScore")})
public class Clients implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cl_id")
    private Integer clId;
    @Size(max = 10)
    @Column(name = "cl_name")
    private String clName;
    @Size(max = 30)
    @Column(name = "cl_lastname")
    private String clLastname;
    @Size(max = 50)
    @Column(name = "cl_email")
    private String clEmail;
    @Size(max = 30)
    @Column(name = "cl_password")
    private String clPassword;
    @Size(max = 4)
    @Column(name = "cl_sex")
    private String clSex;
    @Column(name = "cl_birthday")
    @Temporal(TemporalType.DATE)
    private Date clBirthday;
    @Size(max = 20)
    @Column(name = "cl_position")
    private String clPosition;
    @Column(name = "cl_score")
    private Integer clScore;

    public Clients() {
    }

    public Clients(Integer clId) {
        this.clId = clId;
    }

    public Integer getClId() {
        return clId;
    }

    public void setClId(Integer clId) {
        this.clId = clId;
    }

    public String getClName() {
        return clName;
    }

    public void setClName(String clName) {
        this.clName = clName;
    }

    public String getClLastname() {
        return clLastname;
    }

    public void setClLastname(String clLastname) {
        this.clLastname = clLastname;
    }

    public String getClEmail() {
        return clEmail;
    }

    public void setClEmail(String clEmail) {
        this.clEmail = clEmail;
    }

    public String getClPassword() {
        return clPassword;
    }

    public void setClPassword(String clPassword) {
        this.clPassword = clPassword;
    }

    public String getClSex() {
        return clSex;
    }

    public void setClSex(String clSex) {
        this.clSex = clSex;
    }

    public Date getClBirthday() {
        return clBirthday;
    }

    public void setClBirthday(Date clBirthday) {
        this.clBirthday = clBirthday;
    }

    public String getClPosition() {
        return clPosition;
    }

    public void setClPosition(String clPosition) {
        this.clPosition = clPosition;
    }

    public Integer getClScore() {
        return clScore;
    }

    public void setClScore(Integer clScore) {
        this.clScore = clScore;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clId != null ? clId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clients)) {
            return false;
        }
        Clients other = (Clients) object;
        if ((this.clId == null && other.clId != null) || (this.clId != null && !this.clId.equals(other.clId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pichanga.Clients[ clId=" + clId + " ]";
    }
    
}
