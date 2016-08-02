

public class FileSystem {
	
	private Directory dir;
	private static FileSystem instance = null;
	
	private FileSystem(){
		this.dir = new Directory(null, "root", 0, "Rajesh");
		
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
}
