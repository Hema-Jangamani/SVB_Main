
public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EagerInitializedSingleton.getInstance();
		StaticBlockSingleton.getInstance();
		LazyInitializationSingleton.getInstance();
		ThreadSafeSingleton.getInstance();

	}

}
