package br.com.gabriel.miniloja.view;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import br.com.gabriel.miniloja.model.Produto;
import br.com.gabriel.miniloja.service.ProdutoService;

@ManagedBean(name="produtosView")
@SessionScoped
public class ProdutosView implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<Produto> produtos;
	
	private Produto produto;
	
	@ManagedProperty("#{produtoService}")
	private ProdutoService service;
	
	@PostConstruct
	public void init()	{
		this.produtos = service.createProducts( );
		this.produto = new Produto();
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setService(ProdutoService service) {
		this.service = service;
	}
	
	public String adicionar()	{
		getProdutos().add(getProduto());
		this.produto = new Produto();
		
		return "";
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
