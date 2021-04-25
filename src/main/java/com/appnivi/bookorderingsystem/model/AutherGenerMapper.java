package com.appnivi.bookorderingsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="authorgenermapper")
public class AutherGenerMapper {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name="authorid")
	private Long authorid;
	@Column(name="generid")
	private Long generid;
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
	public Long getGenerid() {
		return generid;
	}
	public void setGenerid(Long generid) {
		this.generid = generid;
	}
	
}
