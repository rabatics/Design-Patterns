import java.util.ArrayList;

public class SizeCountingVisitor implements FSVisitor{
private int totaltSize=0;
	
	
public SizeCountingVisitor(){
	super();
	this.totaltSize=0;
}

	public void visit(Link link){
		return;
	}
	public void visit(Directory dir){
		//this.totaltSize=this.totaltSize+dir.getSize();
	}
	public void visit(File file){
		//return;
		this.totaltSize=this.totaltSize+file.getSize();
	}
	
	public int getTotalSize(){
		return this.totaltSize;
	}
	
	public int getDirNum(){return 0;}
	public int getFileNum(){return 0;}
	public int getLinkNum(){return 0;}

	@Override
	public ArrayList<File> getFoundFiles() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
