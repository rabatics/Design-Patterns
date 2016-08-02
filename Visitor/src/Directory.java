import java.util.ArrayList;
import java.util.Date;

public class Directory extends FSElement{
private ArrayList<FSElement> children=new ArrayList<FSElement>();

public Directory(Directory parent,String name,int size,String own){
	super(parent,name,size,own);
	
}

public Directory(){
	
}
public void appendChild(FSElement child){
	this.children.add(child);
	super.setIsLeaf(false);
}

public String getName() {
	return super.getName();
}

public Directory getParent() {
	return super.getParent();
}


public ArrayList<FSElement> getChildren(){
	return this.children;
}

public int getSize() {
	int totalsize=0;
	for(FSElement f:this.getChildren()){
		totalsize=totalsize+f.getSize();
	}
	return totalsize;
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

public void accept(FSVisitor v){

	v.visit(this);
	for(FSElement fs:getChildren()){
		fs.accept(v);
	}
	
}

public void showAllElements() {
	
	int i=0;
	System.out.print("\t\t");
	for(FSElement fs : getChildren()){
		
		if(!fs.getIsLeaf()){
			System.out.print(fs.getName()+"\t\t");
			
		}
		
		else{
			System.out.print(fs.getName()+" ");
			
		}
		i++;
		if(i==getChildren().size() && !fs.getIsLeaf()){
			System.out.println();
		}
		
		
	}

	
for(FSElement fs : getChildren()){
		
		if(!fs.getIsLeaf()){
			
			fs.showAllElements();
			//System.out.println("\t\t");
			
			
		}
	
		

		
	}
	
	/*}
	else{
		System.out.print(this.getName()+" ");
	}*/
	
}


}
