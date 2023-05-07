package com.jdc.elementary;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class RegistrationPK implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	@Temporal(TemporalType.DATE)
	private Date regDate;
	private LocalTime regTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public LocalTime getRegTime() {
		return regTime;
	}

	public void setRegTime(LocalTime regTime) {
		this.regTime = regTime;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, regDate, regTime);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegistrationPK other = (RegistrationPK) obj;
		return id == other.id && Objects.equals(regDate, other.regDate) && Objects.equals(regTime, other.regTime);
	}

}
