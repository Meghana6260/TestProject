package exception;

public class GetPropetyDemo {
	public static void main(String[]args) {
		String user_home=System.getProperty("user.home");
		String java_version=System.getProperty("java.version");
		String java_home=System.getProperty("java.home");
		String class_path=System.getProperty("java.class path");
		String os_name=System.getProperty("os.name");
		String user_name=System.getProperty("user.name");
		String user_dir=System.getProperty("user.dir");
		
		System.out.println("user home directory is:"+user_home);
		System.out.println("java version is:"+java_version);
		System.out.println("java home directory is:"+java_home);
		System.out.println("class path is:"+class_path);
		System.out.println("os_name is:"+os_name);
		System.out.println("user name is:"+user_name);
		System.out.println("user_dir"
				+ ""
				+ " is:"+user_dir);
		
	}

}
