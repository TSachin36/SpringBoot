package com.example.DBSpring.model;
import jakarta.persistence.*;




@Entity
@Table(name = "Students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable=false)
    private String CollegeName;
    @Column(nullable=false)
    private String Branch;
    @Column(nullable=false)
    private int Semester;
    @Column(nullable = false, unique = true)
    private String email;

    public Student() {
    }

    public Student(Long id, String firstName, String lastName, String CollegeName, String Branch, int Semester, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.CollegeName=CollegeName;
        this.Branch=Branch;
        this.Semester=Semester;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getCollegeName() {
        return CollegeName;
    }

    public void setCollegeName(String CollegeName) {
        this.CollegeName = CollegeName;
    }
    
    public String getBranch() {
        return Branch;
    }

    public void setBranch(String Branch) {
        this.Branch = Branch;
    }
    
    public int getSemester() {
        return Semester;
    }

    public void setSemester(int Semester) {
        this.Semester = Semester;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}