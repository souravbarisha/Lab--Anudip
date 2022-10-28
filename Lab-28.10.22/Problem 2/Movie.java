package com.lab;
/*Problem 2
Movie Theatre Management System, where you can create two classes one is main another one is movie, 
movie class can have two methods setMovie,getMovie where you can create movieName,movieStartTime,movieEndTime,
MovieTicketPrice as instance variables  */
public class Movie {
	String movieName;
	String starttime,endtime;
	void setMovie(String mname,String starttimee,String endtime){
		movieName=mname;
		starttime=starttime;
		this.endtime=endtime;
	}
	void getMovie(){
		System.out.println("Movie Name="+movieName+"  Start time="+starttime+" Endtime="+endtime);
	}
   
}
