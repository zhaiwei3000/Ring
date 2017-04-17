package com.pp.ring.model;

import java.io.Serializable;

public class Test1 implements Serializable { 
	private static final long serialVersionUID = 1L;

	private String id;
	
	private String msg;
	
	private String name;
	
	private java.util.Date datetime;
	
	private java.util.Date datetimeStart;
	
	private java.util.Date datetimeEnd;
	

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public java.util.Date getDatetime() {
		return datetime;
	}
	public void setDatetime(java.util.Date datetime) {
		this.datetime = datetime;
	}
	public java.util.Date getDatetimeStart() {
		return datetimeStart;
	}
	public void setDatetimeStart(java.util.Date datetimeStart) {
		this.datetimeStart = datetimeStart;
	}
	public java.util.Date getDatetimeEnd() {
		return datetimeEnd;
	}
	public void setDatetimeEnd(java.util.Date datetimeEnd) {
		this.datetimeEnd = datetimeEnd;
	}
	
	public String toString(){
		StringBuffer sb =  new StringBuffer();
		sb.append("id=").append(id).append("\n");
		sb.append("msg=").append(msg).append("\n");
		sb.append("name=").append(name).append("\n");
		sb.append("datetime=").append(datetime).append("\n");
		sb.append("datetimeStart=").append(datetimeStart).append("\n");
		sb.append("datetimeEnd=").append(datetimeEnd).append("\n");
		return sb.toString();
	}
	
}