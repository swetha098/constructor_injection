package USTBatchNo3.di_constructor_injection;

public class roles {
	public String char_name;
	public String responsibility;
	
	public roles(String char_name, String responsibility) {
		super();
		this.char_name = char_name;
		this.responsibility = responsibility;
	}
	public String toString() {
		return "roles [char_name=" + char_name + ", responsibility=" + responsibility + "]";
	}
	public void display() {
		System.out.println("my name is :"+ char_name +" "+"My role is : "+responsibility);
	}

}
