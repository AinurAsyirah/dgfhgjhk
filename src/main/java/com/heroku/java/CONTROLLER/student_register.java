package com.heroku.java.CONTROLLER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.heroku.java.REPOSITORY.repository;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestParam;

import com.heroku.java.MODEL.student_register_model;

import jakarta.servlet.http.HttpSession;

import javax.sql.DataSource;
import java.sql.Connection;
//import java.sql.ResultSet;
// import java.util.ArrayList;
// import java.util.Map;
import java.sql.SQLException;

// import org.jscience.physics.amount.Amount;
// import org.jscience.physics.model.RelativisticModel;
// import javax.measure.unit.SI;
@RestController
public class student_register{
    private final repository repo;

    @Autowired
    public student_register(repository repo){
        this.repo =repo;
    }

    @PostMapping("/signup")
    public String addStudent(@RequestBody student_register_model student){
        repo.addStudent(
            student.getUsername(),
            student.getNama(),
            student.getEmail(),
            student.getNotel(),
            student.getDob(),
            student.getJantina(),
            student.getTingkatan(),
            student.getKelas(),
            student.getAlamat(),
            student.getPassword()
        );
        return "redirect:/signin";
    }
}

