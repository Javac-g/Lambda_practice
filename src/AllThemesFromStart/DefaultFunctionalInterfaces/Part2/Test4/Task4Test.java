package AllThemesFromStart.DefaultFunctionalInterfaces.Part2.Test4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import AllThemesFromStart.DefaultFunctionalInterfaces.Part2.Task4.MakeDecision;
import AllThemesFromStart.DefaultFunctionalInterfaces.Part2.Task4.Person;
import AllThemesFromStart.DefaultFunctionalInterfaces.Part2.Task4.Shop;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Task4Test {

	private static String PERSON = "AllThemesFromStart.DefaultFunctionalInterfaces.Part2.Task4.Person";
	private static String DECISION_METHOD = "AllThemesFromStart.DefaultFunctionalInterfaces.Part2.Task4.MakeDecision";
	private static String SHOP = "AllThemesFromStart.DefaultFunctionalInterfaces.Part2.Task4.Shop";

	@DisplayName("Check that class Person is present")
	@Test
	void isTypeClass() {
		try {
			Class<?> clazz = Class.forName(PERSON);
			assertTrue(clazz.getSimpleName().equals("Person"));
		} catch (ClassNotFoundException e) {
			fail("There is no Person class");
		}
	}

	@DisplayName("Check that interface MakeDecision is present")
	@Test
	void isTypeInterface() {
		try {
			Class<?> clazz = Class.forName(DECISION_METHOD);
			assertTrue(clazz.getSimpleName().equals("MakeDecision"));
			assertTrue(clazz.isInterface());
		} catch (ClassNotFoundException e) {
			fail("There is no Person class");
		}
	}

	@DisplayName("Check that a class has an appropriate method")
	@ParameterizedTest
	@MethodSource("provideDataForMethods")
	void hasTypeDeclaredMethod(String className, String method, Class[] params) {

		try {
			Class<?> clazz = Class.forName(className);

			boolean isMethod = false;
			boolean isParams = false;
			Method[] methods = clazz.getDeclaredMethods();
			for (Method m : methods) {
				if (m.getName().equals(method)) {
					isMethod = true;
					Class<?>[] types = m.getParameterTypes();
					if (Arrays.equals(types, params)) {
						isParams = true;
					}
					break;
				}
			}
			assertTrue(isMethod, "There is no such method");
			assertTrue(isParams, "List of parameters don't match with parameters in method " + method);
		} catch (ClassNotFoundException e) {
			fail("There is no " + className + " class");
		}
	}

	private static Stream<Arguments> provideDataForMethods() {
		return Stream.of(Arguments.of(DECISION_METHOD, "function", new Class[] { String.class, int.class }),
				Arguments.of(SHOP, "sale", new Class[] { String.class, int.class }));
	}

	@DisplayName("Check that 'sale' method returns int")
	@Test
	void hasMethodReturnType() {
		try {
			Class<?> clazz = Class.forName(SHOP);
			Method[] methods = clazz.getDeclaredMethods();
			for (Method method : methods) {
				if (method.getName().equals("sale")) {
					assertTrue(method.getReturnType().equals(int.class));
				}
			}
		} catch (ClassNotFoundException e) {
			fail("There is no Shop class");
		}
	}

	@DisplayName("Check that Person class has 'goShopping' field")
	@Test
	void hasTypeDeclaredField() {
		try {
			Class<?> clazz = Class.forName(PERSON);
			Field[] fields = clazz.getDeclaredFields();
			boolean isField = false;
			for (Field field : fields) {
				if ("goShopping".equals(field.getName())) {
					isField = true;
					break;
				}
			}
			assertTrue(isField, "There is no 'goShopping' field");
		} catch (ClassNotFoundException e) {
			fail("There is no Shop class");
		}
	}

	@DisplayName("Check the result of 'sale' method")
	@Test
	void isResultCorrectWithPeopleAnyProduct() {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("Olga"));
		list.add(new Person("Iryna"));
		list.add(new Person("Pavlo"));
		list.add(new Person("Oleg"));
		Person person = new Person("Oleg");
		person.goShopping = (s, n) -> {
			return n > 15;
		};
		list.add(person);
		Shop shop = new Shop();

		Iterator<Person> iterator = list.iterator();
		while (iterator.hasNext()) {
			shop.listDecisions.add(iterator.next().goShopping);
		}
		assertTrue(shop.sale("banana", 11) == 4 && shop.sale("banana", 16) == 5);
	}

	@DisplayName("Check type of 'goShopping' method")
	@Test
	void hasFieldType() {
		try {
			Class<?> clazz = Class.forName(PERSON);
			Field[] fields = clazz.getDeclaredFields();
			boolean isField = false;
			for (Field field : fields) {
				if ("goShopping".equals(field.getName())) {
					isField = true;
					assertEquals(field.getType(), MakeDecision.class);
					break;
				}
			}
			assertTrue(isField, "There is no 'goShopping' field");
		} catch (ClassNotFoundException e) {
			fail("There is no Shop class");
		}
	}

}

