package org.openpkw.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Created by Łukasz Franczuk (luk.franczuk@gmail.com) on 2015-08-05. 
 * Edit by Jacek Feliksiak (jacekfeliksiak@gmail.com) on 2015-08-06.
 */

@Entity
@Table(name = "opm_pozycje_protokolu")
public class ProtocolItem {

	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Column(name="TrescPozycjiProtokolu")
	private String protocolItemContent;
	
	@Column(name="ProtokolID")
	@OneToOne
	@JoinColumn(name="id")
	private Protocol protocol;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProtocolItemContent() {
		return protocolItemContent;
	}
	public void setProtocolItemContent(String protocolItemContent) {
		this.protocolItemContent = protocolItemContent;
	}
	public Protocol getProtocol() {
		return protocol;
	}
	public void setProtocol(Protocol protocol) {
		this.protocol = protocol;
	}
	
}
