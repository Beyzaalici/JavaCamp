package kodlamaioNLayeredApp.core;

public class FileLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("dosyaya giris yapildi.");
	}

}
