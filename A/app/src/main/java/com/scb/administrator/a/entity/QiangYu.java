package com.scb.administrator.a.entity;

import java.io.Serializable;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.datatype.BmobRelation;

public class QiangYu extends BmobObject implements Serializable{

	/**
	 * qiang yu entity,每个列表item内容
	 * 2014/4/27
	 */
	private static final long serialVersionUID = -6280656428527540320L;

	private User author;
	private String content;
	private String reply;
	private String title;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getReply() {
		return reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getComment() {
		return comment;
	}

	public void setComment(int comment) {
		this.comment = comment;
	}

	public BmobRelation getRelation() {
		return relation;
	}

	public void setRelation(BmobRelation relation) {
		this.relation = relation;
	}

	private int comment;

	private BmobRelation relation;





}
