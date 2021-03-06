/**
	класс реализует калькулятор
*/
public class Calculator {
	/**
		Результат вычислений
	*/
	private  int result;
	/**
	суммируем аргументы
	*/
	public void add(int ... params) {
		for (Integer param : params) {
			this.result += param;
		}
	}
	
    public void noadd(int ... params) {
		for (Integer param : params) {
			this.result -= param;
		}
	}
	
    public void mult(int ... params) {
		for (Integer param : params) {
			this.result *= param;
		}
	}	
	
  public void delen(int ... params) {
		for (Integer param : params) {
			this.result /= param;
		}
	}	
	
	public int getResult() {
		return this.result;
	}
	/**
	 очистка результата
	*/
	public void cleanResult() {
		this.result = 0;
	}
	
}