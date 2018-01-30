package br.com.caelum.notasfiscais.mb;

import java.math.BigDecimal;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import br.com.caelum.notasfiscais.dao.ProdutoDao;
import br.com.caelum.notasfiscais.modelo.Produto;

@ManagedBean
@ViewScoped
public class ProdutoBean {
	
	private Produto produto = new Produto();
	private List<Produto> produtos;
	private	ProdutoDao dao = new ProdutoDao();
	private BigDecimal soma = new BigDecimal(0);

	public void grava(){
		if(this.produto.getId()==null)
			dao.adiciona(produto);
		else
			dao.atualiza(produto);
		produto = new Produto();
		this.produtos = null;
	}
	
	public void exclui(Produto produto){
		System.out.println("Removendo");
		dao.remove(produto);
		this.produtos=null;
	}
	public void cancelar(){
		System.out.println("Cancelando a alteraçao");
		this.produto = new Produto();
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public List<Produto> getProdutos() {
		System.out.println("Chamando lista produtos");
		if(this.produtos==null)
			this.produtos = dao.listaTodos();
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public BigDecimal getSoma(){
		if(this.produtos==null)
			this.produtos = dao.listaTodos();
		for (Produto produto : this.produtos) {
			this.soma = this.soma.add(new BigDecimal(produto.getPreco()));
		}
		System.out.println(this.soma);
		return this.soma;
	}
	
	
}
