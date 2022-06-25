package trilha.back.financys.entities;

import java.util.Date;


public class Lancamento implements Comparable<Lancamento> {

	private Long id;
	private String name;
	private String description;
	private String type;
	private String amount;
	private Date date;
	private Boolean payd;
	private Long categoryid;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Date getDate() {
//		date = new Date();
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	public Boolean getPayd() {
		return payd;
	}

	public void setPayd(Boolean payd) {
		this.payd = payd;
	}

	public Long getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(Long categoryid) {
		this.categoryid = categoryid;
	}

	@Override
	public int compareTo(Lancamento lancamento) {
		return this.getDate().compareTo(lancamento.getDate());
	}

}
