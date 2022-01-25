package br.com.example.mvc.mudi.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.com.example.mvc.mudi.model.Oferta;

public class RequisicaoNovaOferta {
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private Long pedidoId;
	private String valor;
	private String dataEntrega;
	private String comentario;
	
	
	public Long getPedidoId() {
		return pedidoId;
	}
	public void setPedidoId(Long pedidoId) {
		this.pedidoId = pedidoId;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(String dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public Oferta toOferta() {
		Oferta oferta = new Oferta();
		oferta.setId(this.pedidoId);		
		oferta.setDataEntrega(LocalDate.parse(this.dataEntrega, formatter));
		oferta.setValor(new BigDecimal(this.valor));
		oferta.setComentario(this.comentario);
		return null;
	}
	
	
	
	
	
}
