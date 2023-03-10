package com.skilldistillery.filmquery.entities;

import java.util.List;
import java.util.Objects;

public class Film {

//	Variables
	private int id;
	private String title;
	private String decription;
	private Integer releaseYear;
	private int languageId;
	private String languageName;
	private Integer length;
	private double replacementCost;
	private String rating;
	private String specialFeatures;
	private List<Actor> actors;

//	Method - No Arg Ctor
	public Film() {
		super();
	}

	public Film(int id, String title, String decription, Integer releaseYear, int languageId, Integer length,
			double replacementCost, String rating, String specialFeatures) {
		this.id = id;
		this.title = title;
		this.decription = decription;
		this.releaseYear = releaseYear;
		this.languageId = languageId;
		this.length = length;
		this.replacementCost = replacementCost;
		this.rating = rating;
		this.specialFeatures = specialFeatures;
	}

public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	//	Method - Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDecription() {
		return decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}

	public Integer getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}

	public int getLanguageId() {
		return languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public double getReplacementCost() {
		return replacementCost;
	}

	public void setReplacementCost(double replacementCost) {
		this.replacementCost = replacementCost;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getSpecialFeatures() {
		return specialFeatures;
	}

	public void setSpecialFeatures(String specialFeatures) {
		this.specialFeatures = specialFeatures;
	}

	public List<Actor> getActors() {
		return actors;
	}

	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}

// Method - toString
	@Override
	public String toString() {
		return "Film [id=" + id + ", title=" + title + ", decription=" + decription + ", releaseYear=" + releaseYear
				+ ", languageId=" + languageId + ", length=" + length + ", replacementCost=" + replacementCost
				+ ", rating=" + rating + ", specialFeatures=" + specialFeatures + "]";
	}

//	Method - Hashcodes & Equals
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Film other = (Film) obj;
		return id == other.id;
	}

}
