package com.hidroginastica.hidroginastica.moldels;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Professor implements Serializable {

	private static final long serialVersionUIO = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Id;
}

