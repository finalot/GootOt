package com.kh.ot.admin.vo;

public class Design {

	private int no;
	private String mainComment;
	private String oriFIle;
	private String reFile;
	private String mainLink;
	public Design() {
		super();
	}
	public Design(int no, String mainComment, String oriFIle, String reFile, String mainLink) {
		super();
		this.no = no;
		this.mainComment = mainComment;
		this.oriFIle = oriFIle;
		this.reFile = reFile;
		this.mainLink = mainLink;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getMainComment() {
		return mainComment;
	}
	public void setMainComment(String mainComment) {
		this.mainComment = mainComment;
	}
	public String getOriFIle() {
		return oriFIle;
	}
	public void setOriFIle(String oriFIle) {
		this.oriFIle = oriFIle;
	}
	public String getReFile() {
		return reFile;
	}
	public void setReFile(String reFile) {
		this.reFile = reFile;
	}
	public String getMainLink() {
		return mainLink;
	}
	public void setMainLink(String mainLink) {
		this.mainLink = mainLink;
	}
	@Override
	public String toString() {
		return "Design [no=" + no + ", mainComment=" + mainComment + ", oriFIle=" + oriFIle + ", reFile=" + reFile
				+ ", mainLink=" + mainLink + "]";
	}
	
	
}