package com.demo.springmvc.thymeleaf.springbootjpathymeleafcurd.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "product")
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(name="id", nullable = false, length = 36) 
    private String id;
    
    @Column(name="name",nullable = false, length = 50) 
    private String name;
    
    @Column(name="description",nullable = false, length = 50) 
    private String description;
    
    @Column(name="type",nullable = false, length = 50) 
    private String type;
    
    @Column(name="category",nullable = false, length = 50) 
    private String category;
    
    public Product(String name, String description, String type, String category, Double price) {
		super();
		this.name = name;
		this.description = description;
		this.type = type;
		this.category = category;
		this.price = price;
	}

	@Column(name="price") 
    private Double price;

    public Product() {
    }

    @Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", type=" + type
				+ ", category=" + category + ", price=" + price + "]";
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
