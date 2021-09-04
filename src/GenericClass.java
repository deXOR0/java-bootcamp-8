
public class GenericClass<T extends Number> {
//	Number
//	1. Integer
//	2. Float
//	3. Double
	
	T value;

	public GenericClass(T value) {
		this.value = value;
	}
	
//	Wild Card
	
	public boolean absolutelyEquals(GenericClass<?> object) {
		return (Math.abs(value.doubleValue()) == Math.abs(object.value.doubleValue()));
	}

}
