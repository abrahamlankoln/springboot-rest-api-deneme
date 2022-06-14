package com.ibrahim.simsek.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.MappedSuperclass;
import lombok.Data;


@MappedSuperclass
@Data
public class BaseEntity implements Serializable {
	
	private Date createdAt;
	private String createdBy;
	private Date uptaedAt;
	private String uptaedBy;
}
