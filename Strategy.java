package practice.lld.machine.behavioural;

/**
 * It is designed to provide a substitute for sub-classes
 * @author Yash
 *
 */
interface Calculator{
	int calculate(int num1, int num2);
}
class Add implements Calculator{

	@Override
	public int calculate(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}
	
}
class Substract implements Calculator{

	@Override
	public int calculate(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}
	
}
class Mod implements Calculator{

	@Override
	public int calculate(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1%num2;
	}
	
}
class Query{
	private Calculator calci;
	public Query(Calculator calci){
		this.calci = calci;
	}
	int executeQuery(int num1, int num2){
		return calci.calculate(num1, num2);
	}
}
public class Strategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Query query = new Query(new Add());
       System.out.println(query.executeQuery(91, 5));
       query = new Query(new Substract());
       System.out.println(query.executeQuery(90, 5));
       query = new Query(new Mod());
       System.out.println(query.executeQuery(100, 5));
	}

}
