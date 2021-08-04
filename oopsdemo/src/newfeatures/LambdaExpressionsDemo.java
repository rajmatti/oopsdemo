package newfeatures;

@FunctionalInterface
interface MyFunctionaInterface
{
	public String sayHello();
}
//FI
interface MyFunctionaInterface1
{
	public int incrementbyFive(int a);
}

interface StringConcat
{
	public String sconcat(String a ,String b);
}


public class LambdaExpressionsDemo {

	public static void main(String[] args) {
		
		//Lambda expression with no parameter
		MyFunctionaInterface msg=()-> { return "Hello from Lamda Expressons"; };
		System.out.println(msg.sayHello());
		
		//Lambda expression with single parameter 
		MyFunctionaInterface1 f=(num) -> num+5;
		System.out.println(f.incrementbyFive(20));
		
		////Lambda expression with multiple Arguments
		StringConcat s=(str1,str2) -> str1 + str2;
		System.out.println("String concat using lambda Expression");
		System.out.println(s.sconcat("Hello", "Java8"));
	}

}
