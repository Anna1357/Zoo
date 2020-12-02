package org.itstep;

import java.util.Arrays;

    public abstract class Animals extends Zoo {
        private String name;
        private int weight;
        private int age;
        private int number;
        private int years;
        private String type;
        private Expen[] expenses = new Expen[0];
        public Animals(String name, int weight, int age, int number, int years,String type){
            this.name= name;
            this.age= age;
            this.number= number;
            this.weight= weight;
            this.years= years;
            this.type=type;

        }
        public void addExp(Expen expenses){
            this.expenses= Arrays.copyOf(this.expenses,this.expenses.length);
            this.expenses[this.expenses.length-1]=expenses;
        }
        public double getExpForDay(Date date){
            double sum=0;
            for(Expen e:expenses){
                if(date.equals( e.getDate() )){
                    sum+=e.getMoney();
                }
            }
            return sum;
        }
        public double getAllExp(){
            double sum=0;
            for(Expen e:expenses){
                sum+=e.getMoney();
            }
            return sum;
        }
        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public int getYears() {
            return years;
        }

        public void setYears(int years) {
            this.years = years;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "name: '" + name +
                    ", weight: " + weight +
                    ", age: " + age +
                    ", number: " + number +
                    ", years: " + years +
                    ", type: '" + type +
                    ", expenses: " + Arrays.toString( expenses );
        }
    }


