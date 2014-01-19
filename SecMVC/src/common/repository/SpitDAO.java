package common.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import common.domain.Spitter;
import common.domain.Spittle;

@Repository
public class SpitDAO {
	
	ArrayList<Spitter> spitters;
	ArrayList<Spittle> spittles;
	
	public ArrayList<Spitter> getSpitters() {
		return spitters;
	}

	public void setSpitters(ArrayList<Spitter> spitters) {
		this.spitters = spitters;
	}

	
	public ArrayList<Spittle> getSpittles() {
		return spittles;
	}

	public void setSpittles(ArrayList<Spittle> spittles) {
		this.spittles = spittles;
	}

	public List<Spitter> findAllSpitters() {
		return spitters;		
	}
	
	public void addSpitter(Spitter s) {
		spitters.add(s);
	}

	public List<Spittle> getSpittlesForSpitter(Spitter spitter) {
		// find my spitter
		if (!spitters.contains(spitter)) {
			return null;
		}
		List<Spittle> spits = new ArrayList<Spittle>();
		// find his spits
		for (Spittle s : spittles) {
			if (s.getOwner().equals(spitter)) {
				spits.add(s);
			}
		}
		return spits;
	}

	public void addSpittle(Spittle sl) {
		// TODO Auto-generated method stub
		spittles.add(sl);
	}

	public Spitter getSpitter(String username) {
		for (Spitter s: spitters) {
			if (s.getUserName().equals(username)) {
				return s;
			}
		}
		return null;
	}
	
}
