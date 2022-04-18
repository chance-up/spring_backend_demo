package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class User {
    private Long id;
    private String name;

    // public Long getId() {
    // return id;
    // }

    // public void setId(Long id) {
    // this.id = id;
    // }

    // public String getName() {
    // return name;
    // }

    // public void setName(String name) {
    // this.name = name;
    // }

    // public User(Long id, String name) {
    // super();
    // this.id = id;
    // this.name = name;
    // }

    // public Long getId() {
    // return id;
    // }

    // public void setId(Long id) {
    // this.id = id;
    // }

    // public String getName() {
    // return this.name;
    // }

    // public void setName(String name) {
    // this.name = name;
    // }
}
