package com.skalashynski.spring.spring4.model;

import com.skalashynski.spring.spring4.util.LocalDateToDateConverter;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "students", schema = "university")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    @Column(name = "ssn", unique = true)
    private String ssn;

    @NotEmpty
    @Basic
    @Column(name = "name")
    private String name;

    @NotEmpty
    @Basic
    @Column(name = "surname")
    private String surname;

    @Convert(converter = LocalDateToDateConverter.class)
    @Column(name = "birthday")
    //@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate birthday;

    @Convert(converter = LocalDateToDateConverter.class)
    @Column(name = "startStudyDate")
    //@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate startStudyDate;

    @Convert(converter = LocalDateToDateConverter.class)
    @Column(name = "endLocalDate")
    //@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate endStudyDate;

    @Basic
    @Column(name = "username")
    private String username;

    @Basic
    @Column(name = "password")
    private String password;

    //private String address;
    @Basic
    @Column(name = "receivePaper")
    private boolean receivePaper;

    //private String[] favoriteFrameworks;

    @Basic
    @Column(name = "gender")
    private String gender;

    @Basic
    @Column(name = "country")
    private String country;

    //private String[] skills;
    //private MultipartFile photo;

    public Student() {
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    //
    public LocalDate getStartStudyDate() {
        return startStudyDate;
    }

    public void setStartStudyDate(LocalDate startStudyDate) {
        this.startStudyDate = startStudyDate;
    }

    public LocalDate getEndStudyDate() {
        return endStudyDate;
    }

    public void setEndStudyDate(LocalDate endStudyDate) {
        this.endStudyDate = endStudyDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }

    public boolean isReceivePaper() {
        return receivePaper;
    }

    public void setReceivePaper(boolean receivePaper) {
        this.receivePaper = receivePaper;
    }

//    public String[] getFavoriteFrameworks() {
//        return favoriteFrameworks;
//    }
//
//    public void setFavoriteFrameworks(String[] favouriteFrameworks) {
//        this.favoriteFrameworks = favouriteFrameworks;
//    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

//    public String[] getSkills() {
//        return skills;
//    }
//
//    public void setSkills(String[] skills) {
//        this.skills = skills;
//    }

   /* public MultipartFile getPhoto() {
        return photo;
    }

    public void setPhoto(MultipartFile photo) {
        this.photo = photo;
    }
*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (receivePaper != student.receivePaper) return false;
        if (id != null ? !id.equals(student.id) : student.id != null) return false;
        if (ssn != null ? !ssn.equals(student.ssn) : student.ssn != null) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        if (surname != null ? !surname.equals(student.surname) : student.surname != null) return false;
        if (birthday != null ? !birthday.equals(student.birthday) : student.birthday != null) return false;
        if (startStudyDate != null ? !startStudyDate.equals(student.startStudyDate) : student.startStudyDate != null)
            return false;
        if (endStudyDate != null ? !endStudyDate.equals(student.endStudyDate) : student.endStudyDate != null)
            return false;
        if (username != null ? !username.equals(student.username) : student.username != null) return false;
        if (password != null ? !password.equals(student.password) : student.password != null) return false;
//        if (address != null ? !address.equals(student.address) : student.address != null) return false;
        //Probably incorrect - comparing Object[] arrays with Arrays.equals
//        if (!Arrays.equals(favoriteFrameworks, student.favoriteFrameworks)) return false;
        if (gender != null ? !gender.equals(student.gender) : student.gender != null) return false;
        return (country != null ? !country.equals(student.country) : student.country != null);
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
//        return Arrays.equals(skills, student.skills);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (ssn != null ? ssn.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (startStudyDate != null ? startStudyDate.hashCode() : 0);
        result = 31 * result + (endStudyDate != null ? endStudyDate.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
//        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (receivePaper ? 1 : 0);
//        result = 31 * result + Arrays.hashCode(favoriteFrameworks);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
//        result = 31 * result + Arrays.hashCode(skills);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", ssn='" + ssn + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                ", startStudyDate=" + startStudyDate +
                ", endStudyDate=" + endStudyDate +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
//                ", address='" + address + '\'' +
                ", receivePaper=" + receivePaper +
//                ", favouriteFrameworks=" + Arrays.toString(favoriteFrameworks) +
                ", gender='" + gender + '\'' +
                ", country='" + country + '\'' +
//                ", skills=" + Arrays.toString(skills) +
                '}';
    }
}
