import java.util.ArrayList;

public class CountingVisitor implements FSVisitor {
	
private int dirNum=0;
private int fileNum=0;
private int lnkNum=0;

public CountingVisitor(){
	super();
this.dirNum=0;
this.fileNum=0;
this.lnkNum=0;
}



public int getDirNum(){
	return this.dirNum;
 }

 public int getFileNum(){
	return this.fileNum;
 }
 
public int getLinkNum(){
	return this.lnkNum;
 }

public void visit(Directory dir){
	this.dirNum++;
}

public void visit(File dir){
	this.fileNum++;
}
public void visit(Link dir){
	this.lnkNum++;
}



@Override
public ArrayList<File> getFoundFiles() {
	// TODO Auto-generated method stub
	return null;
}



@Override
public int getTotalSize() {
	// TODO Auto-generated method stub
	return 0;
}







}
