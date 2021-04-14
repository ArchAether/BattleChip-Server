package com.archaether.battlechipserver;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BattleChip {

    private @Id @GeneratedValue Long id;
    private String name;
    private String description;
    private String element;
    private String chipClass;
    private int damage;
    private String[] chipCode;
    private int megabytes;
    private String image;

    BattleChip(){}
    
    BattleChip(String name, String description, String element,
        String chipClass, int damage, String[] chipCode, int megabytes, 
        String image) {
            
            this.name = name;
            this.description = description;
            this.element = element;
            this.chipClass = chipClass;
            this.damage = damage;
            this.chipCode = chipCode;
            this.megabytes = megabytes;
            this.image = image;
        }

    public Long getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getDescription() {
        return this.description;
    }
    public String getElement() {
        return this.element;
    }
    public String getChipClass() {
        return this.chipClass;
    }
    public int getDamage() {
        return this.damage;
    }
    public String[] getChipCode() {
        return this.chipCode;
    }
    public int getMegabytes() {
        return this.megabytes;
    }
    public String getImage() {
        return this.image;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setElement(String element) {
        this.element = element;
    }
    public void setChipClass(String chipClass) {
        this.chipClass = chipClass;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void setChipCoide(String[] chipCode) {
        this.chipCode = chipCode;
    }
    public void setMegabytes(int megabytes) {
        this.megabytes = megabytes;
    }
    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if(!(o instanceof BattleChip))
            return false;
        BattleChip battleChip = (BattleChip) o;
        return Objects.equals(this.id, battleChip.id) && 
            Objects.equals(this.name, battleChip.name) &&
            Objects.equals(this.description, battleChip.description) &&
            Objects.equals(this.element, battleChip.element) &&
            Objects.equals(this.chipClass, battleChip.chipClass) &&
            Objects.equals(this.damage, battleChip.damage) &&
            Objects.equals(this.chipCode, battleChip.chipCode) &&
            Objects.equals(this.megabytes, battleChip.megabytes) &&
            Objects.equals(this.image, battleChip.image);
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.description,
            this.description, this.element, this.chipClass,
            this.damage, this.chipCode, this.megabytes, this.image);
    }
    @Override
    public String toString() {
        return "{" + "id: " + this.id + ", name: " + this.name +
            ", description: " + this.description + ", element: " +
            this.element + ", damage: " + this.damage + ", class: " +
            this.chipClass + ", chipCode: " + this.chipCode + 
            ", megabytes: " + this.megabytes + ", image: " +
            this.image + "}";
    }
}
