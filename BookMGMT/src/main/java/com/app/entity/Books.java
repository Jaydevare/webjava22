package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Libraray")
public class Books 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "book_name")
	private String bookName;
	@Column(name = "author_name")
	private String authorName;
	@Column
	private int quantity;
	@Column
	private String genere;
	
	public Books() {}

	public Books(String bookName, String authorName, int quantity, String genere) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.quantity = quantity;
		this.genere = genere;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	@Override
	public String toString() {
		return "Books [id=" + id + ", bookName=" + bookName + ", authorName=" + authorName + ", quantity=" + quantity
				+ ", genere=" + genere + "]";
	}
	
	
}
