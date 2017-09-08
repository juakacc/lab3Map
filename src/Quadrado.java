
public class Quadrado implements FiguraIF {

	private int lado;
	
	public Quadrado(int lado) {
		this.lado = lado;
	}
	
	@Override
	public double area() {
		double area =  lado * lado;
		return area;
	}

	@Override
	public double perimetro() {
		double perimetro = 4 * lado;
		System.out.println("O perímetro do quadrado é: " + perimetro);
		return perimetro;
	}

	@Override
	public String toString() {
		return "O quadrado criado tem lados de tamanho: " + lado;
	}
	
	public int getLado() {
		return lado;
	}

}
