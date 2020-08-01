package com.eatza.restaurantsearch.dto;

public class ItemRequestDto {

	private Long menuId;
	private String name;
	private String description;
    private int price;

	public ItemRequestDto() {
	}

	public ItemRequestDto(Long menuId, String name, String description, int price) {
		super();
		this.menuId = menuId;
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public Long getMenuId() {
		return menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
