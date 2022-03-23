package teste;

public class ItemCafe {
	private String item;
	
	public ItemCafe(String item) {
		this.item = item;
	}

	public String toString() {
		return item + "\n";
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}
}
