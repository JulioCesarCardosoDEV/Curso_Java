package entidades;

public class Triangulo {
	public double a;
	public double b;
	public double c;
	
	public double area() {
		double resultado;
		resultado = (a + b + c)/2;
		return resultado;
	}
}
