package br.com.fametro.dac.exercicio.cafeteria.condimentos;

import br.com.fametro.dac.exercicio.cafeteria.bebidas.Bebida;

public class Creme extends CondimentoDecorator {

	Bebida bebida;

	public Creme(Bebida bebida) {
		this.bebida = bebida;
	}

	public String getDescricao() {
		return bebida.getDescricao() + ", Creme";
	}

	public double custo() {
		return bebida.custo() + .90;
	}

}
