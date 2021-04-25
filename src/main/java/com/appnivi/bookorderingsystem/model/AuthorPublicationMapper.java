package com.appnivi.bookorderingsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="authorpublicationmapper")
public class AuthorPublicationMapper {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
@Column(name="authorid")
private Long authorid;
@Column(name="publicationid")
private Long publicationid;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Long getAuthorid() {
	return authorid;
}
public void setAuthorid(Long authorid) {
	this.authorid = authorid;
}
public Long getPublicationid() {
	return publicationid;
}
public void setPublicationid(Long publicationid) {
	this.publicationid = publicationid;
}

}
