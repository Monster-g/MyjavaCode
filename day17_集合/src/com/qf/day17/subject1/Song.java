package com.qf.day17.subject1;

public class Song {
	private String songname;
	private String personname;
	private int duration;
	
	
	
	public Song() {
	}

	public Song(String songname, String personname, int duration) {
		this.songname = songname;
		this.personname = personname;
		this.duration = duration;
	}



	public String play() {
//		System.out.println("歌曲名：" + songname + "歌手：" + personname + "播放时长：" + duration);
		return "\t" + personname + "\t播放时长：" + duration;
	}
}
