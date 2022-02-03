package com.interview.coding.course;

import java.io.Serializable;

/**
 * Make Employee Serializable
 */
public class Homework_Serializable {

    public static class Employee implements Serializable {

        private static final Long serialVersionUID = 1L;

        private String name;
        private int id;

        public Employee(){}
        public Employee(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}
