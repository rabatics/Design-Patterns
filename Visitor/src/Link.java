import java.util.Date;

public class Link  extends FSElement{
private FSElement fs;

	


public Link(Directory parent,String name,int size,String own){
	super(parent,name,size,own);
	this.fs=new FSElement();
	
	
}


public void accept(FSVisitor v){
	v.visit(this);
}

public void addLink(FSElement fs){
	this.fs=fs;
}


public String getName() {
	return super.getName();
}

public Directory getParent() {
	return super.getParent();
}

public Date getCreated() {
	return super.getCreated();
}
public Date getModified() {
	return super.getModified();
}
public String getOwner() {
	return super.getOwner();
}
	


public int getSize(){
	return this.fs.getSize();
}



	
}
