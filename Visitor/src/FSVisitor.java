import java.util.ArrayList;

public interface FSVisitor {
	
public void visit(Link link);
public void visit(Directory dir);
public void visit(File file);

public int getDirNum();
public int getFileNum();
public int getLinkNum();

public ArrayList<File> getFoundFiles();

public int getTotalSize();


}

