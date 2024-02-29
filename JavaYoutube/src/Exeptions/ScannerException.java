package Exeptions;

public class ScannerException extends Exception { // создаем свое исключение, наследуюясь от класса внутри джавы Exception

	public ScannerException(String description) {
		super(description);
	}

}
