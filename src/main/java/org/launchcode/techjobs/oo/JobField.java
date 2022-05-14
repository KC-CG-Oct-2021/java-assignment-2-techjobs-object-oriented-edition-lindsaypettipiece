package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {

        private int id;
        private static int nextId = 1;
        private String value;

        public JobField() {
            id = nextId;
            nextId++;
        }

        public JobField(String value) {
            this();
            this.value = value;
        }
        public int getId() {
        return id;
    }

        public String getValue() {
        return value;
    }

        public void setValue(String value) {
        this.value = value;
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.

        public String toString(){
            return value;
        }



        @Override
        public int hashCode() {
            return Objects.hash(id, value);
        }
        // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
        //  their id fields match.

        // Getters and Setters:



    }



