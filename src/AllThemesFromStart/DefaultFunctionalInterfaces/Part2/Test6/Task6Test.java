package AllThemesFromStart.DefaultFunctionalInterfaces.Part2.Test6;

import AllThemesFromStart.DefaultFunctionalInterfaces.Part2.Task6.Main;
import AllThemesFromStart.DefaultFunctionalInterfaces.Part2.Task6.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {
	private static String MY_UTILS = "AllThemesFromStart.DefaultFunctionalInterfaces.Part2.Task6.Main";
	private static String USER = "AllThemesFromStart.DefaultFunctionalInterfaces.Part2.Task6.User";

	@DisplayName("Check that a class is present")
	@ParameterizedTest
	@MethodSource("provideClasses")
	void isTypeClass(String className, String clazz) {
		try {
			Class<?> cl = Class.forName(clazz);
			assertTrue(cl.getSimpleName().equals(className));
		} catch (ClassNotFoundException e) {
			fail("There is no " + className + " class");
		}
	}

	@DisplayName("Check that a class has an appropriate method")
	@ParameterizedTest
	@MethodSource("provideMethods")
	void hasTypeDeclaredMethod(String className, String methodName, Class<?>[] params) {
		try {
			Class<?> clazz = Class.forName(className);
			Method[] methods = clazz.getDeclaredMethods();
			boolean isMethod = false;
			for (Method method : methods) {
				if (method.getName().equals(methodName)) {
					Class<?>[] parameterTypes = method.getParameterTypes();
					if (Arrays.equals(params, parameterTypes)) {
						isMethod = true;
					}
				}
			}
			assertTrue(isMethod);
		} catch (ClassNotFoundException e) {
			fail("There is nono " + className + " class");
		}
	}

	@DisplayName("Check that User class has 'values' field")
	@Test
	void hasTypeDeclaredField() {
		try {
			Class<?> clazz = Class.forName(USER);
			assertNotNull(clazz.getDeclaredField("values"));
		} catch (ClassNotFoundException e) {
			fail("There is no User class");
		} catch (NoSuchFieldException e) {
			fail("There is no 'values' field");
		}
	}

	@DisplayName("Check that 'values' field isn't private")
	@Test
	void isFieldPrivate() {
		try {
			Class<?> clazz = Class.forName(USER);
			Field field = clazz.getDeclaredField("values");
			assertTrue(!Modifier.isPrivate(field.getModifiers()));
		} catch (ClassNotFoundException e) {
			fail("There is no User class");
		} catch (NoSuchFieldException e) {
			fail("There is no 'values' field");
		}
	}

	@DisplayName("Check the result of 'getMaxByCondition' method")
	@Test
	void isFindMaxByConditionCorrect() {
		List<Integer> list = List.of(7, -25, 23, 44, -58, 21);
		assertTrue(Main.getMaxByCondition((List<Integer>) list, n2 -> n2 % 2 == 1) == 23);
	}

	@DisplayName("Check the result of 'isGetFilteredValue' method")
	@Test
	void isGetFilterdValueCorrect() {
		User user = new User();
		user.values.add(155);
		user.values.add(128);
		user.values.add(86);
		user.values.add(123);
		user.values.add(131);
		assertTrue(user.getFilteredValue(
				(collection, predicate) -> {
					return collection.stream().filter(predicate).min(Comparator.naturalOrder()).get();
				},
				n2 -> n2 % 2 == 1) == 123);
	}

	@DisplayName("Check the result of 'isGetMaxValueByCondition' method")
	@Test
	void isGetMaxValueByConditionCorrect() {
		final User user = new User();
		user.values.add(5);
		user.values.add(8);
		user.values.add(86);
		user.values.add(144);
		user.values.add(153);
		assertTrue(user.getMaxValueByCondition(n -> n % 2 == 0) == 144);
	}

	private static Stream<Arguments> provideClasses() {
		return Stream.of(Arguments.of("Main", MY_UTILS), Arguments.of("User", USER));
	}

	private static Stream<Arguments> provideMethods() {
		return Stream.of(Arguments.of(MY_UTILS, "getMaxByCondition", new Class[] { List.class, Predicate.class }),
				Arguments.of(USER, "getFilteredValue", new Class[] { BiFunction.class, Predicate.class }),
				Arguments.of(USER, "getMaxValueByCondition", new Class[] { Predicate.class }));
	}
}
