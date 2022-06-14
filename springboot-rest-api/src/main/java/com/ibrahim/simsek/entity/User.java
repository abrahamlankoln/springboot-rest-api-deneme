package com.ibrahim.simsek.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name="KULLANICILAR")
@Data
public class User extends BaseEntity {
	@Id
	@SequenceGenerator(name = "user_seq_gen",sequenceName ="user_gen",initialValue =100,allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "user_seq_gen")
	@Column(name="ID")
	private long id;
	@Column(name="ISIM",length = 100)
	private String firstName;
	@Column(name="SOYISIM",length = 100)
	private String lastName;
	
}
