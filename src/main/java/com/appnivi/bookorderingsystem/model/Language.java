package com.appnivi.bookorderingsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="language")
public class Language {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
@Column(name="language")
private String language;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}

}
