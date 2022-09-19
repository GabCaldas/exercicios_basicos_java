package entities;

public class Rectangle {
     public double Width, Height;

    public double Area() {
        return Width * Height;

    }

    public double Perimeter() {
        return 2*(Width*Height);
    }

    public double Diagonal() {
        return Math.sqrt(Math.pow(Width,2)+Math.pow(Height,2));
    }

    public String toString(){
        return "Área do Retângulo: "+
                Area()+" | "+ "Perímetro do Retângulo: " + Perimeter() +
                " | " + "Diagonal do Retângulo: " + Diagonal();
    }
}
