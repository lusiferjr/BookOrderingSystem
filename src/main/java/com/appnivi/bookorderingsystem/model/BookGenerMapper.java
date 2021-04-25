package com.appnivi.bookorderingsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bookgenermapper")
public class BookGenerMapper {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
@Column(name="bookid")
private Long bookid;
@Column(name="generid")
private Long generid;
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
public Long getGenerid() {
	return generid;
}
public void setGenerid(Long generid) {
	this.generid = generid;
}

}
