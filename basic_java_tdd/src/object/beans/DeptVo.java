package object.beans;

public class DeptVo {
	private String deptNo;  // �μ���ȣ
	private String dName;   // �μ���
	private String loc;     // �μ���ġ
	
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	public String getDeptNo() {
		return this.deptNo;
	}
	
	public void setDName(String dName) {
		this.dName = dName;
	}
	public String getDName() {
		return this.dName;
	}
	
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getLoc() {
		return this.loc;
	}
	
	@Override
	public String toString() {
		String resultStr = "";
		
		resultStr = this.deptNo + "_" + 
					this.dName + "_" + 
				    this.loc;
		
		return resultStr;
	}
	
}






