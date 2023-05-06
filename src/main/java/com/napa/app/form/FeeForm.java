package com.napa.app.form;
import lombok.Data;

@Data
public class FeeForm {
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
