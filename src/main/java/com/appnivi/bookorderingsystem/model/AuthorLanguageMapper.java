package com.appnivi.bookorderingsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="authorlanguagemapper")
public class AuthorLanguageMapper {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name="authorid")
	private Long authorid;
	@Column(name="languageid")
	private Long languageid;
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
	public Long getLanguageid() {
		return languageid;
	}
	public void setLanguageid(Long languageid) {
		this.languageid = languageid;
	}
	
}
