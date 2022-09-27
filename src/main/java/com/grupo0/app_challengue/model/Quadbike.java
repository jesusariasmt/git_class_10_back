/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo0.app_challengue.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name="db-quadbike")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Quadbike implements Serializable
{
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="brand")
    private String brand;
    @Column(name="year")
    private Integer year;
    @Column(name="description")
    private String description;
    @Column(name="category")
    private Integer category;
    
}
