import java.util.Date;

public class FSElement {
private String name;
private Directory parent;
private int size;
private Date created;
private Date modified;
private String owner;
private Boolean isLeaf;

public FSElement(Directory parent,String n,int s,String own){
	this.parent=parent;
	this.name=n;
	this.size=s;
	this.owner=own;
	this.created=new Date();
	this.modified=new Date();
	this.isLeaf=true;
}

public Boolean getIsLeaf(){
	return isLeaf;
}

public String getName() {
	return name;
}

public void setIsLeaf(Boolean leaf){
	this.isLeaf=leaf;
}

public Directory getParent() {
	return parent;
}

public int getSize() {
	return size;
}
public Date getCreated() {
	return new Date(created.getTime());
}
public Date getModified() {
	return new Date(modified.getTime());
}
public String getOwner() {
	return owner;
}

public void showAllElements(){}

public FSElement(){
	
}

public static void main(String[] args){
	FileSystem fs=FileSystem.getFileSystem();
	Directory system=new Directory(fs.getRoot(),"system",0,fs.getRoot().getOwner());
	Directory home=new Directory(fs.getRoot(),"home",0,fs.getRoot().getOwner());
	
	system.appendChild(new File(system,"a",1,system.getOwner()));
	system.appendChild(new File(system,"b",2,system.getOwner()));
	system.appendChild(new File(system,"c",1,system.getOwner()));
	home.appendChild(new File(system, "d", 2, home.getOwner()));
	Directory pictures = new Directory(home, "pictures", 0, home.getOwner());
	home.appendChild(pictures);
	pictures.appendChild(new File(pictures, "e", 1, home.getOwner()));
	pictures.appendChild(new File(pictures, "f", 1, home.getOwner()));


	
	fs.getRoot().appendChild(system);
	fs.getRoot().appendChild(home);
	System.out.println("Size of Root:"+fs.getRoot().getSize());
	fs.showAllElements();
	
	
}


}
