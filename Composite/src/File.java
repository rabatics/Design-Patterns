import java.util.ArrayList;
import java.util.Date;

public class File extends FSElement{
	public File(Directory parent,String name,int size,String own){
		super(parent,name,size,own);
		
	}

	public File(){
		
	}

	public String getName() {
		return super.getName();
	}

	public Directory getParent() {
		return super.getParent();
	}


	

	public int getSize() {
		return super.getSize();
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
}
