package server;

public interface CacheManager<T> {
	
	public void saveFile(String filename,T file);
	public  T loadFile(String filename); 
	public boolean isFileExist(String filename);

}
