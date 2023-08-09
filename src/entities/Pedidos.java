package entities;

import java.util.Date;

import entities.enums.DeliveryEnum;

public class Pedidos {

	private Integer id;
	private Date moment;
	private DeliveryEnum status;

	public Pedidos() {
		
	}

	public Pedidos(Integer id, Date moment, DeliveryEnum status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public DeliveryEnum getStatus() {
		return status;
	}

	public void setStatus(DeliveryEnum status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedidos [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
	
	}


