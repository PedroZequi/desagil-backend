package br.edu.insper.desagil.backend.model;

import java.util.List;

public class CollaborationTrack extends Track {
	private List<Artist> collaborators;
	
	public CollaborationTrack(Artist artist, String name, int duration) {
	super(artist, name, duration);

	}
		
	@Override
	public Artist getFullArtistName() {
		int n = collaborators.size();
		if (n==1) {
			String artist = this.name;
			Artist collab = collaborators.get(0);
			return  + "(feat. " + collab +")"; 
		}
		else if (n>2) {
			for (int i=0; i < n; i++) {
				
			}
		}
			
		return 
			
			
			
		}
		
		


}
