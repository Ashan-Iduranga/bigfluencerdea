package org.example.nsbmstudenthub.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, length = 20)
    private String batch;

    @Column(nullable = false)
    private Double gpa;  // Fixed: No precision/scale for Double

    // Default constructor
    public Student() {}

    // Constructor with all fields
    public Student(String name, String email, String batch, Double gpa) {
        this.name = name;
        this.email = email;
        this.batch = batch;
        this.gpa = gpa;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getBatch() { return batch; }
    public void setBatch(String batch) { this.batch = batch; }

    public Double getGpa() { return gpa; }
    public void setGpa(Double gpa) { this.gpa = gpa; }
}
