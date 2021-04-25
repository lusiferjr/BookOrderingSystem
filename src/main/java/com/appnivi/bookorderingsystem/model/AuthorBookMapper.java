package com.appnivi.bookorderingsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="authorbookmapper")
public class AuthorBookMapper {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name="bookid")
	private Long bookid;
	@Column(name="authorid")
	private Long authorid;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getBookid() {
		return bookid;
	}
	public void setBookid(Long bookid) {
		this.bookid = bookid;
	}
	public Long getAuthorid() {
		return authorid;
	}
	public void setAuthorid(Long authorid) {
		this.authorid = authorid;
	}
	
}
