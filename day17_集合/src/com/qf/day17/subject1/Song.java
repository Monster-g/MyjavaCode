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
//		System.out.println("��������" + songname + "���֣�" + personname + "����ʱ����" + duration);
		return "\t" + personname + "\t����ʱ����" + duration;
	}
}
