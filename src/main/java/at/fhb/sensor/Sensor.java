package com.example.accessingdatarest;

import jakarta.persistence.Entity;
// Muss importiert werden, um die Klasse als JPA-Entity zu markieren.
import jakarta.persistence.Id;
// Bei Erstellung einer Entity Klasse muss immer ein Feld mit der @Id Annotation versehen werden. Dieses Feld repräsentiert den Primärschlüssel.
import jakarta.persistence.GeneratedValue;
// Wird zusammen mit Id importiert und gibt an, dass der Wert des Primärschlüssels automatisch generiert wird, wenn ein Objekt in der Datenbank gespeichert wird.
import jakarta.persistence.GenerationType;
// Wird in Verbindung mit GeneratedValue importiert und wird verwendet, um die Strategie für die Generierung der Werte des Primärschlüssels zu spezifizieren. Optional

import java.time.LocalDateTime;

@Entity
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private double temperature;
    private double humidity;
    private LocalDateTime timestamp;

    // Getter
    public long getId() {
        return id;
    }
    public double getTemperature(){
        return temperature;
    }
    public double getHumidity() {
        return humidity;
    }
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    // Setter
    public void setTemperature() {
        this.temperature = temperature;
    }
    public void setHumidity() {
        this.humidity = humidity;
    }
    public void setTimestamp() {
        this.timestamp = timestamp;
    }
}
