package br.com.gabriel.miniloja.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.com.gabriel.miniloja.model.Produto;

@ManagedBean(name="produtoService")
@ApplicationScoped
public class ProdutoService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public List<Produto> createProducts()
	{
		List<Produto> lista = new ArrayList<Produto>();
		lista.add(new Produto("Monitor 22 Polegadas","Monitor DELL", 600.00f ) );
		lista.add(new Produto("Notebook Dell","DELL Inspiron AD8200", 2500.00f ) );
		lista.add(new Produto("Desktop DELL","DELL Enterprise OP9000", 3500.00f ) );
		return lista;
	}
}
