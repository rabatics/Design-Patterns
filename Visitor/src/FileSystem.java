

public class FileSystem {
	
	private Directory dir;
//	private Directory current;
	private static FileSystem instance = null;
	
	private FileSystem(){
		this.dir = new Directory(null, "root", 0, "Rajesh");
//		this.current=dir;
	};
	
	public static FileSystem getFileSystem(){
		if(instance == null){
			instance = new FileSystem();
		}
		return instance;
	}
	
	public Directory getRoot(){
		return this.dir;
	}
	
	public void showAllElements(){
		/*for(FSElement fs : dir.getChildren()){
			System.out.print(fs.getName() + "-->");
			fs.showAllElements();
		}*/
		System.out.println(dir.getName());
		dir.showAllElements();
	}
	
	
/*	public void setCurrent(Directory dir){
		this.current=dir;
	}
	
	
	public Directory getCurrent(){
		return this.current;
	}
	
	
	*/
	
	
	
	
}
