package br.com.alura.microservice.loja.dto;

public class InfoPedidoDTO {

	private Integer id;
	private Integer tempoDePreparo;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTempoDePreparo() {
		return tempoDePreparo;
	}
	public void setTempoDePreparo(Integer tempoDePreparo) {
		this.tempoDePreparo = tempoDePreparo;
	}
	
	
}
