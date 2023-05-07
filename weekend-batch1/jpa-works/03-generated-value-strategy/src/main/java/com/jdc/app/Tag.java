package com.jdc.app;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Lob;

@Embeddable
public class Tag implements Serializable {

	private static final long serialVersionUID = 1L;

	private String tag;
	@Lob
	private String description;
	
	@ElementCollection
	private List<String> comments;

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getComments() {
		return comments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, tag, comments);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tag other = (Tag) obj;
		return Objects.equals(description, other.description) && Objects.equals(tag, other.tag) && Objects.equals(comments, other.comments);
	}

}
