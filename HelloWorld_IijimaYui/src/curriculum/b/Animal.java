package curriculum.b;

public class Animal {
private String name;   
private double length; 
private double speed;  

// 動物のsetter
public void setName(String name) {
    this.name = name; 
}
// 動物のgetter
public String getName() {
    return this.name;
}

// 体長のsetter
public void setLength(double length) {
    this.length = length;
}
// 体長のgetter
public double getLength() {
    return this.length;
}

// 速度のsetter
public void setSpeed(double speed) {
    this.speed = speed;
}
// 速度のgetter
public double getSpeed() {
    return this.speed;
    }
}