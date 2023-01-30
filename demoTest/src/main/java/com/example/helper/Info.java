package com.example.helper;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Info {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
    private long  id;
	
	@Column(name = "NAME")
    private String name;
	
	@Column(name = "DESCRIPTION")
    private String description;
	
	@Column(name = "TIME")
    private String time;
    
    public Info(){}
    
    

	public Info(long id, String name, String description, String time) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.time = time;
	}



	@Override
	public int hashCode() {
		return Objects.hash(description, id, name, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Info other = (Info) obj;
		return Objects.equals(description, other.description) && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(time, other.time);
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getTime() {
		return time;
	}



	public void setTime(String time) {
		this.time = time;
	}
	
	
    
    


    
    

}
