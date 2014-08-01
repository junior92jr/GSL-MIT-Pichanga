/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pichanga;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author junior
 */
@Entity
@Table(name = "fields")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fields.findAll", query = "SELECT f FROM Fields f"),
    @NamedQuery(name = "Fields.findByFiId", query = "SELECT f FROM Fields f WHERE f.fiId = :fiId"),
    @NamedQuery(name = "Fields.findByFiName", query = "SELECT f FROM Fields f WHERE f.fiName = :fiName"),
    @NamedQuery(name = "Fields.findByFiCity", query = "SELECT f FROM Fields f WHERE f.fiCity = :fiCity"),
    @NamedQuery(name = "Fields.findByFiDistrict", query = "SELECT f FROM Fields f WHERE f.fiDistrict = :fiDistrict"),
    @NamedQuery(name = "Fields.findByFiPlayers", query = "SELECT f FROM Fields f WHERE f.fiPlayers = :fiPlayers"),
    @NamedQuery(name = "Fields.findByFiDescription", query = "SELECT f FROM Fields f WHERE f.fiDescription = :fiDescription"),
    @NamedQuery(name = "Fields.findByFiPhotoPath", query = "SELECT f FROM Fields f WHERE f.fiPhotoPath = :fiPhotoPath"),
    @NamedQuery(name = "Fields.findByFiLatitud", query = "SELECT f FROM Fields f WHERE f.fiLatitud = :fiLatitud"),
    @NamedQuery(name = "Fields.findByFiLongitud", query = "SELECT f FROM Fields f WHERE f.fiLongitud = :fiLongitud")})
public class Fields implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "fi_id")
    private Integer fiId;
    @Size(max = 50)
    @Column(name = "fi_name")
    private String fiName;
    @Size(max = 20)
    @Column(name = "fi_city")
    private String fiCity;
    @Size(max = 20)
    @Column(name = "fi_district")
    private String fiDistrict;
    @Column(name = "fi_players")
    private Integer fiPlayers;
    @Size(max = 500)
    @Column(name = "fi_description")
    private String fiDescription;
    @Size(max = 50)
    @Column(name = "fi_photo_path")
    private String fiPhotoPath;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "fi_latitud")
    private Float fiLatitud;
    @Column(name = "fi_longitud")
    private Float fiLongitud;

    public Fields() {
    }

    public Fields(Integer fiId) {
        this.fiId = fiId;
    }

    public Integer getFiId() {
        return fiId;
    }

    public void setFiId(Integer fiId) {
        this.fiId = fiId;
    }

    public String getFiName() {
        return fiName;
    }

    public void setFiName(String fiName) {
        this.fiName = fiName;
    }

    public String getFiCity() {
        return fiCity;
    }

    public void setFiCity(String fiCity) {
        this.fiCity = fiCity;
    }

    public String getFiDistrict() {
        return fiDistrict;
    }

    public void setFiDistrict(String fiDistrict) {
        this.fiDistrict = fiDistrict;
    }

    public Integer getFiPlayers() {
        return fiPlayers;
    }

    public void setFiPlayers(Integer fiPlayers) {
        this.fiPlayers = fiPlayers;
    }

    public String getFiDescription() {
        return fiDescription;
    }

    public void setFiDescription(String fiDescription) {
        this.fiDescription = fiDescription;
    }

    public String getFiPhotoPath() {
        return fiPhotoPath;
    }

    public void setFiPhotoPath(String fiPhotoPath) {
        this.fiPhotoPath = fiPhotoPath;
    }

    public Float getFiLatitud() {
        return fiLatitud;
    }

    public void setFiLatitud(Float fiLatitud) {
        this.fiLatitud = fiLatitud;
    }

    public Float getFiLongitud() {
        return fiLongitud;
    }

    public void setFiLongitud(Float fiLongitud) {
        this.fiLongitud = fiLongitud;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fiId != null ? fiId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fields)) {
            return false;
        }
        Fields other = (Fields) object;
        if ((this.fiId == null && other.fiId != null) || (this.fiId != null && !this.fiId.equals(other.fiId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pichanga.Fields[ fiId=" + fiId + " ]";
    }
    
}
