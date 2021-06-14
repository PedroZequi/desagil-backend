package br.edu.insper.desagil.backend.model;

public class Track {
	private Artist artist;
	private String name;
	private int duration;
	
	public Track (Artist artist, String name, int duration) {
		this.artist = artist;
		this.name = name;
		this.duration = duration;
		
	}
	public Artist getArtista () {
		return artist;
	}
	public String getNometrack() {
		return name;
	}
	public int getDuracao() {
		return duration;
	}
	
	
	public String getDurationString() {
		String duracao = "0:0";
		String duracao1 = "0:";
		if (duration < 10) {
			Integer.toString(duration);
			return duracao + duration;
		}
		else if (duration < 60 && duration>9) {
			Integer.toString(duration);
			return duracao1 + duration;	
		}
		else if (duration == 60) {
			return "1:00";			
		}
		else if (duration > 60) {
			
		}
	}
	public Artist getFullArtistName() {
		return artist;
	}
	
	

}
