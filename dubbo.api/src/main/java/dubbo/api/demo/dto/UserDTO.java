package dubbo.api.demo.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class UserDTO implements Serializable {
	
	private static final long serialVersionUID = -5545678403213835790L;

	private String name = "张三";

	private String tel = "1820012345678";
	
	private List<Integer> nums = new ArrayList<Integer>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public List<Integer> getNums() {
		return nums;
	}

	public void setNums(List<Integer> nums) {
		this.nums = nums;
	}

	public UserDTO() {
		nums.add(1);
		nums.add(3);
	}

	@Override
	public String toString() {
		return "UserDTO [name=" + name + ", tel=" + tel + ", nums=" + nums
				+ "]";
	}

}
