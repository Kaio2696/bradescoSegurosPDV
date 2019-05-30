package br.com.pdv.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean(name = "parceiroBean")
public class ParceiroBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nmParceiro;
	private String nmEmail;
	private String nrTelefone;
	private String nrCNPJ;
	private String nmSegmento;
	private String nrCelular;
	private String nrCep;
	private String nmEndereco;
	private int nrNumero;
	private String nmBairro;
	private String nmCidade;
	private String nmEstado;
	private String nmIndicador;
	private String nmUsuario;
	private String nrCPF;
	private String nrPerfil;

	public void gravar() {
		System.out.println("\nNome do parceiro: " + this.nmParceiro + "\nEmail: " + this.nmEmail + "\nTelefone: " + this.nrTelefone +
				"\nCNPJ: " + this.nrCNPJ + "\nSegmento: " + this.nmSegmento + "\nCelular: "	+ this.nrCelular + "\nCep: "	+ this.nrCep +
				"\nEndereço" + this.nmEndereco ;	
	}

	public String getNmParceiro() {
		return nmParceiro;
	}

	public void setNmParceiro(String nmParceiro) {
		this.nmParceiro = nmParceiro;
	}

	public String getNmEmail() {
		return nmEmail;
	}

	public void setNmEmail(String nmEmail) {
		this.nmEmail = nmEmail;
	}

	public String getNrTelefone() {
		return nrTelefone;
	}

	public void setNrTelefone(String i) {
		this.nrTelefone = i;
	}

	public String getNrCNPJ() {
		return nrCNPJ;
	}

	public void setNrCNPJ(String nrCNPJ) {
		this.nrCNPJ = nrCNPJ;
	}

	public String getNmSegmento() {
		return nmSegmento;
	}

	public void setNmSegmento(String nmSegmento) {
		this.nmSegmento = nmSegmento;
	}

	public String getNrCelular() {
		return nrCelular;
	}

	public void setNrCelular(String nrCelular) {
		this.nrCelular = nrCelular;
	}

	public String getNrCep() {
		return nrCep;
	}

	public void setNrCep(String nrCep) {
		this.nrCep = nrCep;
	}

	public String getNmEndereco() {
		return nmEndereco;
	}

	public void setNmEndereco(String nmEndereco) {
		this.nmEndereco = nmEndereco;
	}

	public int getNrNumero() {
		return nrNumero;
	}

	public void setNrNumero(int nrNumero) {
		this.nrNumero = nrNumero;
	}

	public String getNmBairro() {
		return nmBairro;
	}

	public void setNmBairro(String nmBairro) {
		this.nmBairro = nmBairro;
	}

	public String getNmCidade() {
		return nmCidade;
	}

	public void setNmCidade(String nmCidade) {
		this.nmCidade = nmCidade;
	}

	public String getNmEstado() {
		return nmEstado;
	}

	public void setNmEstado(String nmEstado) {
		this.nmEstado = nmEstado;
	}

	public String getNmIndicador() {
		return nmIndicador;
	}

	public void setNmIndicador(String nmIndicador) {
		this.nmIndicador = nmIndicador;
	}

	public String getNmUsuario() {
		return nmUsuario;
	}

	public void setNmUsuario(String nmUsuario) {
		this.nmUsuario = nmUsuario;
	}

	public String getNrCPF() {
		return nrCPF;
	}

	public void setNrCPF(String nrCPF) {
		this.nrCPF = nrCPF;
	}

	public String getNrPerfil() {
		return nrPerfil;
	}

	public void setNrPerfil(String nrPerfil) {
		this.nrPerfil = nrPerfil;
	}
}
