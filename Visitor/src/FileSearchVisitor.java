import java.util.ArrayList;

public class FileSearchVisitor implements FSVisitor{
private ArrayList<File> foundFiles;
private String ext;


public FileSearchVisitor(String ext){
	
	this.ext=ext;
	this.foundFiles=new ArrayList<File>();
}




public void visit(Link link){
	return;
}
public void visit(Directory dir){
	return;
}
public void visit(File file){
	
	if(file.getName().contains(this.ext)){
		this.foundFiles.add(file);
	}
}

public ArrayList<File> getFoundFiles(){
	return this.foundFiles;
}

public int getDirNum(){return 0;}
public int getFileNum(){return 0;}
public int getLinkNum(){return 0;}




@Override
public int getTotalSize() {
	// TODO Auto-generated method stub
	return 0;
}




}
