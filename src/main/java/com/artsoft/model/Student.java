package com.artsoft.model;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Arrays;

@Entity
@Table( name = "students" , schema = "university")
public class Student {

    private Long id;
    private String ssn;
    private String name;
    private String surname;
    private LocalDate birthday;
    private LocalDate startStudyDate;
    private LocalDate endLocalDate;
    private String username;
    private String password;
    private String address;
    private boolean receivePaper;
    private String[] favovriteFrameworks;
    private String gender;
    private String country;
    private String[] skills;
    private MultipartFile photo;

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

    public LocalDate getStartStudyDate() {
        return startStudyDate;
    }

    public void setStartStudyDate(LocalDate startStudyDate) {
        this.startStudyDate = startStudyDate;
    }

    public LocalDate getEndLocalDate() {
        return endLocalDate;
    }

    public void setEndLocalDate(LocalDate endLocalDate) {
        this.endLocalDate = endLocalDate;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isReceivePaper() {
        return receivePaper;
    }

    public void setReceivePaper(boolean receivePaper) {
        this.receivePaper = receivePaper;
    }

    public String[] getFavovriteFrameworks() {
        return favovriteFrameworks;
    }

    public void setFavovriteFrameworks(String[] favovriteFrameworks) {
        this.favovriteFrameworks = favovriteFrameworks;
    }

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

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public MultipartFile getPhoto() {
        return photo;
    }

    public void setPhoto(MultipartFile photo) {
        this.photo = photo;
    }

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
        if (endLocalDate != null ? !endLocalDate.equals(student.endLocalDate) : student.endLocalDate != null)
            return false;
        if (username != null ? !username.equals(student.username) : student.username != null) return false;
        if (password != null ? !password.equals(student.password) : student.password != null) return false;
        if (address != null ? !address.equals(student.address) : student.address != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(favovriteFrameworks, student.favovriteFrameworks)) return false;
        if (gender != null ? !gender.equals(student.gender) : student.gender != null) return false;
        if (country != null ? !country.equals(student.country) : student.country != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(skills, student.skills)) return false;
        return photo != null ? photo.equals(student.photo) : student.photo == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (ssn != null ? ssn.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (startStudyDate != null ? startStudyDate.hashCode() : 0);
        result = 31 * result + (endLocalDate != null ? endLocalDate.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (receivePaper ? 1 : 0);
        result = 31 * result + Arrays.hashCode(favovriteFrameworks);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(skills);
        result = 31 * result + (photo != null ? photo.hashCode() : 0);
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
                ", endLocalDate=" + endLocalDate +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", receivePaper=" + receivePaper +
                ", favovriteFrameworks=" + Arrays.toString(favovriteFrameworks) +
                ", gender='" + gender + '\'' +
                ", country='" + country + '\'' +
                ", skills=" + Arrays.toString(skills) +
                ", photo=" + photo +
                '}';
    }
}
