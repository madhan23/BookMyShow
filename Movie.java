package com.bookmyShow.model;

public class Movie {
	private static int counter=0;
	private Integer id;
	private String name;
	private float rating;
	private Genre genre;
	private Language Language;

	public Movie(String name, Language language,Genre genre) {
		super();
		this.id = ++counter;
		this.name = name;
		this.rating = 0.0f;
		this.genre = genre;
		Language = language;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Language getLanguage() {
		return Language;
	}

	public void setLanguage(Language language) {
		Language = language;
	}

}
