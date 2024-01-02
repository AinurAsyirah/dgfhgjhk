package com.heroku.java.REPOSITORY;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class repository {

    private final JdbcTemplate jdbc;

    @Autowired
    public repository(JdbcTemplate jdbc){
        this.jdbc=jdbc;
    }

    public void addStudent(String username, String nama, String email, String notel, String dob, String jantina,
                        String tingkatan, String kelas, String alamat, String password){

                            String sql = "INSERT INTO STUDENT(studentic,studentname, studentemail,studentphone,studentdob, studentgender,studentform, studentaddress, studentpassword)" + 
                            "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";

                            jdbc.update(sql, username, nama, email, notel, dob, jantina, tingkatan, kelas, alamat, password);
                        }

}
