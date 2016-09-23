package io.training.backendapp.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table
@NamedQueries({
	@NamedQuery(name = "Movie.findAll", query = "Select m from Movie m"),
	@NamedQuery(name = "Movie.findByImdbId", query = "Select m from Movie m where m.imdbID = :imdbID"),
	@NamedQuery(name = "Movie.findByTitle", query = "Select m from Movie m where m.title = :title"),
	@NamedQuery(name = "Movie.findByYear", query = "Select m from Movie m where m.year = :year"),
	@NamedQuery(name = "Movie.findByGenre", query = "Select m from Movie m where m.genre LIKE :genre"),
	@NamedQuery(name = "Movie.findByType", query = "Select m from Movie m where m.type = :type"),
	@NamedQuery(name = "Movie.sortByRating", query = "Select m from Movie m order by m.imdbRating DESC")
})
public class Movie {
	
	@Id
	private String id;
	
	@JsonProperty(value = "Title")
	private String title;
	
	@JsonProperty(value = "Year")
	private int year;
	
	@JsonProperty(value = "Rated")
	private String rated;
	
	@JsonProperty(value = "Released")
	private String released;
	
	@JsonProperty(value = "Runtime")
	private String runtime;
	
	@JsonProperty(value = "Genre")
	private String genre;
	
	@JsonProperty(value = "Director")
	private String director;
	
	@JsonProperty(value = "Writer")
	@Column(columnDefinition = "TEXT")
	private String writer;
	
	@JsonProperty(value = "Actors")
	@Column(columnDefinition = "TEXT")
	private String actors;
	
	@JsonProperty(value = "Plot")
	@Column(columnDefinition = "TEXT")
	private String plot;
	
	@JsonProperty(value = "Language")
	private String language;
	
	@JsonProperty(value = "Country")
	private String country;
	
	@JsonProperty(value = "Awards")
	private String awards;
	
	@JsonProperty(value = "Poster")
	@Column(columnDefinition = "TEXT")
	private String poster;
	
	@JsonProperty(value = "Metascore")
	private int metascore;
	
	@JsonProperty(value = "imdbRating")
	private double imdbRating;
	
	@JsonProperty(value = "imdbVotes")
	private int imdbVotes;
	
	@JsonProperty(value = "imdbID")
	@Column(unique = true)
	private String imdbID;
	
	@JsonProperty(value = "Type")
	private String type;
	
	public Movie(){
		id = UUID.randomUUID().toString();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getRated() {
		return rated;
	}

	public void setRated(String rated) {
		this.rated = rated;
	}

	public String getReleased() {
		return released;
	}

	public void setReleased(String released) {
		this.released = released;
	}

	public String getRuntime() {
		return runtime;
	}

	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getActors() {
		return actors;
	}

	public void setActors(String actors) {
		this.actors = actors;
	}

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAwards() {
		return awards;
	}

	public void setAwards(String awards) {
		this.awards = awards;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public int getMetascore() {
		return metascore;
	}

	public void setMetascore(int metascore) {
		this.metascore = metascore;
	}

	public double getImdbRating() {
		return imdbRating;
	}

	public void setImdbRating(double imdbRating) {
		this.imdbRating = imdbRating;
	}

	public int getImdbVotes() {
		return imdbVotes;
	}

	public void setImdbVotes(int imdbVotes) {
		this.imdbVotes = imdbVotes;
	}

	public String getImdbID() {
		return imdbID;
	}

	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}	
}