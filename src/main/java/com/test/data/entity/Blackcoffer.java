package com.test.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Blackcoffer_data")
public class Blackcoffer {
		
	    
	   
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
		  private int id; 
	    
	    
	    @Column(name = "end_year")
		  private int end_Year;
	    @Column(name = "citylng")
	    private String citylng;
	    @Column(name = "citylat")
	    private String citylat;
	    @Column(name = "intensity")
	    private int intensity;
	    @Column(name = "sector")
	    private String sector;
	    @Column(name = "topic")
	    private String topic;
	    @Column(name = "insight")
	    private String insight;
	    @Column(name = "swot")
	    private String swot;
	    @Column(name = "url")
	    private String url;
	    @Column(name = "region")
	    private String region;
	    @Column(name = "start_year")
	    private String start_year;
	    @Column(name = "impact")
	    private String impact; 
	    @Column(name = "added")
	    private String added;
	    @Column(name = "published")
	    private String published;
	    @Column(name = "city")
	    private String city;
	    @Column(name = "Country")
	    private String country;
	    @Column(name = "relevance")
	    private int relevance;
	    @Column(name = "pestle")
	    private String pestle;
	    @Column(name = "source")
	    private String source;
	    @Column(name = "title")
	    private String title;
	    @Column(name = "likelihood")
	    private int likelihood;
	    

		public Blackcoffer(int end_Year, String citylng, String citylat, int intensity, String sector, String topic,
				String insight, String swot, String url, String region, String start_year, String impact, String added,
				String published, String city, String country, int relevance, String pestle, String source,
				String title, int likelihood) {
			super();
			this.end_Year = end_Year;
			this.citylng = citylng;
			this.citylat = citylat;
			this.intensity = intensity;
			this.sector = sector;
			this.topic = topic;
			this.insight = insight;
			this.swot = swot;
			this.url = url;
			this.region = region;
			this.start_year = start_year;
			this.impact = impact;
			this.added = added;
			this.published = published;
			this.city = city;
			this.country = country;
			this.relevance = relevance;
			this.pestle = pestle;
			this.source = source;
			this.title = title;
			this.likelihood = likelihood;
		}


		@Override
		public String toString() {
			return "Blackcoffer [end_Year=" + end_Year + ", citylng=" + citylng + ", citylat=" + citylat
					+ ", intensity=" + intensity + ", sector=" + sector + ", topic=" + topic + ", insight=" + insight
					+ ", swot=" + swot + ", url=" + url + ", region=" + region + ", start_year=" + start_year
					+ ", impact=" + impact + ", added=" + added + ", published=" + published + ", city=" + city
					+ ", country=" + country + ", relevance=" + relevance + ", pestle=" + pestle + ", source=" + source
					+ ", title=" + title + ", likelihood=" + likelihood + "]";
		}


		public int getEnd_Year() {
			return end_Year;
		}


		public void setEnd_Year(int end_Year) {
			this.end_Year = end_Year;
		}


		public String getCitylng() {
			return citylng;
		}


		public void setCitylng(String citylng) {
			this.citylng = citylng;
		}


		public String getCitylat() {
			return citylat;
		}


		public void setCitylat(String citylat) {
			this.citylat = citylat;
		}


		public int getIntensity() {
			return intensity;
		}


		public void setIntensity(int intensity) {
			this.intensity = intensity;
		}


		public String getSector() {
			return sector;
		}


		public void setSector(String sector) {
			this.sector = sector;
		}


		public String getTopic() {
			return topic;
		}


		public void setTopic(String topic) {
			this.topic = topic;
		}


		public String getInsight() {
			return insight;
		}


		public void setInsight(String insight) {
			this.insight = insight;
		}


		public String getSwot() {
			return swot;
		}


		public void setSwot(String swot) {
			this.swot = swot;
		}


		public String getUrl() {
			return url;
		}


		public void setUrl(String url) {
			this.url = url;
		}


		public String getRegion() {
			return region;
		}


		public void setRegion(String region) {
			this.region = region;
		}


		public String getStart_year() {
			return start_year;
		}


		public void setStart_year(String start_year) {
			this.start_year = start_year;
		}


		public String getImpact() {
			return impact;
		}


		public void setImpact(String impact) {
			this.impact = impact;
		}


		public String getAdded() {
			return added;
		}


		public void setAdded(String added) {
			this.added = added;
		}


		public String getPublished() {
			return published;
		}


		public void setPublished(String published) {
			this.published = published;
		}


		public String getCity() {
			return city;
		}


		public void setCity(String city) {
			this.city = city;
		}


		public String getCountry() {
			return country;
		}


		public void setCountry(String country) {
			this.country = country;
		}


		public int getRelevance() {
			return relevance;
		}


		public void setRelevance(int relevance) {
			this.relevance = relevance;
		}


		public String getPestle() {
			return pestle;
		}


		public void setPestle(String pestle) {
			this.pestle = pestle;
		}


		public String getSource() {
			return source;
		}


		public void setSource(String source) {
			this.source = source;
		}


		public String getTitle() {
			return title;
		}


		public void setTitle(String title) {
			this.title = title;
		}


		public int getLikelihood() {
			return likelihood;
		}


		public void setLikelihood(int likelihood) {
			this.likelihood = likelihood;
		}


		public Blackcoffer() {
		}
	    
	 
	 
	  
	  

}
