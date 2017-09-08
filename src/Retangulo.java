
public class Retangulo implements FiguraIF {
	
	private int largura;
	private int altura;

	
	public Retangulo(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
	}

	@Override
	public double area() {
		double area  = largura * altura;
		return area;
	}

	@Override
	public double perimetro() {
		double perimetro = (2 * altura) + (2 * largura);
		System.out.println("O perímetro do retângulo é: " + perimetro);
		return perimetro;
	}

	@Override
	public String toString() {
		return "O retangulo criado tem altura de tamanho: " + altura + 
				" e largura de tamanho: " + largura;
	}

	public int getLargura() {
		return largura;
	}

	public int getAltura() {
		return altura;
	}

}
