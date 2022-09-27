/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo0.app_challengue;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Quadbike")
public class QuadbikeController 
{
    @GetMapping("/all")
    public String getQuadbikes()
    {
        return "Quadbike 1, Quadbike 2 ...";
    }
    
    @PostMapping("/save")
    public String createQuadbike()
    {
        return "Hello my cats";
    }
}
