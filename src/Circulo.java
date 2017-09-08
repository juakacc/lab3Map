
public class Circulo implements FiguraIF {

	
	private int raio;

	public Circulo(int raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		double area = 2 * 3.14 * raio;
		return area;
	}

	@Override
	public double perimetro() {
		double perimetro = 3.14 * raio;
		System.out.println("O perímetro do círculo é: " + perimetro);
		return perimetro;
	}

	@Override
	public String toString() {
		return "O circulo criado tem raio de tamanho: " + raio;
	}

	public int getRaio() {
		return raio;
	}

}
