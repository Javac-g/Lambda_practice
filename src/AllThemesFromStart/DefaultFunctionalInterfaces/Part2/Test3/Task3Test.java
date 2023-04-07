package AllThemesFromStart.DefaultFunctionalInterfaces.Part2.Test3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.function.BinaryOperator;

import AllThemesFromStart.DefaultFunctionalInterfaces.Part2.Task3.Main;
import AllThemesFromStart.DefaultFunctionalInterfaces.Part2.Task3.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Task3Test {
	private static String APP = "AllThemesFromStart.DefaultFunctionalInterfaces.Part2.Task3.Main";

	@DisplayName("Check that Main class is present")
	@Test
	void isAppTypeClass() {
		try {
			Class<?> clazz = Class.forName(APP);
			assertTrue(clazz.getSimpleName().equals("Main"));
		} catch (ClassNotFoundException e) {
			fail("There is no Main class");
		}
	}

	@DisplayName("Check that Main class has 'binaryOperator' field")
	@Test
	void hasGreetingOperatorField() {
		try {
			Class<?> clazz = Class.forName(APP);
			assertNotNull(clazz.getField("binaryOperator"));
		} catch (ClassNotFoundException e) {
			fail("There is no Main class");
		} catch (NoSuchFieldException e) {
			fail("There is no 'binaryOperator' field");
		}
	}

	@DisplayName("Check that type of 'binaryOperator' field is BinaryOperator")
	@Test
	void hasFieldType() {
		try {
			Class<?> clazz = Class.forName(APP);
			Field field = clazz.getField("binaryOperator");
			assertEquals(field.getType(), BinaryOperator.class);
		} catch (ClassNotFoundException e) {
			fail("There is no Main class");
		} catch (NoSuchFieldException e) {
			fail("There is no 'binaryOperator' field");
		}
	}

	@DisplayName("Check that 'binaryOperator' field is static")
	@Test
	void isFieldStatic() {
		try {
			Class<?> clazz = Class.forName(APP);
			Field field = clazz.getField("binaryOperator");
			assertTrue(Modifier.isStatic(field.getModifiers()));
		} catch (ClassNotFoundException e) {
			fail("There is no Main class");
		} catch (NoSuchFieldException e) {
			fail("There is no 'binaryOperator' field");
		}
	}

	@DisplayName("Check that Main class contains 'createGreetings' method")
	@Test
	void hasTypeDeclaredMethod() {
		try {
			Class<?> clazz = Class.forName(APP);
			Method[] methods = clazz.getMethods();
			boolean isMethod = false;
			for (Method method : methods) {
				if ("createGreetings".equals(method.getName())) {
					isMethod = true;
				}
			}
			assertTrue(isMethod);
		} catch (ClassNotFoundException e) {
			fail("There is no Main class");
		}
	}

	@DisplayName("Check that 'createGreetings' method returns List")
	@Test
	void hasMethodReturnType() {
		try {
			Class<?> clazz = Class.forName(APP);
			Method[] methods = clazz.getMethods();
			boolean isMethod = false;
			for (Method method : methods) {
				if ("createGreetings".equals(method.getName())) {
					assertEquals(method.getReturnType(), List.class);
					isMethod = true;
				}
			}
			assertTrue(isMethod);
		} catch (ClassNotFoundException e) {
			fail("There is no Main class");
		}
	}

	@DisplayName("Check a result of 'createGreetings' method")
	@Test
	void isResultCorrect() {
			List<String> actual = List.of("Hello Vasyl Perepichka !!!", "Hello Mariia Romanko !!!");
			List<Person> persons = List.of(new Person("Vasyl","Perepichka"), new Person("Mariia", "Romanko"));
			assertEquals(actual, Main.createGreetings(persons, Main.binaryOperator));
	}
}
