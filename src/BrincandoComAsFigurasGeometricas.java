
public class BrincandoComAsFigurasGeometricas {

	public static void main(String[] args) {

		Retangulo retangulo = new Retangulo(10, 5);
		Quadrado quadrado = new Quadrado(7);
		Circulo circulo = new Circulo(25);
		
		retangulo.perimetro();
		circulo.perimetro();
		quadrado.perimetro();
		
		System.out.println();
		
		System.out.println("A área deste quadrado é: " + quadrado.area());
		System.out.println("A área deste retangulo é: " + retangulo.area());
		System.out.println("A área deste circulo é: " + circulo.area());
		System.out.println("Todas as áreas são: " +  retangulo.area() + ", " + quadrado.area() + " e " 
				+ circulo.area() + ", retângulo, quadrado e círculo, respectivamente.");
		
		System.out.println();
		
		System.out.println(retangulo);
		System.out.println(circulo);
		System.out.println(quadrado);
		System.out.println("O retangulo criado tem altura: " + retangulo.getAltura() + " e largura de: " + retangulo.getLargura() +
			". O quadrado criado tem lados de: " + quadrado.getLado() +
			". O circulo criado tem raio de: " + circulo.getRaio());
	}
}