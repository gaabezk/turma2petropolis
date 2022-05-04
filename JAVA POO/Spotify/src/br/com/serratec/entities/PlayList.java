package br.com.serratec.entities;

import java.util.ArrayList;
import java.util.List;

public class PlayList {

	protected Video video;
	protected Musica musica;
	protected static List playList = new ArrayList();
	
	public PlayList(Video video) {
		this.video = video;
	}
	
	public PlayList(Musica musica) {
		this.musica = musica;
	}

	public PlayList(Video video, Musica musica) {
		this.video = video;
		this.musica = musica;
	}
	
	
	public void addVideo(Video video) {
		this.playList.add(video);
	}
	
	public void addMusica(Musica musica) {
		this.playList.add(musica);
	}

	public Video getVideo() {
		return video;
	}

	public Musica getMusica() {
		return musica;
	}

	public static List getPlayList() {
		return playList;
	}

	@Override
	public String toString() {
		return "PlayList [video=" + video + ", musica=" + musica + "]";
	}
	
	
	
}